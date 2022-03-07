
public class Pawn extends ChessPieces implements ICreateDanger{

	/*
	 * Piyonlar�n olu�turdu�u tehlikeleri ve tehlike alt�ndaki par�alar�n de�erlerinin yar�s�n� geri d�nd�r�yoruz.
	 * Bir par�a tehlike alt�nda ise bulundu�u index, isAlreadyDangerCheck dizisinde i�aretleniyor ve ba�ka bir Piyon, At veya Vezir taraf�ndan 2. kez tehlike alt�na sokulmuyor.
	 * Bu kontrol bir par�an�n de�erini birden fazla kaybetmemesi i�in gerekli
	 * */
	
	@Override
	public double createDanger(String chessPiece, String[][] chessBoard, int i, int j, String[][] isAlreadyDangerCheck) {
		double totalDangerValue = 0;
		
		if (chessPiece.equals("ps")) {
			if ((i+1)<=7 && (j+1)<=7 && chessBoard[i+1][j+1].equals("pb") && isAlreadyDangerCheck[i+1][j+1].equals("--")) {
		    	totalDangerValue += 0.5;
		    	isAlreadyDangerCheck[i+1][j+1] = "pb";
		    
		    }
			if ((i+1)<=7 && (j-1)>=0 && chessBoard[i+1][j-1].equals("pb") && isAlreadyDangerCheck[i+1][j-1].equals("--")) {
		    	totalDangerValue += 0.5;
		    	isAlreadyDangerCheck[i+1][j-1] = "pb";
		 
		    }
				
		}else if (chessPiece.equals("pb")) {
			if ((i-1)>=0 && (j-1)>=0 && chessBoard[i-1][j-1].equals("ps") && isAlreadyDangerCheck[i-1][j-1].equals("--")) {
				totalDangerValue += 0.5;
				isAlreadyDangerCheck[i-1][j-1] = "ps";
			}
		    if ((i-1)>=0 && (j+1)<=7 && chessBoard[i-1][j+1].equals("ps") && isAlreadyDangerCheck[i-1][+1].equals("--")) {
		    	totalDangerValue += 0.5;
		    	isAlreadyDangerCheck[i-1][j+1] = "ps";
		    }
		}
		
		if (chessPiece.equals("ps")) {
			if ((i+1)<=7 && (j+1)<=7 && chessBoard[i+1][j+1].equals("ab") && isAlreadyDangerCheck[i+1][j+1].equals("--")) {
				totalDangerValue += 1.5;
				isAlreadyDangerCheck[i+1][j+1] = "ab";
			}
		    if ((i+1)<=7 && (j-1)>=0 && chessBoard[i+1][j-1].equals("ab") && isAlreadyDangerCheck[i+1][j-1].equals("--")) {
		    	totalDangerValue += 1.5;
		    	isAlreadyDangerCheck[i+1][j-1] = "ab";
		    }
				
		}else if (chessPiece.equals("pb")) {
			if ((i-1)>=0 && (j-1)>=0 && chessBoard[i-1][j-1].equals("as") && isAlreadyDangerCheck[i-1][j-1].equals("--")) {
				totalDangerValue += 1.5;
				isAlreadyDangerCheck[i-1][j-1] = "as";
			}
		    if ((i-1)>=0 && (j+1)<=7 && chessBoard[i-1][j+1].equals("as") && isAlreadyDangerCheck[i-1][j+1].equals("--")) {
		    	totalDangerValue += 1.5;
		    	isAlreadyDangerCheck[i-1][j+1] = "as";
		    }
		}
		
		if (chessPiece.equals("ps")) {
			if ((i+1)<=7 && (j+1)<=7 && chessBoard[i+1][j+1].equals("fb") && isAlreadyDangerCheck[i+1][j+1].equals("--")) {
				totalDangerValue += 1.5;
				isAlreadyDangerCheck[i+1][j+1] = "fb";
			}
		    if ((i+1)<=7 && (j-1)>=0 && chessBoard[i+1][j-1].equals("fb") && isAlreadyDangerCheck[i+1][j-1].equals("--")) {
		    	totalDangerValue += 1.5;
		    	isAlreadyDangerCheck[i+1][j-1] = "fb";
		    }
				
		}else if (chessPiece.equals("pb")) {
			if ((i-1)>=0 && (j-1)>=0 && chessBoard[i-1][j-1].equals("fs") && isAlreadyDangerCheck[i-1][j-1].equals("--")) {
				totalDangerValue += 1.5;
				isAlreadyDangerCheck[i-1][j-1] = "fs";
			}
		    if ((i-1)>=0 && (j+1)<=7 && chessBoard[i-1][j+1].equals("fs") && isAlreadyDangerCheck[i-1][j+1].equals("--")) {
		    	totalDangerValue += 1.5;
		    	isAlreadyDangerCheck[i-1][j+1] = "fs";
		    }
		}
		
		if (chessPiece.equals("ps")) {
			if ((i+1)<=7 && (j+1)<=7 && chessBoard[i+1][j+1].equals("kb") && isAlreadyDangerCheck[i+1][j+1].equals("--")) {
				totalDangerValue += 2.5;
				isAlreadyDangerCheck[i+1][j+1] = "kb";
			}
		    if ((i+1)<=7 && (j-1)>=0 && chessBoard[i+1][j-1].equals("kb") && isAlreadyDangerCheck[i+1][j-1].equals("--")) {
		    	totalDangerValue += 2.5;
		    	isAlreadyDangerCheck[i+1][j-1] = "kb";
		    }
				
		}else if (chessPiece.equals("pb")) {
			if ((i-1)>=0 && (j-1)>=0 && chessBoard[i-1][j-1].equals("ks") && isAlreadyDangerCheck[i-1][j-1].equals("--")) {
				totalDangerValue += 2.5;
				isAlreadyDangerCheck[i-1][j-1] = "ks";
			}
		    if ((i-1)>=0 && (j+1)<=7 && chessBoard[i-1][j+1].equals("ks") && isAlreadyDangerCheck[i-1][j+1].equals("--")) {
		    	totalDangerValue += 2.5;
		    	isAlreadyDangerCheck[i-1][j+1] = "ks";
		    }
		}
		
		if (chessPiece.equals("ps")) {
			if ((i+1)<=7 && (j+1)<=7 && chessBoard[i+1][j+1].equals("vb") && isAlreadyDangerCheck[i+1][j+1].equals("--")) {
				totalDangerValue += 4.5;
				isAlreadyDangerCheck[i+1][j+1] = "vb";
			}
		    if ((i+1)<=7 && (j-1)>=0 && chessBoard[i+1][j-1].equals("vb") && isAlreadyDangerCheck[i+1][j-1].equals("--")) {
		    	totalDangerValue += 4.5;
		    	isAlreadyDangerCheck[i+1][j-1] = "vb";
		    }
				
		}else if (chessPiece.equals("pb")) {
			if ((i-1)>=0 && (j-1)>=0 && chessBoard[i-1][j-1].equals("vs") && isAlreadyDangerCheck[i-1][j-1].equals("--")) {
				totalDangerValue += 4.5;
				isAlreadyDangerCheck[i-1][j-1] = "vs";
			}
		    if ((i-1)>=0 && (j+1)<=7 && chessBoard[i-1][j+1].equals("vs") && isAlreadyDangerCheck[i-1][j+1].equals("--")) {
		    	totalDangerValue += 4.5;
		    	isAlreadyDangerCheck[i-1][j+1] = "vs";
		    }
		}
		if (chessPiece.equals("ps")) {
			if ((i+1)<=7 && (j+1)<=7 && chessBoard[i+1][j+1].equals("sb") && isAlreadyDangerCheck[i+1][j+1].equals("--")) {
				totalDangerValue += 50;
				isAlreadyDangerCheck[i+1][j+1] = "sb";
			}
		    if ((i+1)<=7 && (j-1)>=0 && chessBoard[i+1][j-1].equals("sb") && isAlreadyDangerCheck[i+1][j-1].equals("--")) {
		    	totalDangerValue += 50;
		    	isAlreadyDangerCheck[i+1][j-1] = "sb";
		    }
				
		}else if (chessPiece.equals("pb")) {
			if ((i-1)>=0 && (j-1)>=0 && chessBoard[i-1][j-1].equals("ss") && isAlreadyDangerCheck[i-1][j-1].equals("--")) {
				totalDangerValue += 50;
				isAlreadyDangerCheck[i-1][j-1] = "ss";
			}
		    if ((i-1)>=0 && (j+1)<=7 && chessBoard[i-1][j+1].equals("ss") && isAlreadyDangerCheck[i-1][j+1].equals("--")) {
		    	totalDangerValue += 50;
		    	isAlreadyDangerCheck[i-1][j+1] = "ss";
		    }
		}
			
		
		return totalDangerValue;
	}

}
