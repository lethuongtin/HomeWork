package Baii3;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student extends Person {

    private float GPA;
    private String major;

    public Student() {
    }

    public Student(float GPA, String major) {
        this.GPA = GPA;
        this.major = major;
    }

    public Student(float GPA, String major, String id, String name, Date dateOfBirth) {
        super(id, name, dateOfBirth);
        this.GPA = GPA;
        this.major = major;
    }

    public float getGPA() {
        return GPA;
    }

    public void setGPA(float GPA) {
        this.GPA = GPA;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void addStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ID: ");
        String id = sc.nextLine();
        setId(id);
        System.out.print("Nhap Ten: ");
        String name = sc.nextLine();
        setName(name);
        System.out.print("Nhap Nganh: ");
        String major = sc.nextLine();
        setMajor(major);
        System.out.print("Nhap GPA: ");
        float GPA = Float.parseFloat(sc.nextLine());
        setGPA(GPA);
        System.out.print("Nhap Ngay Sinh: ");
        String dateOfBirthString = sc.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date dateOfBirth = sdf.parse(dateOfBirthString);
            setDateOfBirth(dateOfBirth);
        } catch (Exception e) {
            System.out.println("Wrong Format!");
        }
    }

    public void updateStudent(String id) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cap nhat thong tin sinh vien:");

        System.out.println("ID: " + getId());

        System.out.print("Nhap Ten moi: ");
        String newName = sc.nextLine();
        setName(newName);

        System.out.print("Nhap Nganh moi: ");
        String newMajor = sc.nextLine();
        setMajor(newMajor);

        System.out.print("Nhap GPA moi: ");
        String newGPA = sc.nextLine();
        setGPA(Float.parseFloat(newGPA));

        System.out.print("Nhap Ngay Sinh moi: ");
        String newDOB = sc.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            setDateOfBirth(sdf.parse(newDOB));
        } catch (Exception e) {
            System.out.println("Wrong Format!");
        }
        System.out.println("Cap nhat thong tin thanh cong!");
    }

    @Override
    public void displayInfo() {
        System.out.println("Thong Tin Cua Sinh Vien: ");
        System.out.println("ID: " + this.getId());
        System.out.println("Ten: " + this.getName());
        System.out.println("GPA: " + this.getGPA());
        System.out.println("Nganh: " + this.getMajor());
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Ngay Sinh: " + sdf.format(dateOfBirth));
    }
}
