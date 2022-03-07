
public class Knight extends ChessPieces implements ICreateDanger {
	
	/*
	 * Atlarýn oluþturduðu tehlikeleri ve tehlike altýndaki parçalarýn deðerlerinin yarýsýný geri döndürüyoruz.
	 * Bir parça tehlike altýnda ise bulunduðu index, isAlreadyDangerCheck dizisinde iþaretleniyor ve baþka bir Piyon, At veya Vezir tarafýndan 2. kez tehlike altýna sokulmuyor.
	 * Bu kontrol bir parçanýn deðerini birden fazla kaybetmemesi için gerekli
	 * */

	@Override
	public double createDanger(String chessPiece, String[][] chessBoard, int i, int j, String[][] isAlreadyDangerCheck) {
		double totalDangerValue = 0;

		if (chessPiece.equals("ab")) {
			if ((i - 1) >= 0 && (j + 2) <= 7 && chessBoard[i - 1][j + 2].equals("ps") && isAlreadyDangerCheck[i-1][j+2].equals("--")) {
				totalDangerValue += 0.5;
				isAlreadyDangerCheck[i-1][j+2] = "ps";
			}
			if ((i - 2) >= 0 && (j + 1) <= 7 && chessBoard[i - 2][j + 1].equals("ps") && isAlreadyDangerCheck[i-2][j+1].equals("--")) {
				totalDangerValue += 0.5;
				isAlreadyDangerCheck[i-2][j+1] = "ps";
			}
			if ((i - 2) >= 0 && (j - 1) >= 0 && chessBoard[i - 2][j - 1].equals("ps") && isAlreadyDangerCheck[i-2][j-1].equals("--")) {
				totalDangerValue += 0.5;
				isAlreadyDangerCheck[i-2][j-1] = "ps";
			}
			if ((i - 1) >= 0 && (j - 2) >= 0 && chessBoard[i - 1][j - 2].equals("ps") && isAlreadyDangerCheck[i-1][j-2].equals("--")) {
				totalDangerValue += 0.5;
				isAlreadyDangerCheck[i-1][j-2] = "ps";
			}
			if ((i + 1) <= 7 && (j - 2) >= 0 && chessBoard[i + 1][j - 2].equals("ps") && isAlreadyDangerCheck[i+1][j-2].equals("--")) {
				totalDangerValue += 0.5;
				isAlreadyDangerCheck[i+1][j-2] = "ps";
			}
			if ((i + 2) <= 7 && (j - 1) >= 0 && chessBoard[i + 2][j - 1].equals("ps") && isAlreadyDangerCheck[i+2][j-1].equals("--")) {
				totalDangerValue += 0.5;
				isAlreadyDangerCheck[i+2][j-1] = "ps";
			}
			if ((i + 2) <= 7 && (j + 1) <= 7 && chessBoard[i + 2][j + 1].equals("ps") && isAlreadyDangerCheck[i+2][j+1].equals("--")) {
				totalDangerValue += 0.5;
				isAlreadyDangerCheck[i+2][j+1] = "ps";
			}
			if ((i + 1) <= 7 && (j + 2) <= 7 && chessBoard[i + 1][j + 2].equals("ps") && isAlreadyDangerCheck[i+1][j+2].equals("--")) {
				totalDangerValue += 0.5;
				isAlreadyDangerCheck[i+1][j+2] = "ps";
			}

		} else if (chessPiece.equals("as")) {
			if ((i - 1) >= 0 && (j + 2) <= 7 && chessBoard[i - 1][j + 2].equals("pb") && isAlreadyDangerCheck[i-1][j+2].equals("--")) {
				totalDangerValue += 0.5;
				isAlreadyDangerCheck[i-1][j+2] = "pb";
			}
			if ((i - 2) >= 0 && (j + 1) <= 7 && chessBoard[i - 2][j + 1].equals("pb") && isAlreadyDangerCheck[i-2][j+1].equals("--")) {
				totalDangerValue += 0.5;
				isAlreadyDangerCheck[i-2][j+1] = "pb";
			}
			if ((i - 2) >= 0 && (j - 1) >= 0 && chessBoard[i - 2][j - 1].equals("pb") && isAlreadyDangerCheck[i-2][-1].equals("--")) {
				totalDangerValue += 0.5;
				isAlreadyDangerCheck[i-2][-1] = "pb";
			}
			if ((i - 1) >= 0 && (j - 2) >= 0 && chessBoard[i - 1][j - 2].equals("pb") && isAlreadyDangerCheck[i-1][j-2].equals("--")) {
				totalDangerValue += 0.5;
				isAlreadyDangerCheck[i-1][j-2] = "pb";
			}
			if ((i + 1) <= 7 && (j - 2) >= 0 && chessBoard[i + 1][j - 2].equals("pb") && isAlreadyDangerCheck[i+1][j-2].equals("--")) {
				totalDangerValue += 0.5;
				isAlreadyDangerCheck[i+1][j-2] = "pb";
			}
			if ((i + 2) <= 7 && (j - 1) >= 0 && chessBoard[i + 2][j - 1].equals("pb") && isAlreadyDangerCheck[i+2][j-1].equals("--")) {
				totalDangerValue += 0.5;
				isAlreadyDangerCheck[i+2][j-1] = "pb";
			}
			if ((i + 2) <= 7 && (j + 1) <= 7 && chessBoard[i + 2][j + 1].equals("pb") && isAlreadyDangerCheck[i+2][j+1].equals("--")) {
				totalDangerValue += 0.5;
				isAlreadyDangerCheck[i+2][j+1] = "pb";
			}
			if ((i + 1) <= 7 && (j + 2) <= 7 && chessBoard[i + 1][j + 2].equals("pb") && isAlreadyDangerCheck[i+1][j+2].equals("--")) {
				totalDangerValue += 0.5;
				isAlreadyDangerCheck[i+1][j+2] = "pb";
			}
		}
		if (chessPiece.equals("ab")) {

			if ((i - 1) >= 0 && (j + 2) <= 7 && chessBoard[i - 1][j + 2].equals("as") && isAlreadyDangerCheck[i-1][j+2].equals("--")) {
				totalDangerValue += 1.5;
				isAlreadyDangerCheck[i-1][j+2] = "as";
			}
			if ((i - 2) >= 0 && (j + 1) <= 7 && chessBoard[i - 2][j + 1].equals("as") && isAlreadyDangerCheck[i-2][j+1].equals("--")) {
				totalDangerValue += 1.5;
				isAlreadyDangerCheck[i-2][j+1] = "as";
			}
			if ((i - 2) >= 0 && (j - 1) >= 0 && chessBoard[i - 2][j - 1].equals("as") && isAlreadyDangerCheck[i-2][j-1].equals("--")) {
				totalDangerValue += 1.5;
				isAlreadyDangerCheck[i-2][j-1] = "as";
			}
			if ((i - 1) >= 0 && (j - 2) >= 0 && chessBoard[i - 1][j - 2].equals("as") && isAlreadyDangerCheck[i-1][j-2].equals("--")) {
				totalDangerValue += 1.5;
				isAlreadyDangerCheck[i-1][j-2] = "as";
			}
			if ((i + 1) <= 7 && (j - 2) >= 0 && chessBoard[i + 1][j - 2].equals("as") && isAlreadyDangerCheck[i+1][j-2].equals("--")) {
				totalDangerValue += 1.5;
				isAlreadyDangerCheck[i+1][j-2] = "as";
			}
			if ((i + 2) <= 7 && (j - 1) >= 0 && chessBoard[i + 2][j - 1].equals("as") && isAlreadyDangerCheck[i+2][j-1].equals("--")) {
				totalDangerValue += 1.5;
				isAlreadyDangerCheck[i+2][j-1] = "as";
			}
			if ((i + 2) <= 7 && (j + 1) <= 7 && chessBoard[i + 2][j + 1].equals("as") && isAlreadyDangerCheck[i+2][j+1].equals("--")) {
				totalDangerValue += 1.5;
				isAlreadyDangerCheck[i+2][j+1] = "as";
			}
			if ((i + 1) <= 7 && (j + 2) <= 7 && chessBoard[i + 1][j + 2].equals("as") && isAlreadyDangerCheck[i+1][j+2].equals("--")) {
				totalDangerValue += 1.5;
				isAlreadyDangerCheck[i+1][j+2] = "as";
			}
		} else if (chessPiece.equals("as")) {
			if ((i - 1) >= 0 && (j + 2) <= 7 && chessBoard[i - 1][j + 2].equals("ab") && isAlreadyDangerCheck[i-1][j+2].equals("--")) {
				totalDangerValue += 1.5;
				isAlreadyDangerCheck[i-1][j+2] = "ab";
			}
			if ((i - 2) >= 0 && (j + 1) <= 7 && chessBoard[i - 2][j + 1].equals("ab") && isAlreadyDangerCheck[i-2][j+1].equals("--")) {
				totalDangerValue += 1.5;
				isAlreadyDangerCheck[i-2][j+1] = "ab";
			}
			if ((i - 2) >= 0 && (j - 1) >= 0 && chessBoard[i - 2][j - 1].equals("ab") && isAlreadyDangerCheck[i-2][j-1].equals("--")) {
				totalDangerValue += 1.5;
				isAlreadyDangerCheck[i-2][j-1] = "ab";
			}
			if ((i - 1) >= 0 && (j - 2) >= 0 && chessBoard[i - 1][j - 2].equals("ab") && isAlreadyDangerCheck[i-1][j-2].equals("--")) {
				totalDangerValue += 1.5;
				isAlreadyDangerCheck[i-1][j-2] = "ab";
			}
			if ((i + 1) <= 7 && (j - 2) >= 0 && chessBoard[i + 1][j - 2].equals("ab") && isAlreadyDangerCheck[i+1][j-2].equals("--")) {
				totalDangerValue += 1.5;
				isAlreadyDangerCheck[i+1][j-2] = "ab";
			}
			if ((i + 2) <= 7 && (j - 1) >= 0 && chessBoard[i + 2][j - 1].equals("ab") && isAlreadyDangerCheck[i+2][j-1].equals("--")) {
				totalDangerValue += 1.5;
				isAlreadyDangerCheck[i+2][j-1] = "ab";
			}
			if ((i + 2) <= 7 && (j + 1) <= 7 && chessBoard[i + 2][j + 1].equals("ab") && isAlreadyDangerCheck[i+2][j+1].equals("--")) {
				totalDangerValue += 1.5;
				isAlreadyDangerCheck[i+2][j+1] = "ab";
			}
			if ((i + 1) <= 7 && (j + 2) <= 7 && chessBoard[i + 1][j + 2].equals("ab") && isAlreadyDangerCheck[i+1][j+2].equals("--")) {
				totalDangerValue += 1.5;
				isAlreadyDangerCheck[i+1][j+2] = "ab";
			}
		} 
		if (chessPiece.equals("ab")) {
			if ((i - 1) >= 0 && (j + 2) <= 7 && chessBoard[i - 1][j + 2].equals("fs") && isAlreadyDangerCheck[i-1][j+2].equals("--")) {
				totalDangerValue += 1.5;
				isAlreadyDangerCheck[i-1][j+2] = "fs";
			}
			if ((i - 2) >= 0 && (j + 1) <= 7 && chessBoard[i - 2][j + 1].equals("fs") && isAlreadyDangerCheck[i-2][j+1].equals("--")) {
				totalDangerValue += 1.5;
				isAlreadyDangerCheck[i-2][j+1] = "fs";
			}
			if ((i - 2) >= 0 && (j - 1) >= 0 && chessBoard[i - 2][j - 1].equals("fs") && isAlreadyDangerCheck[i-2][j-1].equals("--")) {
				totalDangerValue += 1.5;
				isAlreadyDangerCheck[i-2][j-1] = "fs";
			}
			if ((i - 1) >= 0 && (j - 2) >= 0 && chessBoard[i - 1][j - 2].equals("fs") && isAlreadyDangerCheck[i-1][j-2].equals("--")) {
				totalDangerValue += 1.5;
				isAlreadyDangerCheck[i-1][j-2] = "fs";
			}
			if ((i + 1) <= 7 && (j - 2) >= 0 && chessBoard[i + 1][j - 2].equals("fs") && isAlreadyDangerCheck[i+1][j-2].equals("--")) {
				totalDangerValue += 1.5;
				isAlreadyDangerCheck[i+1][j-2] = "fs";
			}
			if ((i + 2) <= 7 && (j - 1) >= 0 && chessBoard[i + 2][j - 1].equals("fs") && isAlreadyDangerCheck[i+2][j-1].equals("--")) {
				totalDangerValue += 1.5;
				isAlreadyDangerCheck[i+2][j-1] = "fs";
			}
			if ((i + 2) <= 7 && (j + 1) <= 7 && chessBoard[i + 2][j + 1].equals("fs") && isAlreadyDangerCheck[i+2][j+1].equals("--")) {
				totalDangerValue += 1.5;
				isAlreadyDangerCheck[i+2][j+1] = "fs";
			}
			if ((i + 1) <= 7 && (j + 2) <= 7 && chessBoard[i + 1][j + 2].equals("fs") && isAlreadyDangerCheck[i+1][j+2].equals("--")) {
				totalDangerValue += 1.5;
				isAlreadyDangerCheck[i+1][j+2] = "fs";
			}
		} else if (chessPiece.equals("as")) {
			if ((i - 1) >= 0 && (j + 2) <= 7 && chessBoard[i - 1][j + 2].equals("fb") && isAlreadyDangerCheck[i-1][j+2].equals("--")) {
				totalDangerValue += 1.5;
				isAlreadyDangerCheck[i-1][j+2] = "fb";
			}
			if ((i - 2) >= 0 && (j + 1) <= 7 && chessBoard[i - 2][j + 1].equals("fb") && isAlreadyDangerCheck[i-2][j+1].equals("--")) {
				totalDangerValue += 1.5;
				isAlreadyDangerCheck[i-2][j+1] = "fb";
			}
			if ((i - 2) >= 0 && (j - 1) >= 0 && chessBoard[i - 2][j - 1].equals("fb") && isAlreadyDangerCheck[i-2][j-1].equals("--")) {
				totalDangerValue += 1.5;
				isAlreadyDangerCheck[i-2][j-1] = "fb";
			}
			if ((i - 1) >= 0 && (j - 2) >= 0 && chessBoard[i - 1][j - 2].equals("fb") && isAlreadyDangerCheck[i-1][j-2].equals("--")) {
				totalDangerValue += 1.5;
				isAlreadyDangerCheck[i-1][j-2] = "fb";
			}
			if ((i + 1) <= 7 && (j - 2) >= 0 && chessBoard[i + 1][j - 2].equals("fb") && isAlreadyDangerCheck[i+1][j-2].equals("--")) {
				totalDangerValue += 1.5;
				isAlreadyDangerCheck[i+1][j-2] = "fb";
			}
			if ((i + 2) <= 7 && (j - 1) >= 0 && chessBoard[i + 2][j - 1].equals("fb") && isAlreadyDangerCheck[i+2][j-1].equals("--")) {
				totalDangerValue += 1.5;
				isAlreadyDangerCheck[i+2][j-1] = "fb";
			}
			if ((i + 2) <= 7 && (j + 1) <= 7 && chessBoard[i + 2][j + 1].equals("fb") && isAlreadyDangerCheck[i+2][j+1].equals("--")) {
				totalDangerValue += 1.5;
				isAlreadyDangerCheck[i+2][j+1] = "fb";
			}
			if ((i + 1) <= 7 && (j + 2) <= 7 && chessBoard[i + 1][j + 2].equals("fb") && isAlreadyDangerCheck[i+1][j+2].equals("--")) {
				totalDangerValue += 1.5;
				isAlreadyDangerCheck[i+1][j+2] = "fb";
			}
		}
		if (chessPiece.equals("ab")) {
			if ((i - 1) >= 0 && (j + 2) <= 7 && chessBoard[i - 1][j + 2].equals("ks") && isAlreadyDangerCheck[i-1][j+2].equals("--")) {
				totalDangerValue += 2.5;
				isAlreadyDangerCheck[i-1][j+2] = "ks";
			}
			if ((i - 2) >= 0 && (j + 1) <= 7 && chessBoard[i - 2][j + 1].equals("ks") && isAlreadyDangerCheck[i-2][j+1].equals("--")) {
				totalDangerValue += 2.5;
				isAlreadyDangerCheck[i-2][j+1] = "ks";
			}
			if ((i - 2) >= 0 && (j - 1) >= 0 && chessBoard[i - 2][j - 1].equals("ks") && isAlreadyDangerCheck[i-2][j-1].equals("--")) {
				totalDangerValue += 2.5;
				isAlreadyDangerCheck[i-2][j-1] = "ks";
			}
			if ((i - 1) >= 0 && (j - 2) >= 0 && chessBoard[i - 1][j - 2].equals("ks") && isAlreadyDangerCheck[i-1][j-2].equals("--")) {
				totalDangerValue += 2.5;
				isAlreadyDangerCheck[i-1][j-2] = "ks";
			}
			if ((i + 1) <= 7 && (j - 2) >= 0 && chessBoard[i + 1][j - 2].equals("ks") && isAlreadyDangerCheck[i+1][j-2].equals("--")) {
				totalDangerValue += 2.5;
				isAlreadyDangerCheck[i+1][j-2] = "ks";
			}
			if ((i + 2) <= 7 && (j - 1) >= 0 && chessBoard[i + 2][j - 1].equals("ks") && isAlreadyDangerCheck[i+2][j-1].equals("--")) {
				totalDangerValue += 2.5;
				isAlreadyDangerCheck[i+2][j-1] = "ks";
			}
			if ((i + 2) <= 7 && (j + 1) <= 7 && chessBoard[i + 2][j + 1].equals("ks") && isAlreadyDangerCheck[i+2][j+1].equals("--")) {
				totalDangerValue += 2.5;
				isAlreadyDangerCheck[i+2][j+1] = "ks";
			}
			if ((i + 1) <= 7 && (j + 2) <= 7 && chessBoard[i + 1][j + 2].equals("ks") && isAlreadyDangerCheck[i+1][j+2].equals("--")) {
				totalDangerValue += 2.5;
				isAlreadyDangerCheck[i+1][j+2] = "ks";
			}
		} else if (chessPiece.equals("as")) {
			if ((i - 1) >= 0 && (j + 2) <= 7 && chessBoard[i - 1][j + 2].equals("kb") && isAlreadyDangerCheck[i-1][j+2].equals("--")) {
				totalDangerValue += 2.5;
				isAlreadyDangerCheck[i-1][j+2] = "kb";
			}
			if ((i - 2) >= 0 && (j + 1) <= 7 && chessBoard[i - 2][j + 1].equals("kb") && isAlreadyDangerCheck[i-2][j+1].equals("--")) {
				totalDangerValue += 2.5;
				isAlreadyDangerCheck[i-2][j+1] = "kb";
			}
			if ((i - 2) >= 0 && (j - 1) >= 0 && chessBoard[i - 2][j - 1].equals("kb") && isAlreadyDangerCheck[i-2][j-1].equals("--")) {
				totalDangerValue += 2.5;
				isAlreadyDangerCheck[i-2][j-1] = "kb";
			}
			if ((i - 1) >= 0 && (j - 2) >= 0 && chessBoard[i - 1][j - 2].equals("kb") && isAlreadyDangerCheck[i-1][j-2].equals("--")) {
				totalDangerValue += 2.5;
				isAlreadyDangerCheck[i-1][j-2] = "kb";
			}
			if ((i + 1) <= 7 && (j - 2) >= 0 && chessBoard[i + 1][j - 2].equals("kb") && isAlreadyDangerCheck[i+1][j-2].equals("--")) {
				totalDangerValue += 2.5;
				isAlreadyDangerCheck[i+1][j-2] = "kb";
			}
			if ((i + 2) <= 7 && (j - 1) >= 0 && chessBoard[i + 2][j - 1].equals("kb") && isAlreadyDangerCheck[i+2][j-1].equals("--")) {
				totalDangerValue += 2.5;
				isAlreadyDangerCheck[i+2][j-1] = "kb";
			}
			if ((i + 2) <= 7 && (j + 1) <= 7 && chessBoard[i + 2][j + 1].equals("kb") && isAlreadyDangerCheck[i+2][j+1].equals("--")) {
				totalDangerValue += 2.5;
				isAlreadyDangerCheck[i+2][j+1] = "kb";
			}
			if ((i + 1) <= 7 && (j + 2) <= 7 && chessBoard[i + 1][j + 2].equals("kb") && isAlreadyDangerCheck[i+1][j+2].equals("--")) {
				totalDangerValue += 2.5;
				isAlreadyDangerCheck[i+1][j+2] = "kb";
			}
		}
		if (chessPiece.equals("ab")) {
			if ((i - 1) >= 0 && (j + 2) <= 7 && chessBoard[i - 1][j + 2].equals("vs") && isAlreadyDangerCheck[i-1][j+2].equals("--")) {
				totalDangerValue += 4.5;
				isAlreadyDangerCheck[i-1][j+2] = "vs";
			}
			if ((i - 2) >= 0 && (j + 1) <= 7 && chessBoard[i - 2][j + 1].equals("vs") && isAlreadyDangerCheck[i-2][j+1].equals("--")) {
				totalDangerValue += 4.5;
				isAlreadyDangerCheck[i-2][j+1] = "vs";
			}
			if ((i - 2) >= 0 && (j - 1) >= 0 && chessBoard[i - 2][j - 1].equals("vs") && isAlreadyDangerCheck[i-2][j-1].equals("--")) {
				totalDangerValue += 4.5;
				isAlreadyDangerCheck[i-2][j-1] = "vs";
			}
			if ((i - 1) >= 0 && (j - 2) >= 0 && chessBoard[i - 1][j - 2].equals("vs") && isAlreadyDangerCheck[i-1][j-2].equals("--")) {
				totalDangerValue += 4.5;
				isAlreadyDangerCheck[i-1][j-2] = "vs";
			}
			if ((i + 1) <= 7 && (j - 2) >= 0 && chessBoard[i + 1][j - 2].equals("vs") && isAlreadyDangerCheck[i+1][j-2].equals("--")) {
				totalDangerValue += 4.5;
				isAlreadyDangerCheck[i+1][j-2] = "vs";
			}
			if ((i + 2) <= 7 && (j - 1) >= 0 && chessBoard[i + 2][j - 1].equals("vs") && isAlreadyDangerCheck[i+2][j-1].equals("--")) {
				totalDangerValue += 4.5;
				isAlreadyDangerCheck[i+2][j-1] = "vs";
			}
			if ((i + 2) <= 7 && (j + 1) <= 7 && chessBoard[i + 2][j + 1].equals("vs") && isAlreadyDangerCheck[i+2][j+1].equals("--")) {
				totalDangerValue += 4.5;
				isAlreadyDangerCheck[i+2][j+1] = "vs";
			}
			if ((i + 1) <= 7 && (j + 2) <= 7 && chessBoard[i + 1][j + 2].equals("vs") && isAlreadyDangerCheck[i+1][j+2].equals("--")) {
				totalDangerValue += 4.5;
				isAlreadyDangerCheck[i+1][j+2] = "vs";
			}
		} else if (chessPiece.equals("as")) {
			if ((i - 1) >= 0 && (j + 2) <= 7 && chessBoard[i - 1][j + 2].equals("vb") && isAlreadyDangerCheck[i-1][j+2].equals("--")) {
				totalDangerValue += 4.5;
				isAlreadyDangerCheck[i-1][j+2] = "vb";
			}
			if ((i - 2) >= 0 && (j + 1) <= 7 && chessBoard[i - 2][j + 1].equals("vb") && isAlreadyDangerCheck[i-2][j+1].equals("--")) {
				totalDangerValue += 4.5;
				isAlreadyDangerCheck[i-2][j+1] = "vb";
			}
			if ((i - 2) >= 0 && (j - 1) >= 0 && chessBoard[i - 2][j - 1].equals("vb") && isAlreadyDangerCheck[i-2][j-1].equals("--")) {
				totalDangerValue += 4.5;
				isAlreadyDangerCheck[i-2][j-1] = "vb";
			}
			if ((i - 1) >= 0 && (j - 2) >= 0 && chessBoard[i - 1][j - 2].equals("vb") && isAlreadyDangerCheck[i-1][j-2].equals("--")) {
				totalDangerValue += 4.5;
				isAlreadyDangerCheck[i-1][j-2] = "vb";
			}
			if ((i + 1) <= 7 && (j - 2) >= 0 && chessBoard[i + 1][j - 2].equals("vb") && isAlreadyDangerCheck[i+1][j-2].equals("--")) {
				totalDangerValue += 4.5;
				isAlreadyDangerCheck[i+1][j-2] = "vb";
			}
			if ((i + 2) <= 7 && (j - 1) >= 0 && chessBoard[i + 2][j - 1].equals("vb") && isAlreadyDangerCheck[i+2][j-1].equals("--")) {
				totalDangerValue += 4.5;
				isAlreadyDangerCheck[i+2][j-1] = "vb";
			}
			if ((i + 2) <= 7 && (j + 1) <= 7 && chessBoard[i + 2][j + 1].equals("vb") && isAlreadyDangerCheck[i+2][j+1].equals("--")) {
				totalDangerValue += 4.5;
				isAlreadyDangerCheck[i+2][j+1] = "vb";
			}
			if ((i + 1) <= 7 && (j + 2) <= 7 && chessBoard[i + 1][j + 2].equals("vb") && isAlreadyDangerCheck[i+1][j+2].equals("--")) {
				totalDangerValue += 4.5;
				isAlreadyDangerCheck[i+1][j+2] = "vb";
			}
		} 
		if (chessPiece.equals("ab")) {
			if ((i - 1) >= 0 && (j + 2) <= 7 && chessBoard[i - 1][j + 2].equals("ss") && isAlreadyDangerCheck[i-1][j+2].equals("--")) {
				totalDangerValue += 50;
				isAlreadyDangerCheck[i-1][j+2] = "ss";
			}
			if ((i - 2) >= 0 && (j + 1) <= 7 && chessBoard[i - 2][j + 1].equals("ss") && isAlreadyDangerCheck[i-2][j+1].equals("--")) {
				totalDangerValue += 50;
				isAlreadyDangerCheck[i-2][j+1] = "ss";
			}
			if ((i - 2) >= 0 && (j - 1) >= 0 && chessBoard[i - 2][j - 1].equals("ss") && isAlreadyDangerCheck[i-2][j-1].equals("--")) {
				totalDangerValue += 50;
				isAlreadyDangerCheck[i-2][j-1] = "ss";
			}
			if ((i - 1) >= 0 && (j - 2) >= 0 && chessBoard[i - 1][j - 2].equals("ss") && isAlreadyDangerCheck[i-1][j-2].equals("--")) {
				totalDangerValue += 50;
				isAlreadyDangerCheck[i-1][j-2] = "ss";
			}
			if ((i + 1) <= 7 && (j - 2) >= 0 && chessBoard[i + 1][j - 2].equals("ss") && isAlreadyDangerCheck[i+1][j-2].equals("--")) {
				totalDangerValue += 50;
				isAlreadyDangerCheck[i+1][j-2] = "ss";
			}
			if ((i + 2) <= 7 && (j - 1) >= 0 && chessBoard[i + 2][j - 1].equals("ss") && isAlreadyDangerCheck[i+2][j-1].equals("--")) {
				totalDangerValue += 50;
				isAlreadyDangerCheck[i+2][j-1] = "ss";
			}
			if ((i + 2) <= 7 && (j + 1) <= 7 && chessBoard[i + 2][j + 1].equals("ss") && isAlreadyDangerCheck[i+2][j+1].equals("--")) {
				totalDangerValue += 50;
				isAlreadyDangerCheck[i+2][j+1] = "ss";
			}
			if ((i + 1) <= 7 && (j + 2) <= 7 && chessBoard[i + 1][j + 2].equals("ss") && isAlreadyDangerCheck[i+1][j+2].equals("--")) {
				totalDangerValue += 50;
				isAlreadyDangerCheck[i+1][j+2] = "ss";
			}
		} else if (chessPiece.equals("as")) {
			if ((i - 1) >= 0 && (j + 2) <= 7 && chessBoard[i - 1][j + 2].equals("sb") && isAlreadyDangerCheck[i-1][j+2].equals("--")) {
				totalDangerValue += 50;
				isAlreadyDangerCheck[i-1][j+2] = "sb";
			}
			if ((i - 2) >= 0 && (j + 1) <= 7 && chessBoard[i - 2][j + 1].equals("sb") && isAlreadyDangerCheck[i-2][j+1].equals("--")) {
				totalDangerValue += 50;
				isAlreadyDangerCheck[i-2][j+1] = "sb";
			}
			if ((i - 2) >= 0 && (j - 1) >= 0 && chessBoard[i - 2][j - 1].equals("sb") && isAlreadyDangerCheck[i-2][j-1].equals("--")) {
				totalDangerValue += 50;
				isAlreadyDangerCheck[i-2][j-1] = "sb";
			}
			if ((i - 1) >= 0 && (j - 2) >= 0 && chessBoard[i - 1][j - 2].equals("sb") && isAlreadyDangerCheck[i-1][j-2].equals("--")) {
				totalDangerValue += 50;
				isAlreadyDangerCheck[i-1][j-2] = "sb";
			}
			if ((i + 1) <= 7 && (j - 2) >= 0 && chessBoard[i + 1][j - 2].equals("sb") && isAlreadyDangerCheck[i+1][j-2].equals("--")) {
				totalDangerValue += 50;
				isAlreadyDangerCheck[i+1][j-2] = "sb";
			}
			if ((i + 2) <= 7 && (j - 1) >= 0 && chessBoard[i + 2][j - 1].equals("sb") && isAlreadyDangerCheck[i+2][j-1].equals("--")) {
				totalDangerValue += 50;
				isAlreadyDangerCheck[i+2][j-1] = "sb";
			}
			if ((i + 2) <= 7 && (j + 1) <= 7 && chessBoard[i + 2][j + 1].equals("sb") && isAlreadyDangerCheck[i+2][j+1].equals("--")) {
				totalDangerValue += 50;
				isAlreadyDangerCheck[i+2][j+1] = "sb";
			}
			if ((i + 1) <= 7 && (j + 2) <= 7 && chessBoard[i + 1][j + 2].equals("sb") && isAlreadyDangerCheck[i+1][j+2].equals("--")) {
				totalDangerValue += 50;
				isAlreadyDangerCheck[i+1][j+2] = "sb";
			}
		}

		return totalDangerValue;
	}

}
