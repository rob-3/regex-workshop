public static Student makeStudent() {
    String tempName = prompt("Name of Student: ");
    String tempId = prompt("ID: ");
    double tempGpa = Double.parseDouble(prompt("GPA: "));
    int tempCreditHours = Integer.parseInt(prompt("Credit Hours: ")),
    return new Student(tempName, tempId, tempGpa, tempCreditHours);
} 
