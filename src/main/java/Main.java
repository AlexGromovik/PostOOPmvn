import ru.netology.javaqa.PostOOPmvn.datasources.Post;
import ru.netology.javaqa.PostOOPmvn.datasources.FormDate;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.patronymic = "Иванович";
        post.surname = "Иванов";
        post.pasport = "4444 № 44444444";
        post.phoneNum = "+7 (999)-999-99-99";
        post.subscription = true;

        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 6;
        post.birthday.year = 1999;
    }

}