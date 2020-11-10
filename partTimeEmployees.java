class partTimeEmployees extends Employee
{
    int workinghrs, rate;
    partTimeEmployees()
    {
        System.out.println("Enter Number of Working Hours:");
        workinghrs = get.nextInt();
    }
    void calculatepay()
    {
        rate = 8 * workinghrs;
    }

    void display()
    {
        System.out.println("=============================="+"\n"+"Part Time Employee Details"+"\n"+"=============================="+"\n");
        super.display();
        System.out.println("Number of Working Hours: "+workinghrs);
        System.out.println("Salary for "+workinghrs+" working hours is: $"+rate);
    }
}
