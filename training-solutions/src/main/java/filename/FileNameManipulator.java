package filename;

public class FileNameManipulator {

    public char findLastCharacter(String str) {
        str = str.strip();
        return str.charAt(str.length()-1);
    }

    public String findFileExtension(String fileName) {
        int i= fileName.lastIndexOf(".");
        return fileName.substring(i+1);
    }

    public boolean identifyFilesByExtension(String ext, String fileName) {
        return fileName.endsWith(ext);
    }

    public boolean compareFilesByName(String searchedFileName, String actualFileName) {
        return searchedFileName.equals(actualFileName);
    }

    public String changeExtensionToLowerCase(String fileName) {
        String lowerCasedExt = findFileExtension(fileName).toLowerCase();
        int i= fileName.lastIndexOf(".");
        fileName = fileName.substring(0,i+1);
        return fileName+lowerCasedExt;

    }

    public String replaceStringPart(String fileName, String present, String target) {
        return fileName.replace(present,target);
    }

    public static void main(String[] args) {
        FileNameManipulator fileNameManipulator = new FileNameManipulator();

        System.out.println(fileNameManipulator.findLastCharacter("valamiszoveg  "));
        System.out.println(fileNameManipulator.findFileExtension("szakdolgozat.pdf"));

        System.out.println(fileNameManipulator.identifyFilesByExtension("pdf","szakdolgozat.pdf"));

        System.out.println(fileNameManipulator.compareFilesByName("szakdolgozat.pdf","Szakdolgozat.pdf"));
        System.out.println(fileNameManipulator.compareFilesByName("szakdolgozat.pdf","szakdolgozat.pdf"));

        System.out.println(fileNameManipulator.changeExtensionToLowerCase("bestselfipicture.JPEG"));

        System.out.println(fileNameManipulator.replaceStringPart("szakdolgozat.pdf", "dolgozat","dolgozat_2021"));
    }
}
