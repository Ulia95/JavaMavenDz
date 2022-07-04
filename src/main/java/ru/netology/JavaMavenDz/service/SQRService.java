package ru.netology.JavaMavenDz.service;

public class SQRService {

    public int cvadrSQRS (int min, int max) {

        int x = 99;
        int y = 0;
         for (int i = 10; i <= x; i++) {
             if (i * i >= min && i * i <= max){
                 y = y++;
             }
         }
         return y;
    }
}
