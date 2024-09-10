package abiturient;

public class Abitura implements Comparable<Abitura>{
    private int id;
    private String surname, name, second_name;
    private String adress;
    private String phone_num;
    private double avarage_score;

    //Конструктор
    public Abitura(int id, String surname, String name, String second_name, String adress, String phone_num, double avarage_score){
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.second_name = second_name;
        this.adress = adress;
        this.phone_num = phone_num;
        this.avarage_score = avarage_score;
    }

    //Методи доступу
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getSurname(){
        return this.surname;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getSecondName(){
        return this.second_name;
    }
    public void setSecondName(String second_name){
        this.second_name = second_name;
    }

    public String getAdress(){
        return this.adress;
    }
    public void setAdress(String adress){
        this.adress = adress;
    }

    public String getPhoneNum(){
        return this.phone_num;
    }
    public void setPhoneNum(String phone_num){
        this.phone_num = phone_num;
    }

    public double getAvarageScore() {
        return this.avarage_score;
    }
    public void setAvarageScore(double avarage_score){
        this.avarage_score = avarage_score;
    }

    public String idToString(){
        return "ID: " + id;
    }
    public String surnameToString(){
        return "Surname: " + surname;
    }
    public String nameToString(){
        return "Name: " + name;
    }
    public String secondNameToString(){
        return "Second Name: " + second_name;
    }
    public String adressToString(){
        return "Adress: " + adress;
    }
    public String phoneNumToString(){
        return "Phone: " + phone_num;
    }
    public String avarageScoreToString(){
        return "Avarage Score: " + avarage_score;
    }

    public  String toString(){
        return idToString() + "\n" +
                surnameToString() + "\n" +
                nameToString() + "\n" +
                secondNameToString() + "\n" +
                adressToString() + "\n" +
                phoneNumToString() + "\n" +
                avarageScoreToString() + "\n";
    }

    @Override
    public int compareTo(Abitura other) {
        return Double.compare(other.avarage_score, this.avarage_score);
    }
}
