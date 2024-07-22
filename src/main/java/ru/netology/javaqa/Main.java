package ru.netology.javaqa;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
        Post post = new Post();
        post.birthday = new FormDate();

        post.birthday.day = 13;
        post.birthday.month = 1;
        post.birthday.year = 1990;


        post.name = "Иван";
        post.surname = "Иванов";
        post.patronymic = "Иванович";
        post.passport = "1111 № 11111111";
        post.phone = "+7 (777)-777-77-77";
        post.subscription = true;


    }

    private static class birthday {
    }
}

