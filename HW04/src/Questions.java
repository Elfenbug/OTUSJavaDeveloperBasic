public class Questions {
    private String[] questions = {"Сколько гномов отправилось вместе с хоббитом Бильбо за сокровищами?\n a) 5\n b) 10\n c) 130",
            "Кем, как говорит название повести братьев Стругацких, трудно быть?\n a) магом\n b) богом\n с) Гарри Поттером\n d) человеком",
            "Наводящие ужас полуженщины - полугрифы из греческой мифологии.\n a) Гарпии\n b) Грифоны\n c) Циклопы\n d) Валькирии"};

    private String[] trueAnswers = {"b", "b", "a"};

    public String[] getQuestions() {
        return questions;
    }

    public void setQuestions(String[] questions) {
        this.questions = questions;
    }

    public String[] getTrueAnswers() {
        return trueAnswers;
    }

    public void setTrueAnswers(String[] trueAnswers) {
        this.trueAnswers = trueAnswers;
    }
}
