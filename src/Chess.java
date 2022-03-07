import java.awt.FileDialog;
import java.awt.Frame;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Scanner;

public class Chess implements IChessBoardActions {

	static double totalWhiteValue = 0;
	static double totalBlackValue = 0;
	static String[][] chessBoard = new String[8][8];
	static String[][] isAlreadyDangerCheck = new String [8][8];
	static Pawn myPawn = new Pawn();
	static Knight myKnight = new Knight();
	static Quenn myQuenn = new Quenn();
	static String fileName;
	

	static HashMap<Integer, String> chessBoardMap = new HashMap<Integer, String>();

	public static void main(String[] args) throws FileNotFoundException {
		
		Chess myChessObj = new Chess();
		Chess.createDummyBoard();
		myChessObj.readFile();
		
		System.out.println("Tehlike hesaplamadan �nce Satran� Tahtas� yazd�r�ld�!");
		myChessObj.printBoard();
		
		myChessObj.sumValues(); //Tehlikesiz toplam de�erler
		System.out.println("Tehlike hesaplamadan �nce Siyahlar�n toplam de�eri :" + totalBlackValue);
		System.out.println("Tehlike hesaplamadan �nce Beyazlar�n toplam de�eri :" + totalWhiteValue + "\n\n\n");
		Chess.scanForDanger(chessBoard);
		
		
		System.out.println("Tehlike alt�ndaki Satran� par�alar� yazd�r�ld�!");
		Chess.printDangerBoard();//Tehlikelere bak�ld�ktan sonra toplam de�erler
		System.out.println("Tehlike hesaplama sonras� Siyahlar�n toplam de�eri :" + totalBlackValue);
		System.out.println("Tehlike hesaplama sonras� Beyazlar�n toplam de�eri :" + totalWhiteValue);
		
		Chess.writeToFile(totalWhiteValue,totalBlackValue);

	}

	@Override
	public void readFile() {
		//Se�ilen .txt dosya i�eri�i chessBoard dizisine atan�yor.
		Scanner sc = null;
		try {
			sc = new Scanner(choseTextFile());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while (sc.hasNextLine()) {
			for (int i = 0; i < chessBoard.length; i++) {
				String[] line = sc.nextLine().trim().split(" ");
				for (int j = 0; j < line.length; j++) {
					chessBoard[i][j] = line[j];

				}
			}

		}

	}

	@Override
	public void printBoard() {
		//Tehlike hesaplanmadan �nce chessBoard ekrana yazd�r�l�yor.
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.printf(chessBoard[i][j]);
			}
			System.out.println("");

		}

	}
	
	public static void printDangerBoard() {
		//Tehlike alt�ndaki par�alar� g�rebilmek i�in isAlreadyDangerCheck dizisi ekrana yazd�r�l�yor.
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.printf(isAlreadyDangerCheck[i][j]);
			}
			System.out.println("");

		}

	}
	
	

	@Override
	public void sumValues() {
		//Tehlike hesaplanmadan �nce dosyadan okunan tahtan�n toplam de�eri hesaplan�yor.
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				switchCase(chessBoard[i][j]);
			}
		}

	}
	
	public static void  scanForDanger(String[][] chessBoard){
		//Piyon, At ve Vezir taraf�ndan olu�turulan tehlikeler hesaplan�p, tehlikesiz toplam de�erden ��kar�l�yor.
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if(chessBoard[i][j].equals("pb")){
				double dangerValue = myPawn.createDanger(chessBoard[i][j], chessBoard, i, j, isAlreadyDangerCheck);
				totalBlackValue -= dangerValue;
				}else if (chessBoard[i][j].equals("ps")){
				double dangerValue = myPawn.createDanger(chessBoard[i][j], chessBoard, i, j, isAlreadyDangerCheck);
				totalWhiteValue -= dangerValue;
				}else if (chessBoard[i][j].equals("ab")){
				double dangerValue = myKnight.createDanger(chessBoard[i][j], chessBoard, i, j, isAlreadyDangerCheck);
				totalBlackValue -= dangerValue;
				}else if (chessBoard[i][j].equals("as")) {
				double dangerValue = myKnight.createDanger(chessBoard[i][j], chessBoard, i, j, isAlreadyDangerCheck);
				totalWhiteValue -= dangerValue;
				}else if (chessBoard[i][j].equals("vb")){
				double dangerValue = myQuenn.createDanger(chessBoard[i][j], chessBoard, i, j, isAlreadyDangerCheck);
				totalBlackValue -= dangerValue;
				}else if(chessBoard[i][j].equals("vs")){
				double dangerValue = myQuenn.createDanger(chessBoard[i][j], chessBoard, i, j, isAlreadyDangerCheck);
				totalWhiteValue -= dangerValue;
				}
			}
		}
		
		
	}

	private static File choseTextFile() {
		//Bilgisayardan .txt dosyas�n� se�iyoruz.
		FileDialog dialog = new FileDialog((Frame) null, "Select Chess File");
		dialog.setMode(FileDialog.LOAD);
		dialog.setVisible(true);
		File[] file = dialog.getFiles();
		String[] names = new String[dialog.getFiles().length];
		for (int i = 0; i < dialog.getFiles().length; i++) {
		   names[i] = dialog.getFiles()[i].getName();
		   fileName = names[i];
		}
		
		return file[0];
	}

	public static void switchCase(String string) {
		//Tehlike hesaplanmadan �nce kullan�c�dan al�nan tahtan�n toplam de�erlerini hesapl�yoruz.
		switch (string) {
		case "pb":
			totalWhiteValue += 1;
			break;
		case "kb":
			totalWhiteValue += 5;
			break;
		case "ab":
			totalWhiteValue += 3;
			break;
		case "fb":
			totalWhiteValue += 3;
			break;
		case "vb":
			totalWhiteValue += 9;
			break;
		case "sb":
			totalWhiteValue += 100;
			break;
		case "ps":
			totalBlackValue += 1;
			break;
		case "ks":
			totalBlackValue += 5;
			break;
		case "as":
			totalBlackValue += 3;
			break;
		case "fs":
			totalBlackValue += 3;
			break;
		case "vs":
			totalBlackValue += 9;
			break;
		case "ss":
			totalBlackValue += 100;
			break;
		case "--":
			break;
		}
	}

	
	public static void createDummyBoard() {
	//Piece zaten Tehlike alt�nda m�? sorusu i�in dummy satran� tahtas� olu�turuyoruz.
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				isAlreadyDangerCheck[i][j] = "--";
			}
		}
	}
	
	
	public static void writeToFile(double totalWhiteValue, double totalBlackValue) {
		//sonu�lar.txt dosyas� yoksa olu�turup varsa sonu�lar� i�ine yaz�d�r�yoruz.
		try
        {
            String filePath = "sonu�lar.txt";
            FileWriter fw = new FileWriter(filePath, true);
            String lineToAppend = "\n" + fileName +"      "+"Siyah: " +totalBlackValue+ "    Beyaz: "+totalWhiteValue + " \n";
            fw.write(lineToAppend);
            fw.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
     }
		      
		
	}

		

