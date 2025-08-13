public class Questions {
    private int id;
    private String Question;
    private String opt1;
    private String opt2;
    private String opt3;
    private String opt4;
    private String answer;

    public Questions(String Question, String answer, int id, String opt1, String opt2, String opt3, String opt4) {
        this.Question = Question;
        this.answer = answer;
        this.id = id;
        this.opt1 = opt1;
        this.opt2 = opt2;
        this.opt3 = opt3;
        this.opt4 = opt4;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String Question) {
        this.Question = Question;
    }

    public String getOpt1() {
        return opt1;
    }

    public void setOpt1(String opt1) {
        this.opt1 = opt1;
    }

    public String getOpt2() {
        return opt2;
    }

    public void setOpt2(String opt2) {
        this.opt2 = opt2;
    }

    public String getOpt3() {
        return opt3;
    }

    public void setOpt3(String opt3) {
        this.opt3 = opt3;
    }

    public String getOpt4() {
        return opt4;
    }

    public void setOpt4(String opt4) {
        this.opt4 = opt4;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Questions{");
        sb.append("id=").append(id);
        sb.append(", Question=").append(Question);
        sb.append(", opt1=").append(opt1);
        sb.append(", opt2=").append(opt2);
        sb.append(", opt3=").append(opt3);
        sb.append(", opt4=").append(opt4);
        sb.append(", answer=").append(answer);
        sb.append('}');
        return sb.toString();
    }
    

    

}
