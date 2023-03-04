class Student {
    String name;
    int group;
    int assessment;

    void displayInfo() {
        System.out.printf("Name:%s \tGroup:%d\t  Assessment:%s\n", name, group, assessment);
    }

    Student(String n, int g, int as) {
        this.name = n;
        this.group = g;
        this.assessment = as;

    }
}










