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
		
		System.out.println("Tehlike hesaplamadan önce Satranç Tahtasý yazdýrýldý!");
		myChessObj.printBoard();
		
		myChessObj.sumValues(); //Tehlikesiz toplam deðerler
		System.out.println("Tehlike hesaplamadan önce Siyahlarýn toplam deðeri :" + totalBlackValue);
		System.out.println("Tehlike hesaplamadan önce Beyazlarýn toplam deðeri :" + totalWhiteValue + "\n\n\n");
		Chess.scanForDanger(chessBoard);
		
		
		System.out.println("Tehlike altýndaki Satranç parçalarý yazdýrýldý!");
		Chess.printDangerBoard();//Tehlikelere bakýldýktan sonra toplam deðerler
		System.out.println("Tehlike hesaplama sonrasý Siyahlarýn toplam deðeri :" + totalBlackValue);
		System.out.println("Tehlike hesaplama sonrasý Beyazlarýn toplam deðeri :" + totalWhiteValue);
		
		Chess.writeToFile(totalWhiteValue,totalBlackValue);

	}

	@Override
	public void readFile() {
		//Seçilen .txt dosya içeriði chessBoard dizisine atanýyor.
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
		//Tehlike hesaplanmadan önce chessBoard ekrana yazdýrýlýyor.
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.printf(chessBoard[i][j]);
			}
			System.out.println("");

		}

	}
	
	public static void printDangerBoard() {
		//Tehlike altýndaki parçalarý görebilmek için isAlreadyDangerCheck dizisi ekrana yazdýrýlýyor.
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.printf(isAlreadyDangerCheck[i][j]);
			}
			System.out.println("");

		}

	}
	
	

	@Override
	public void sumValues() {
		//Tehlike hesaplanmadan önce dosyadan okunan tahtanýn toplam deðeri hesaplanýyor.
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				switchCase(chessBoard[i][j]);
			}
		}

	}
	
	public static void  scanForDanger(String[][] chessBoard){
		//Piyon, At ve Vezir tarafýndan oluþturulan tehlikeler hesaplanýp, tehlikesiz toplam deðerden çýkarýlýyor.
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
		//Bilgisayardan .txt dosyasýný seçiyoruz.
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
		//Tehlike hesaplanmadan önce kullanýcýdan alýnan tahtanýn toplam deðerlerini hesaplýyoruz.
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
	//Piece zaten Tehlike altýnda mý? sorusu için dummy satranç tahtasý oluþturuyoruz.
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				isAlreadyDangerCheck[i][j] = "--";
			}
		}
	}
	
	
	public static void writeToFile(double totalWhiteValue, double totalBlackValue) {
		//sonuçlar.txt dosyasý yoksa oluþturup varsa sonuçlarý içine yazýdýrýyoruz.
		try
        {
            String filePath = "sonuçlar.txt";
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

		

