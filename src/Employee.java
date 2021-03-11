// Task 6
class Employee {
    private String name;
    private String position;
    private int age;
    private int rank;
    public Employee() {
        this.name = null;
        this.position = null;
        this.age = 0;
        this.rank = 0;
    }
    public Employee(String name,String position,int age,int rank) {
        this.name = name;
        this.position = position;
        this.age = age;
        this.rank = rank;
    }

    @Override
    // Без симметрии и транзитивности
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return name.equals(employee.name) && position.equals(employee.position);
    }



    public static void main(String[] args){


        Employee employee1=new Employee("Igor","Engineer",37,7);
        Employee employee2=new Employee("Olga","Engineer",30,7);
        Employee employee5=new Employee("Igor","Engineer",23,9);

        System.out.println(employee1.equals(employee5));
        System.out.println(employee1.equals(employee2));

    }
}
