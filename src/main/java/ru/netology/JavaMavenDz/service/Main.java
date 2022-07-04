package ru.netology.JavaMavenDz.service;

public class Main {
    public static void main (String[] args) {
        SQRService service = new SQRService();

        int actual = service.cvadrSQRS(200,300);
        System.out.println(actual);
    }
}
