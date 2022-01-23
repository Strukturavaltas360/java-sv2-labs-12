package streamsalgorithms;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Employee {
    private String name;
    private int yearOfBirth;

    public Employee(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return yearOfBirth == employee.yearOfBirth;
    }

    @Override
    public int hashCode() {
        return Objects.hash(yearOfBirth);
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList(Arrays.asList(new Employee("András", 1984),
                new Employee("Béla", 1991),
                new Employee("Gizella", 1980),
                new Employee("Andrea", 1997),
                new Employee("Marcell", 2000),
                new Employee("Örs", 1979)));

        int sumYearOfBirth =
                employees.stream()
                        .mapToInt(employee -> employee.yearOfBirth)
                        .sum();
        System.out.println("Sum of year of births: " + sumYearOfBirth);

        int sumOfAges =
                employees.stream()
                        .mapToInt(employee -> LocalDate.now().getYear() - employee.yearOfBirth)
                        .sum();
        System.out.println("Sum of ages: " + sumOfAges);

        Long numberOfEmployees =
                employees.stream()
                        .count();
        System.out.println("Number of employees: " + numberOfEmployees);

        Long numberOfEmployeesBirthBefore1990 =
                employees.stream()
                        .filter(employee -> employee.yearOfBirth < 1990)
                        .count();
        System.out.println("Number of employees birth before 1990: " + numberOfEmployeesBirthBefore1990);

        int yearOfOldestEmployeesBirth =
                employees.stream()
                        .mapToInt(employee -> employee.yearOfBirth)
                        .min()
                        .orElseThrow(() -> new IllegalArgumentException("Empty list"));
        System.out.println("Oldest employees year of birth: " + yearOfOldestEmployeesBirth);

        String nameOfOldest = employees.stream()
                .sorted(new Comparator<Employee>() {
                    @Override
                    public int compare(Employee o1, Employee o2) {
                        return o1.yearOfBirth - o2.yearOfBirth;
                    }
                })
                .map(employee -> employee.name)
                .findFirst().orElseThrow(() -> new IllegalArgumentException("Empty list"));
        System.out.println("Oldest employees name: " + nameOfOldest);

        boolean b = employees.stream().allMatch(employee -> employee.
                yearOfBirth < 1980);
        System.out.println(b);


        List<Employee> employeesBefore1900 =

                employees.stream()
                        .filter(employee -> employee.yearOfBirth < 1990)
                        .collect(Collectors.toList());
        System.out.println("Number of employees: " + employeesBefore1900);

        List<String> namesOfAll =
                employees.stream()
                        .map(employee -> employee.name)
                        .collect(Collectors.toList());
        System.out.println("Number of employees: " + namesOfAll);

        List<String> namesOfBirthBefore1990 =
                employees.stream()
                        .filter(employee -> employee.yearOfBirth < 1990)
                        .map(employee -> employee.name)
                        .collect(Collectors.toList());
        System.out.println("Number of employees: " + namesOfBirthBefore1990);


    }
}
