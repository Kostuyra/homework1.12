package pro.sky.java.course1.homework12;

public class Main {
	public static void main(String[] args) {
		Author tolstoyL = new Author("Лев","Толстой");
		Author sholokhovM = new Author("Михаил", "Шолохов");
		Book annaKarenina = new Book("Анна Каренина",tolstoyL,1878);
		Book tikhiyDon = new Book("Тихий Дон",sholokhovM,1940);

		tikhiyDon.setYearPublication(1942);
	}

}
