package OOP;

public class Main {

    public static void main(String[] args) {

        ageFilter();
    }

    static void ageFilter(){
        Employee[] employee = new Employee[5];
        employee[0] = new Employee("Ivanov Ivan","Engineer","ivivan@mailbox.com",892312312,50000,30);
        employee[1] = new Employee("Smirnov Alex","Manager","smirnovalex@mail.com",899918564,40000,45);
        employee[2] = new Employee("Sidorova Anna","Secretary","SidorovaA@bk.com",87631528,30000, 25);
        employee[3] = new Employee("Volkov Semen","Cleaner","VolkovS@gm.com",877736541, 15000,47);
        employee[4] = new Employee("Titova Liza", "Designer","titleL@mail.com",892455573, 45000,41);

        for(int i = 0; i < employee.length;i++){
            if(employee[i].getAge() > 40){
                employee[i].fullInfo();
                System.out.println();
            }
        }
    }
}
