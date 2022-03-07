import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Quenn extends ChessPieces implements ICreateDanger {
	
	/*
	 * Atlarýn oluþturduðu tehlikeleri ve tehlike altýndaki parçalarýn deðerlerinin yarýsýný geri döndürüyoruz.
	 * Bir parça tehlike altýnda ise bulunduðu index, isAlreadyDangerCheck dizisinde iþaretleniyor ve baþka bir Piyon, At veya Vezir tarafýndan 2. kez tehlike altýna sokulmuyor.
	 * Bu kontrol bir parçanýn deðerini birden fazla kaybetmemesi için gerekli
	 * */
	
	String[] whitePiecesArray = new String[] { "pb", "ab", "fb", "kb", "vb", "sb" };
	List<String> whitePiecesList = new ArrayList<>(Arrays.asList(whitePiecesArray));
	String[] blackPiecesArray = new String[] { "ps", "as", "fs", "ks", "vs", "ss" };
	List<String> blackPiecesList = new ArrayList<>(Arrays.asList(blackPiecesArray));
	
	/*
	 * whitePiecesList ve blackPiecesList ArrayList'leri sayesinde vezirin kendi rengindeki taþlarýn üstünden atlamamasý saðlanýyor.
	 * */

	@Override
	public double createDanger(String chessPiece, String[][] chessBoard, int i, int j, String[][] isAlreadyDangerCheck) {
		double totalDangerValue = 0;

		if (chessPiece.equals("vb")) {
			if ((i + 1) <= 7 && !whitePiecesList.contains(chessBoard[i + 1][j]) && isAlreadyDangerCheck[i+1][j].equals("--")) {
				if (chessBoard[i + 1][j].equals("ps")) {
					totalDangerValue += 0.5;
					isAlreadyDangerCheck[i+1][j] = "ps";
				} else if (chessBoard[i + 1][j].equals("as")) {
					totalDangerValue += 1.5;
					isAlreadyDangerCheck[i+1][j] = "as";
				} else if (chessBoard[i + 1][j].equals("fs")) {
					totalDangerValue += 1.5;
					isAlreadyDangerCheck[i+1][j] = "fs";
				} else if (chessBoard[i + 1][j].equals("ks")) {
					totalDangerValue += 2.5;
					isAlreadyDangerCheck[i+1][j] = "ks";
				} else if (chessBoard[i + 1][j].equals("vs")) {
					totalDangerValue += 4.5;
					isAlreadyDangerCheck[i+1][j] = "vs";
				} else if (chessBoard[i + 1][j].equals("ss")) {
					totalDangerValue += 50;
					isAlreadyDangerCheck[i+1][j] = "ss";
				} else if ((i + 2) <= 7 && !whitePiecesList.contains(chessBoard[i + 2][j]) && isAlreadyDangerCheck[i+2][j].equals("--")) {
					if (chessBoard[i + 2][j].equals("ps")) {
						totalDangerValue += 0.5;
						isAlreadyDangerCheck[i+2][j] = "ps";
					} else if (chessBoard[i + 2][j].equals("as")) {
						totalDangerValue += 1.5;
						isAlreadyDangerCheck[i+2][j] = "as";
					} else if (chessBoard[i + 2][j].equals("fs")) {
						totalDangerValue += 1.5;
						isAlreadyDangerCheck[i+2][j] = "fs";
					} else if (chessBoard[i + 2][j].equals("ks")) {
						totalDangerValue += 2.5;
						isAlreadyDangerCheck[i+2][j] = "ks";
					} else if (chessBoard[i + 2][j].equals("vs")) {
						totalDangerValue += 4.5;
						isAlreadyDangerCheck[i+2][j] = "vs";
					} else if (chessBoard[i + 2][j].equals("ss")) {
						totalDangerValue += 50;
						isAlreadyDangerCheck[i+2][j] = "ss";
					} else if ((i + 3) <= 7 && !whitePiecesList.contains(chessBoard[i + 3][j]) && isAlreadyDangerCheck[i+3][j].equals("--")) {
						if (chessBoard[i + 3][j].equals("ps")) {
							totalDangerValue += 0.5;
							isAlreadyDangerCheck[i+3][j] = "ps";
						} else if (chessBoard[i + 3][j].equals("as")) {
							totalDangerValue += 1.5;
							isAlreadyDangerCheck[i+3][j] = "as";
						} else if (chessBoard[i + 3][j].equals("fs")) {
							totalDangerValue += 1.5;
							isAlreadyDangerCheck[i+3][j] = "fs";
						} else if (chessBoard[i + 3][j].equals("ks")) {
							totalDangerValue += 2.5;
							isAlreadyDangerCheck[i+3][j] = "ks";
						} else if (chessBoard[i + 3][j].equals("vs")) {
							totalDangerValue += 4.5;
							isAlreadyDangerCheck[i+3][j] = "vs";
						} else if (chessBoard[i + 3][j].equals("ss")) {
							totalDangerValue += 50;
							isAlreadyDangerCheck[i+3][j] = "ss";
						} else if ((i + 4) <= 7 && !whitePiecesList.contains(chessBoard[i + 4][j]) && isAlreadyDangerCheck[i+4][j].equals("--")) {
							if (chessBoard[i + 4][j].equals("ps")) {
								totalDangerValue += 0.5;
								isAlreadyDangerCheck[i+4][j] = "ps";
							} else if (chessBoard[i + 4][j].equals("as")) {
								totalDangerValue += 1.5;
								isAlreadyDangerCheck[i+4][j] = "as";
							} else if (chessBoard[i + 4][j].equals("fs")) {
								totalDangerValue += 1.5;
								isAlreadyDangerCheck[i+4][j] = "fs";
							} else if (chessBoard[i + 4][j].equals("ks")) {
								totalDangerValue += 2.5;
								isAlreadyDangerCheck[i+4][j] = "ks";
							} else if (chessBoard[i + 4][j].equals("vs")) {
								totalDangerValue += 4.5;
								isAlreadyDangerCheck[i+4][j] = "vs";
							} else if (chessBoard[i + 4][j].equals("ss")) {
								totalDangerValue += 50;
								isAlreadyDangerCheck[i+4][j] = "ss";
							} else if ((i + 5) <= 7 && !whitePiecesList.contains(chessBoard[i + 5][j]) && isAlreadyDangerCheck[i+5][j].equals("--")) {
								if (chessBoard[i + 5][j].equals("ps")) {
									totalDangerValue += 0.5;
									isAlreadyDangerCheck[i+5][j] = "ps";
								} else if (chessBoard[i + 5][j].equals("as")) {
									totalDangerValue += 1.5;
									isAlreadyDangerCheck[i+5][j] = "as";
								} else if (chessBoard[i + 5][j].equals("fs")) {
									totalDangerValue += 1.5;
									isAlreadyDangerCheck[i+5][j] = "fs";
								} else if (chessBoard[i + 5][j].equals("ks")) {
									totalDangerValue += 2.5;
									isAlreadyDangerCheck[i+5][j] = "ks";
								} else if (chessBoard[i + 5][j].equals("vs")) {
									totalDangerValue += 4.5;
									isAlreadyDangerCheck[i+5][j] = "vs";
								} else if (chessBoard[i + 5][j].equals("ss")) {
									totalDangerValue += 50;
									isAlreadyDangerCheck[i+5][j] = "ss";
								} else if ((i + 6) <= 7 && !whitePiecesList.contains(chessBoard[i + 6][j]) && isAlreadyDangerCheck[i+6][j].equals("--")) {
									if (chessBoard[i + 6][j].equals("ps")) {
										totalDangerValue += 0.5;
										isAlreadyDangerCheck[i+6][j] = "ps";
									} else if (chessBoard[i + 6][j].equals("as")) {
										totalDangerValue += 1.5;
										isAlreadyDangerCheck[i+6][j] = "as";
									} else if (chessBoard[i + 6][j].equals("fs")) {
										totalDangerValue += 1.5;
										isAlreadyDangerCheck[i+6][j] = "fs";
									} else if (chessBoard[i + 6][j].equals("ks")) {
										totalDangerValue += 2.5;
										isAlreadyDangerCheck[i+6][j] = "ks";
									} else if (chessBoard[i + 6][j].equals("vs")) {
										totalDangerValue += 4.5;
										isAlreadyDangerCheck[i+6][j] = "vs";
									} else if (chessBoard[i + 6][j].equals("ss")) {
										totalDangerValue += 50;
										isAlreadyDangerCheck[i+6][j] = "ss";
									} else if ((i + 7) <= 7 && !whitePiecesList.contains(chessBoard[i + 7][j]) && isAlreadyDangerCheck[i+7][j].equals("--")) {
										if (chessBoard[i + 7][j].equals("ps")) {
											totalDangerValue += 0.5;
											isAlreadyDangerCheck[i+7][j] = "ps";
										} else if (chessBoard[i + 7][j].equals("as")) {
											totalDangerValue += 1.5;
											isAlreadyDangerCheck[i+7][j] = "as";
										} else if (chessBoard[i + 7][j].equals("fs")) {
											totalDangerValue += 1.5;
											isAlreadyDangerCheck[i+7][j] = "fs";
										} else if (chessBoard[i + 7][j].equals("ks")) {
											totalDangerValue += 2.5;
											isAlreadyDangerCheck[i+7][j] = "ks";
										} else if (chessBoard[i + 7][j].equals("vs")) {
											totalDangerValue += 4.5;
											isAlreadyDangerCheck[i+7][j] = "vs";
										} else if (chessBoard[i + 7][j].equals("ss")) {
											totalDangerValue += 50;
											isAlreadyDangerCheck[i+7][j] = "ss";
										}
									}
								}
							}
						}
					}
				}
			}
			if ((i - 1) >= 0 && !whitePiecesList.contains(chessBoard[i - 1][j]) && isAlreadyDangerCheck[i-1][j].equals("--")) {
				if (chessBoard[i - 1][j].equals("ps")) {
					totalDangerValue += 0.5;
					isAlreadyDangerCheck[i-1][j] = "ps";
				} else if (chessBoard[i - 1][j].equals("as")) {
					totalDangerValue += 1.5;
					isAlreadyDangerCheck[i-1][j] = "as";
				} else if (chessBoard[i - 1][j].equals("fs")) {
					totalDangerValue += 1.5;
					isAlreadyDangerCheck[i-1][j] = "fs";
				} else if (chessBoard[i - 1][j].equals("ks")) {
					totalDangerValue += 2.5;
					isAlreadyDangerCheck[i-1][j] = "ks";
				} else if (chessBoard[i - 1][j].equals("vs")) {
					totalDangerValue += 4.5;
					isAlreadyDangerCheck[i-1][j] = "vs";
				} else if (chessBoard[i - 1][j].equals("ss")) {
					totalDangerValue += 50;
					isAlreadyDangerCheck[i-1][j] = "ss";
				} else if ((i - 2) >= 0 && !whitePiecesList.contains(chessBoard[i - 2][j]) && isAlreadyDangerCheck[i-2][j].equals("--")) {
					if (chessBoard[i - 2][j].equals("ps")) {
						totalDangerValue += 0.5;
						isAlreadyDangerCheck[i-2][j] = "ps";
					} else if (chessBoard[i - 2][j].equals("as")) {
						totalDangerValue += 1.5;
						isAlreadyDangerCheck[i-2][j] = "as";
					} else if (chessBoard[i - 2][j].equals("fs")) {
						totalDangerValue += 1.5;
						isAlreadyDangerCheck[i-2][j] = "fs";
					} else if (chessBoard[i - 2][j].equals("ks")) {
						totalDangerValue += 2.5;
						isAlreadyDangerCheck[i-2][j] = "ks";
					} else if (chessBoard[i - 2][j].equals("vs")) {
						totalDangerValue += 4.5;
						isAlreadyDangerCheck[i-2][j] = "vs";
					} else if (chessBoard[i - 2][j].equals("ss")) {
						totalDangerValue += 50;
						isAlreadyDangerCheck[i-2][j] = "ss";
					} else if ((i - 3) >= 0 && !whitePiecesList.contains(chessBoard[i - 3][j]) && isAlreadyDangerCheck[i-3][j].equals("--")) {
						if (chessBoard[i - 3][j].equals("ps")) {
							totalDangerValue += 0.5;
							isAlreadyDangerCheck[i-3][j] = "ps";
						} else if (chessBoard[i - 3][j].equals("as")) {
							totalDangerValue += 1.5;
							isAlreadyDangerCheck[i-3][j] = "as";
						} else if (chessBoard[i - 3][j].equals("fs")) {
							totalDangerValue += 1.5;
							isAlreadyDangerCheck[i-3][j] = "fs";
						} else if (chessBoard[i - 3][j].equals("ks")) {
							totalDangerValue += 2.5;
							isAlreadyDangerCheck[i-3][j] = "ks";
						} else if (chessBoard[i - 3][j].equals("vs")) {
							totalDangerValue += 4.5;
							isAlreadyDangerCheck[i-3][j] = "vs";
						} else if (chessBoard[i - 3][j].equals("ss")) {
							totalDangerValue += 50;
							isAlreadyDangerCheck[i-3][j] = "ss";
						} else if ((i - 4) >= 0 && !whitePiecesList.contains(chessBoard[i - 4][j]) && isAlreadyDangerCheck[i-4][j].equals("--")) {
							if (chessBoard[i - 4][j].equals("ps")) {
								totalDangerValue += 0.5;
								isAlreadyDangerCheck[i-4][j] = "ps";
							} else if (chessBoard[i - 4][j].equals("as")) {
								totalDangerValue += 1.5;
								isAlreadyDangerCheck[i-4][j] = "as";
							} else if (chessBoard[i - 4][j].equals("fs")) {
								totalDangerValue += 1.5;
								isAlreadyDangerCheck[i-4][j] = "fs";
							} else if (chessBoard[i - 4][j].equals("ks")) {
								totalDangerValue += 2.5;
								isAlreadyDangerCheck[i-4][j] = "ks";
							} else if (chessBoard[i - 4][j].equals("vs")) {
								totalDangerValue += 4.5;
								isAlreadyDangerCheck[i-4][j] = "vs";
							} else if (chessBoard[i - 4][j].equals("ss")) {
								totalDangerValue += 50;
								isAlreadyDangerCheck[i-4][j] = "ss";
							} else if ((i - 5) >= 0 && !whitePiecesList.contains(chessBoard[i - 5][j]) && isAlreadyDangerCheck[i-5][j].equals("--")) {
								if (chessBoard[i - 5][j].equals("ps")) {
									totalDangerValue += 0.5;
									isAlreadyDangerCheck[i-5][j] = "ps";
								} else if (chessBoard[i - 5][j].equals("as")) {
									totalDangerValue += 1.5;
									isAlreadyDangerCheck[i-5][j] = "as";
								} else if (chessBoard[i - 5][j].equals("fs")) {
									totalDangerValue += 1.5;
									isAlreadyDangerCheck[i-5][j] = "fs";
								} else if (chessBoard[i - 5][j].equals("ks")) {
									totalDangerValue += 2.5;
									isAlreadyDangerCheck[i-5][j] = "ks";
								} else if (chessBoard[i - 5][j].equals("vs")) {
									totalDangerValue += 4.5;
									isAlreadyDangerCheck[i-5][j] = "vs";
								} else if (chessBoard[i - 5][j].equals("ss")) {
									totalDangerValue += 50;
									isAlreadyDangerCheck[i-5][j] = "ss";
								} else if ((i - 6) >= 0 && !whitePiecesList.contains(chessBoard[i - 6][j]) && isAlreadyDangerCheck[i-6][j].equals("--")) {
									if (chessBoard[i - 6][j].equals("ps")) {
										totalDangerValue += 0.5;
										isAlreadyDangerCheck[i-6][j] = "ps";
									} else if (chessBoard[i - 6][j].equals("as")) {
										totalDangerValue += 1.5;
										isAlreadyDangerCheck[i-6][j] = "as";
									} else if (chessBoard[i - 6][j].equals("fs")) {
										totalDangerValue += 1.5;
										isAlreadyDangerCheck[i-6][j] = "fs";
									} else if (chessBoard[i - 6][j].equals("ks")) {
										totalDangerValue += 2.5;
										isAlreadyDangerCheck[i-6][j] = "ks";
									} else if (chessBoard[i - 6][j].equals("vs")) {
										totalDangerValue += 4.5;
										isAlreadyDangerCheck[i-6][j] = "vs";
									} else if (chessBoard[i - 6][j].equals("ss")) {
										totalDangerValue += 50;
										isAlreadyDangerCheck[i-6][j] = "ss";
									} else if ((i - 7) >= 0 && !whitePiecesList.contains(chessBoard[i - 7][j]) && isAlreadyDangerCheck[i-7][j].equals("--")) {
										if (chessBoard[i - 7][j].equals("ps")) {
											totalDangerValue += 0.5;
											isAlreadyDangerCheck[i-7][j] = "ps";
										} else if (chessBoard[i - 7][j].equals("as")) {
											totalDangerValue += 1.5;
											isAlreadyDangerCheck[i-7][j] = "as";
										} else if (chessBoard[i - 7][j].equals("fs")) {
											totalDangerValue += 1.5;
											isAlreadyDangerCheck[i-7][j] = "fs";
										} else if (chessBoard[i - 7][j].equals("ks")) {
											totalDangerValue += 2.5;
											isAlreadyDangerCheck[i-7][j] = "ks";
										} else if (chessBoard[i - 7][j].equals("vs")) {
											totalDangerValue += 4.5;
											isAlreadyDangerCheck[i-7][j] = "vs";
										} else if (chessBoard[i - 7][j].equals("ss")) {
											totalDangerValue += 50;
											isAlreadyDangerCheck[i-7][j] = "ss";
										}
									}
								}
							}
						}
					}
				}
			}
			if ((j + 1) <= 7 && !whitePiecesList.contains(chessBoard[i][j + 1]) && isAlreadyDangerCheck[i][j+1].equals("--")) {
				if (chessBoard[i][j + 1].equals("ps")) {
					totalDangerValue += 0.5;
					isAlreadyDangerCheck[i][j+1] = "ps";
				} else if (chessBoard[i][j + 1].equals("as")) {
					totalDangerValue += 1.5;
					isAlreadyDangerCheck[i][j+1] = "as";
				} else if (chessBoard[i][j + 1].equals("fs")) {
					totalDangerValue += 1.5;
					isAlreadyDangerCheck[i][j+1] = "fs";
				} else if (chessBoard[i][j + 1].equals("ks")) {
					totalDangerValue += 2.5;
					isAlreadyDangerCheck[i][j+1] = "ks";
				} else if (chessBoard[i][j + 1].equals("vs")) {
					totalDangerValue += 4.5;
					isAlreadyDangerCheck[i][j+1] = "vs";
				} else if (chessBoard[i][j + 1].equals("ss")) {
					totalDangerValue += 50;
					isAlreadyDangerCheck[i][j+1] = "ss";
				} else if ((j + 2) <= 7 && !whitePiecesList.contains(chessBoard[i][j + 2]) && isAlreadyDangerCheck[i][j+2].equals("--")) {
					if (chessBoard[i][j + 2].equals("ps")) {
						totalDangerValue += 0.5;
						isAlreadyDangerCheck[i][j+2] = "ps";
					} else if (chessBoard[i][j + 2].equals("as")) {
						totalDangerValue += 1.5;
						isAlreadyDangerCheck[i][j+2] = "as";
					} else if (chessBoard[i][j + 2].equals("fs")) {
						totalDangerValue += 1.5;
						isAlreadyDangerCheck[i][j+2] = "fs";
					} else if (chessBoard[i][j + 2].equals("ks")) {
						totalDangerValue += 2.5;
						isAlreadyDangerCheck[i][j+2] = "ks";
					} else if (chessBoard[i][j + 2].equals("vs")) {
						totalDangerValue += 4.5;
						isAlreadyDangerCheck[i][j+2] = "vs";
					} else if (chessBoard[i][j + 2].equals("ss")) {
						totalDangerValue += 50;
						isAlreadyDangerCheck[i][j+2] = "ss";
					} else if ((j + 3) <= 7 && !whitePiecesList.contains(chessBoard[i][j + 3]) && isAlreadyDangerCheck[i][j+3].equals("--")) {
						if (chessBoard[i][j + 3].equals("ps")) {
							totalDangerValue += 0.5;
							isAlreadyDangerCheck[i][j+3] = "ps";
						} else if (chessBoard[i][j + 3].equals("as")) {
							totalDangerValue += 1.5;
							isAlreadyDangerCheck[i][j+3] = "as";
						} else if (chessBoard[i][j + 3].equals("fs")) {
							totalDangerValue += 1.5;
							isAlreadyDangerCheck[i][j+3] = "fs";
						} else if (chessBoard[i][j + 3].equals("ks")) {
							totalDangerValue += 2.5;
							isAlreadyDangerCheck[i][j+3] = "ks";
						} else if (chessBoard[i][j + 3].equals("vs")) {
							totalDangerValue += 4.5;
							isAlreadyDangerCheck[i][j+3] = "vs";
						} else if (chessBoard[i][j + 3].equals("ss")) {
							totalDangerValue += 50;
							isAlreadyDangerCheck[i][j+3] = "ss";
						} else if ((j + 4) <= 7 && !whitePiecesList.contains(chessBoard[i][j + 4]) && isAlreadyDangerCheck[i][j+4].equals("--")) {
							if (chessBoard[i][j + 4].equals("ps")) {
								totalDangerValue += 0.5;
								isAlreadyDangerCheck[i][j+4] = "ps";
							} else if (chessBoard[i][j + 4].equals("as")) {
								totalDangerValue += 1.5;
								isAlreadyDangerCheck[i][j+4] = "as";
							} else if (chessBoard[i][j + 4].equals("fs")) {
								totalDangerValue += 1.5;
								isAlreadyDangerCheck[i][j+4] = "fs";
							} else if (chessBoard[i][j + 4].equals("ks")) {
								totalDangerValue += 2.5;
								isAlreadyDangerCheck[i][j+4] = "ks";
							} else if (chessBoard[i][j + 4].equals("vs")) {
								totalDangerValue += 4.5;
								isAlreadyDangerCheck[i][j+4] = "vs";
							} else if (chessBoard[i][j + 4].equals("ss")) {
								totalDangerValue += 50;
								isAlreadyDangerCheck[i][j+4] = "ss";
							} else if ((j + 5) <= 7 && !whitePiecesList.contains(chessBoard[i][j + 5]) && isAlreadyDangerCheck[i][j+5].equals("--")) {
								if (chessBoard[i][j + 5].equals("ps")) {
									totalDangerValue += 0.5;
									isAlreadyDangerCheck[i][j+5] = "ps";
								} else if (chessBoard[i][j + 5].equals("as")) {
									totalDangerValue += 1.5;
									isAlreadyDangerCheck[i][j+5] = "as";
								} else if (chessBoard[i][j + 5].equals("fs")) {
									totalDangerValue += 1.5;
									isAlreadyDangerCheck[i][j+5] = "fs";
								} else if (chessBoard[i][j + 5].equals("ks")) {
									totalDangerValue += 2.5;
									isAlreadyDangerCheck[i][j+5] = "ks";
								} else if (chessBoard[i][j + 5].equals("vs")) {
									totalDangerValue += 4.5;
									isAlreadyDangerCheck[i][j+5] = "vs";
								} else if (chessBoard[i][j + 5].equals("ss")) {
									totalDangerValue += 50;
									isAlreadyDangerCheck[i][j+5] = "ss";
								} else if ((j + 6) <= 7 && !whitePiecesList.contains(chessBoard[i][j + 6]) && isAlreadyDangerCheck[i][j+6].equals("--")) {
									if (chessBoard[i][j + 6].equals("ps")) {
										totalDangerValue += 0.5;
										isAlreadyDangerCheck[i][j+6] = "ps";
									} else if (chessBoard[i][j + 6].equals("as")) {
										totalDangerValue += 1.5;
										isAlreadyDangerCheck[i][j+6] = "as";
									} else if (chessBoard[i][j + 6].equals("fs")) {
										totalDangerValue += 1.5;
										isAlreadyDangerCheck[i][j+6] = "fs";
									} else if (chessBoard[i][j + 6].equals("ks")) {
										totalDangerValue += 2.5;
										isAlreadyDangerCheck[i][j+6] = "ks";
									} else if (chessBoard[i][j + 6].equals("vs")) {
										totalDangerValue += 4.5;
										isAlreadyDangerCheck[i][j+6] = "vs";
									} else if (chessBoard[i][j + 6].equals("ss")) {
										totalDangerValue += 50;
										isAlreadyDangerCheck[i][j+6] = "ss";
									} else if ((j + 7) <= 7 && !whitePiecesList.contains(chessBoard[i][j + 7]) && isAlreadyDangerCheck[i][j+7].equals("--")) {
										if (chessBoard[i][j + 7].equals("ps")) {
											totalDangerValue += 0.5;
											isAlreadyDangerCheck[i][j+7] = "ps";
										} else if (chessBoard[i][j + 7].equals("as")) {
											totalDangerValue += 1.5;
											isAlreadyDangerCheck[i][j+7] = "as";
										} else if (chessBoard[i][j + 7].equals("fs")) {
											totalDangerValue += 1.5;
											isAlreadyDangerCheck[i][j+7] = "fs";
										} else if (chessBoard[i][j + 7].equals("ks")) {
											totalDangerValue += 2.5;
											isAlreadyDangerCheck[i][j+7] = "ks";
										} else if (chessBoard[i][j + 7].equals("vs")) {
											totalDangerValue += 4.5;
											isAlreadyDangerCheck[i][j+7] = "vs";
										} else if (chessBoard[i][j + 7].equals("ss")) {
											totalDangerValue += 50;
											isAlreadyDangerCheck[i][j+7] = "ss";
										}
									}
								}
							}
						}
					}
				}
			}
			if ((j - 1) >= 0 && !whitePiecesList.contains(chessBoard[i][j - 1]) && isAlreadyDangerCheck[i][j-1].equals("--")) {
				if (chessBoard[i][j - 1].equals("ps")) {
					totalDangerValue += 0.5;
					isAlreadyDangerCheck[i][j-1] = "ps";
				} else if (chessBoard[i][j - 1].equals("as")) {
					totalDangerValue += 1.5;
					isAlreadyDangerCheck[i][j-1] = "as";
				} else if (chessBoard[i][j - 1].equals("fs")) {
					totalDangerValue += 1.5;
					isAlreadyDangerCheck[i][j-1] = "fs";
				} else if (chessBoard[i][j - 1].equals("ks")) {
					totalDangerValue += 2.5;
					isAlreadyDangerCheck[i][j-1] = "ks";
				} else if (chessBoard[i][j - 1].equals("vs")) {
					totalDangerValue += 4.5;
					isAlreadyDangerCheck[i][j-1] = "vs";
				} else if (chessBoard[i][j - 1].equals("ss")) {
					totalDangerValue += 50;
					isAlreadyDangerCheck[i][j-1] = "ss";
				} else if ((j - 2) >= 0 && !whitePiecesList.contains(chessBoard[i][j - 2]) && isAlreadyDangerCheck[i][j-2].equals("--")) {
					if (chessBoard[i][j - 2].equals("ps")) {
						totalDangerValue += 0.5;
						isAlreadyDangerCheck[i][j-2] = "ps";
					} else if (chessBoard[i][j - 2].equals("as")) {
						totalDangerValue += 1.5;
						isAlreadyDangerCheck[i][j-2] = "as";
					} else if (chessBoard[i][j - 2].equals("fs")) {
						totalDangerValue += 1.5;
						isAlreadyDangerCheck[i][j-2] = "fs";
					} else if (chessBoard[i][j - 2].equals("ks")) {
						totalDangerValue += 2.5;
						isAlreadyDangerCheck[i][j-2] = "ks";
					} else if (chessBoard[i][j - 2].equals("vs")) {
						totalDangerValue += 4.5;
						isAlreadyDangerCheck[i][j-2] = "vs";
					} else if (chessBoard[i][j - 2].equals("ss")) {
						totalDangerValue += 50;
						isAlreadyDangerCheck[i][j-2] = "ss";
					} else if ((j - 3) >= 0 && !whitePiecesList.contains(chessBoard[i][j - 3]) && isAlreadyDangerCheck[i][j-3].equals("--")) {
						if (chessBoard[i][j - 3].equals("ps")) {
							totalDangerValue += 0.5;
							isAlreadyDangerCheck[i][j-3] = "ps";
						} else if (chessBoard[i][j - 3].equals("as")) {
							totalDangerValue += 1.5;
							isAlreadyDangerCheck[i][j-3] = "as";
						} else if (chessBoard[i][j - 3].equals("fs")) {
							totalDangerValue += 1.5;
							isAlreadyDangerCheck[i][j-3] = "fs";
						} else if (chessBoard[i][j - 3].equals("ks")) {
							totalDangerValue += 2.5;
							isAlreadyDangerCheck[i][j-3] = "ks";
						} else if (chessBoard[i][j - 3].equals("vs")) {
							totalDangerValue += 4.5;
							isAlreadyDangerCheck[i][j-3] = "vs";
						} else if (chessBoard[i][j - 3].equals("ss")) {
							totalDangerValue += 50;
							isAlreadyDangerCheck[i][j-3] = "ss";
						} else if ((j - 4) >= 0 && !whitePiecesList.contains(chessBoard[i][j - 4]) && isAlreadyDangerCheck[i][j-4].equals("--")) {
							if (chessBoard[i][j - 4].equals("ps")) {
								totalDangerValue += 0.5;
								isAlreadyDangerCheck[i][j-4] = "ps";
							} else if (chessBoard[i][j - 4].equals("as")) {
								totalDangerValue += 1.5;
								isAlreadyDangerCheck[i][j-4] = "as";
							} else if (chessBoard[i][j - 4].equals("fs")) {
								totalDangerValue += 1.5;
								isAlreadyDangerCheck[i][j-4] = "fs";
							} else if (chessBoard[i][j - 4].equals("ks")) {
								totalDangerValue += 2.5;
								isAlreadyDangerCheck[i][j-4] = "ks";
							} else if (chessBoard[i][j - 4].equals("vs")) {
								totalDangerValue += 4.5;
								isAlreadyDangerCheck[i][j-4] = "vs";
							} else if (chessBoard[i][j - 4].equals("ss")) {
								totalDangerValue += 50;
								isAlreadyDangerCheck[i][j-4] = "ss";
							} else if ((j - 5) >= 0 && !whitePiecesList.contains(chessBoard[i][j - 5]) && isAlreadyDangerCheck[i][j-5].equals("--")) {
								if (chessBoard[i][j - 5].equals("ps")) {
									totalDangerValue += 0.5;
									isAlreadyDangerCheck[i][j-5] = "ps";
								} else if (chessBoard[i][j - 5].equals("as")) {
									totalDangerValue += 1.5;
									isAlreadyDangerCheck[i][j-5] = "as";
								} else if (chessBoard[i][j - 5].equals("fs")) {
									totalDangerValue += 1.5;
									isAlreadyDangerCheck[i][j-5] = "fs";
								} else if (chessBoard[i][j - 5].equals("ks")) {
									totalDangerValue += 2.5;
									isAlreadyDangerCheck[i][j-5] = "ks";
								} else if (chessBoard[i][j - 5].equals("vs")) {
									totalDangerValue += 4.5;
									isAlreadyDangerCheck[i][j-5] = "vs";
								} else if (chessBoard[i][j - 5].equals("ss")) {
									totalDangerValue += 50;
									isAlreadyDangerCheck[i][j-5] = "ss";
								} else if ((j - 6) >= 0 && !whitePiecesList.contains(chessBoard[i][j - 6]) && isAlreadyDangerCheck[i][j-6].equals("--")) {
									if (chessBoard[i][j - 6].equals("ps")) {
										totalDangerValue += 0.5;
										isAlreadyDangerCheck[i][j-6] = "ps";
									} else if (chessBoard[i][j - 6].equals("as")) {
										totalDangerValue += 1.5;
										isAlreadyDangerCheck[i][j-6] = "as";
									} else if (chessBoard[i][j - 6].equals("fs")) {
										totalDangerValue += 1.5;
										isAlreadyDangerCheck[i][j-6] = "fs";
									} else if (chessBoard[i][j - 6].equals("ks")) {
										totalDangerValue += 2.5;
										isAlreadyDangerCheck[i][j-6] = "ks";
									} else if (chessBoard[i][j - 6].equals("vs")) {
										totalDangerValue += 4.5;
										isAlreadyDangerCheck[i][j-6] = "vs";
									} else if (chessBoard[i][j - 6].equals("ss")) {
										totalDangerValue += 50;
										isAlreadyDangerCheck[i][j-6] = "ss";
									} else if ((j - 7) >= 0 && !whitePiecesList.contains(chessBoard[i][j - 7]) && isAlreadyDangerCheck[i][j-7].equals("--")) {
										if (chessBoard[i][j - 7].equals("ps")) {
											totalDangerValue += 0.5;
											isAlreadyDangerCheck[i][j-7] = "ps";
										} else if (chessBoard[i][j - 7].equals("as")) {
											totalDangerValue += 1.5;
											isAlreadyDangerCheck[i][j-7] = "as";
										} else if (chessBoard[i][j - 7].equals("fs")) {
											totalDangerValue += 1.5;
											isAlreadyDangerCheck[i][j-7] = "fs";
										} else if (chessBoard[i][j - 7].equals("ks")) {
											totalDangerValue += 2.5;
											isAlreadyDangerCheck[i][j-7] = "ks";
										} else if (chessBoard[i][j - 7].equals("vs")) {
											totalDangerValue += 4.5;
											isAlreadyDangerCheck[i][j-7] = "vs";
										} else if (chessBoard[i][j - 7].equals("ss")) {
											totalDangerValue += 50;
											isAlreadyDangerCheck[i][j-7] = "ss";
										}
									}
								}
							}
						}
					}
				}
			}
			if ((i + 1) <= 7 && (j + 1) <= 7 && !whitePiecesList.contains(chessBoard[i + 1][j + 1]) && isAlreadyDangerCheck[i+1][j+1].equals("--")) {
				if (chessBoard[i + 1][j + 1].equals("ps")) {
					totalDangerValue += 0.5;
					isAlreadyDangerCheck[i+1][j+1] = "ps";
				} else if (chessBoard[i + 1][j + 1].equals("as")) {
					totalDangerValue += 1.5;
					isAlreadyDangerCheck[i+1][j+1] = "as";
				} else if (chessBoard[i + 1][j + 1].equals("fs")) {
					totalDangerValue += 1.5;
					isAlreadyDangerCheck[i+1][j+1] = "fs";
				} else if (chessBoard[i + 1][j + 1].equals("ks")) {
					totalDangerValue += 2.5;
					isAlreadyDangerCheck[i+1][j+1] = "ks";
				} else if (chessBoard[i + 1][j + 1].equals("vs")) {
					totalDangerValue += 4.5;
					isAlreadyDangerCheck[i+1][j+1] = "vs";
				} else if (chessBoard[i + 1][j + 1].equals("ss")) {
					totalDangerValue += 50;
					isAlreadyDangerCheck[i+1][j+1] = "ss";
				} else if ((i + 2) <= 7 && (j + 2) <= 7 && !whitePiecesList.contains(chessBoard[i + 2][j + 2]) && isAlreadyDangerCheck[i+2][j+2].equals("--")) {
					if (chessBoard[i + 2][j + 2].equals("ps")) {
						totalDangerValue += 0.5;
						isAlreadyDangerCheck[i+2][j+2] = "ps";
					} else if (chessBoard[i + 2][j + 2].equals("as")) {
						totalDangerValue += 1.5;
						isAlreadyDangerCheck[i+2][j+2] = "as";
					} else if (chessBoard[i + 2][j + 2].equals("fs")) {
						totalDangerValue += 1.5;
						isAlreadyDangerCheck[i+2][j+2] = "fs";
					} else if (chessBoard[i + 2][j + 2].equals("ks")) {
						totalDangerValue += 2.5;
						isAlreadyDangerCheck[i+2][j+2] = "ks";
					} else if (chessBoard[i + 2][j + 2].equals("vs")) {
						totalDangerValue += 4.5;
						isAlreadyDangerCheck[i+2][j+2] = "vs";
					} else if (chessBoard[i + 2][j + 2].equals("ss")) {
						totalDangerValue += 50;
						isAlreadyDangerCheck[i+2][j+2] = "ss";
					} else if ((i + 3) <= 7 && (j + 3) <= 7 && !whitePiecesList.contains(chessBoard[i + 3][j + 3]) && isAlreadyDangerCheck[i+3][j+3].equals("--")) {
						if (chessBoard[i + 3][j + 3].equals("ps")) {
							totalDangerValue += 0.5;
							isAlreadyDangerCheck[i+3][j+3] = "ps";
						} else if (chessBoard[i + 3][j + 3].equals("as")) {
							totalDangerValue += 1.5;
							isAlreadyDangerCheck[i+3][j+3] = "as";
						} else if (chessBoard[i + 3][j + 3].equals("fs")) {
							totalDangerValue += 1.5;
							isAlreadyDangerCheck[i+3][j+3] = "fs";
						} else if (chessBoard[i + 3][j + 3].equals("ks")) {
							totalDangerValue += 2.5;
							isAlreadyDangerCheck[i+3][j+3] = "ks";
						} else if (chessBoard[i + 3][j + 3].equals("vs")) {
							totalDangerValue += 4.5;
							isAlreadyDangerCheck[i+3][j+3] = "vs";
						} else if (chessBoard[i + 3][j + 3].equals("ss")) {
							totalDangerValue += 50;
							isAlreadyDangerCheck[i+3][j+3] = "ss";
						} else if ((i + 4) <= 7 && (j + 4) <= 7
								&& !whitePiecesList.contains(chessBoard[i + 4][j + 4]) && isAlreadyDangerCheck[i+4][j+4].equals("--")) {
							if (chessBoard[i + 4][j + 4].equals("ps")) {
								totalDangerValue += 0.5;
								isAlreadyDangerCheck[i+4][j+4] = "ps";
							} else if (chessBoard[i + 4][j + 4].equals("as")) {
								totalDangerValue += 1.5;
								isAlreadyDangerCheck[i+4][j+4] = "as";
							} else if (chessBoard[i + 4][j + 4].equals("fs")) {
								totalDangerValue += 1.5;
								isAlreadyDangerCheck[i+4][j+4] = "fs";
							} else if (chessBoard[i + 4][j + 4].equals("ks")) {
								totalDangerValue += 2.5;
								isAlreadyDangerCheck[i+4][j+4] = "ks";
							} else if (chessBoard[i + 4][j + 4].equals("vs")) {
								totalDangerValue += 4.5;
								isAlreadyDangerCheck[i+4][j+4] = "vs";
							} else if (chessBoard[i + 4][j + 4].equals("ss")) {
								totalDangerValue += 50;
								isAlreadyDangerCheck[i+4][j+4] = "ss";
							} else if ((i + 5) <= 7 && (j + 5) <= 7
									&& !whitePiecesList.contains(chessBoard[i + 5][j + 5]) && isAlreadyDangerCheck[i+5][j+5].equals("--")) {
								if (chessBoard[i + 5][j + 5].equals("ps")) {
									totalDangerValue += 0.5;
									isAlreadyDangerCheck[i+5][j+5] = "ps";
								} else if (chessBoard[i + 5][j + 5].equals("as")) {
									totalDangerValue += 1.5;
									isAlreadyDangerCheck[i+5][j+5] = "as";
								} else if (chessBoard[i + 5][j + 5].equals("fs")) {
									totalDangerValue += 1.5;
									isAlreadyDangerCheck[i+5][j+5] = "fs";
								} else if (chessBoard[i + 5][j + 5].equals("ks")) {
									totalDangerValue += 2.5;
									isAlreadyDangerCheck[i+5][j+5] = "ks";
								} else if (chessBoard[i + 5][j + 5].equals("vs")) {
									totalDangerValue += 4.5;
									isAlreadyDangerCheck[i+5][j+5] = "vs";
								} else if (chessBoard[i + 5][j + 5].equals("ss")) {
									totalDangerValue += 50;
									isAlreadyDangerCheck[i+5][j+5] = "ss";
								} else if ((i + 6) <= 7 && (j + 6) <= 7
										&& !whitePiecesList.contains(chessBoard[i + 6][j + 6]) && isAlreadyDangerCheck[i+6][j+6].equals("--")) {
									if (chessBoard[i + 6][j + 6].equals("ps")) {
										totalDangerValue += 0.5;
										isAlreadyDangerCheck[i+6][j+6] = "ps";
									} else if (chessBoard[i + 6][j + 6].equals("as")) {
										totalDangerValue += 1.5;
										isAlreadyDangerCheck[i+6][j+6] = "as";
									} else if (chessBoard[i + 6][j + 6].equals("fs")) {
										totalDangerValue += 1.5;
										isAlreadyDangerCheck[i+6][j+6] = "fs";
									} else if (chessBoard[i + 6][j + 6].equals("ks")) {
										totalDangerValue += 2.5;
										isAlreadyDangerCheck[i+6][j+6] = "ks";
									} else if (chessBoard[i + 6][j + 6].equals("vs")) {
										totalDangerValue += 4.5;
										isAlreadyDangerCheck[i+6][j+6] = "vs";
									} else if (chessBoard[i + 6][j + 6].equals("ss")) {
										totalDangerValue += 50;
										isAlreadyDangerCheck[i+6][j+6] = "ss";
									} else if ((i + 7) <= 7 && (j + 7) <= 7
											&& !whitePiecesList.contains(chessBoard[i + 7][j + 7]) && isAlreadyDangerCheck[i+7][j+7].equals("--")) {
										if (chessBoard[i + 7][j + 7].equals("ps")) {
											totalDangerValue += 0.5;
											isAlreadyDangerCheck[i+7][j+7] = "ps";
										} else if (chessBoard[i + 7][j + 7].equals("as")) {
											totalDangerValue += 1.5;
											isAlreadyDangerCheck[i+7][j+7] = "as";
										} else if (chessBoard[i + 7][j + 7].equals("fs")) {
											totalDangerValue += 1.5;
											isAlreadyDangerCheck[i+7][j+7] = "fs";
										} else if (chessBoard[i + 7][j + 7].equals("ks")) {
											totalDangerValue += 2.5;
											isAlreadyDangerCheck[i+7][j+7] = "ks";
										} else if (chessBoard[i + 7][j + 7].equals("vs")) {
											totalDangerValue += 4.5;
											isAlreadyDangerCheck[i+7][j+7] = "vs";
										} else if (chessBoard[i + 7][j + 7].equals("ss")) {
											totalDangerValue += 50;
											isAlreadyDangerCheck[i+7][j+7] = "ss";
										}
									}
								}
							}
						}
					}
				}
			}
			if ((i - 1) >= 0 && (j - 1) >= 0 && !whitePiecesList.contains(chessBoard[i - 1][j - 1]) && isAlreadyDangerCheck[i-1][j-1].equals("--")) {
				if (chessBoard[i - 1][j - 1].equals("ps")) {
					totalDangerValue += 0.5;
					isAlreadyDangerCheck[i-1][j-1] = "ps";
				} else if (chessBoard[i - 1][j - 1].equals("as")) {
					totalDangerValue += 1.5;
					isAlreadyDangerCheck[i-1][j-1] = "as";
				} else if (chessBoard[i - 1][j - 1].equals("fs")) {
					totalDangerValue += 1.5;
					isAlreadyDangerCheck[i-1][j-1] = "fs";
				} else if (chessBoard[i - 1][j - 1].equals("ks")) {
					totalDangerValue += 2.5;
					isAlreadyDangerCheck[i-1][j-1] = "ks";
				} else if (chessBoard[i - 1][j - 1].equals("vs")) {
					totalDangerValue += 4.5;
					isAlreadyDangerCheck[i-1][j-1] = "vs";
				} else if (chessBoard[i - 1][j - 1].equals("ss")) {
					totalDangerValue += 50;
					isAlreadyDangerCheck[i-1][j-1] = "ps";
				} else if ((i - 2) >= 0 && (j - 2) >= 0 && !whitePiecesList.contains(chessBoard[i - 2][j - 2]) && isAlreadyDangerCheck[i-2][j-2].equals("--")) {
					if (chessBoard[i - 2][j - 2].equals("ps")) {
						totalDangerValue += 0.5;
						isAlreadyDangerCheck[i-2][j-2] = "ps";
					} else if (chessBoard[i - 2][j - 2].equals("as")) {
						totalDangerValue += 1.5;
						isAlreadyDangerCheck[i-2][j-2] = "as";
					} else if (chessBoard[i - 2][j - 2].equals("fs")) {
						totalDangerValue += 1.5;
						isAlreadyDangerCheck[i-2][j-2] = "fs";
					} else if (chessBoard[i - 2][j - 2].equals("ks")) {
						totalDangerValue += 2.5;
						isAlreadyDangerCheck[i-2][j-2] = "ks";
					} else if (chessBoard[i - 2][j - 2].equals("vs")) {
						totalDangerValue += 4.5;
						isAlreadyDangerCheck[i-2][j-2] = "vs";
					} else if (chessBoard[i - 2][j - 2].equals("ss")) {
						totalDangerValue += 50;
						isAlreadyDangerCheck[i-2][j-2] = "ps";
					} else if ((i - 3) >= 0 && (j - 3) >= 0 && !whitePiecesList.contains(chessBoard[i - 3][j - 3]) && isAlreadyDangerCheck[i-3][j-3].equals("--")) {
						if (chessBoard[i - 3][j - 3].equals("ps")) {
							totalDangerValue += 0.5;
							isAlreadyDangerCheck[i-3][j-3] = "ps";
						} else if (chessBoard[i - 3][j - 3].equals("as")) {
							totalDangerValue += 1.5;
							isAlreadyDangerCheck[i-3][j-3] = "as";
						} else if (chessBoard[i - 3][j - 3].equals("fs")) {
							totalDangerValue += 1.5;
							isAlreadyDangerCheck[i-3][j-3] = "fs";
						} else if (chessBoard[i - 3][j - 3].equals("ks")) {
							totalDangerValue += 2.5;
							isAlreadyDangerCheck[i-3][j-3] = "ks";
						} else if (chessBoard[i - 3][j - 3].equals("vs")) {
							totalDangerValue += 4.5;
							isAlreadyDangerCheck[i-3][j-3] = "vs";
						} else if (chessBoard[i - 3][j - 3].equals("ss")) {
							totalDangerValue += 50;
							isAlreadyDangerCheck[i-3][j-3] = "ps";
						} else if ((i - 4) >= 0 && (j - 4) >= 0 && !whitePiecesList.contains(chessBoard[i - 4][j - 4]) && isAlreadyDangerCheck[i-4][j-4].equals("--")) {
							if (chessBoard[i - 4][j - 4].equals("ps")) {
								totalDangerValue += 0.5;
								isAlreadyDangerCheck[i-4][j-4] = "ps";
							} else if (chessBoard[i - 4][j - 4].equals("as")) {
								totalDangerValue += 1.5;
								isAlreadyDangerCheck[i-4][j-4] = "as";
							} else if (chessBoard[i - 4][j - 4].equals("fs")) {
								totalDangerValue += 1.5;
								isAlreadyDangerCheck[i-4][j-4] = "fs";
							} else if (chessBoard[i - 4][j - 4].equals("ks")) {
								totalDangerValue += 2.5;
								isAlreadyDangerCheck[i-4][j-4] = "ks";
							} else if (chessBoard[i - 4][j - 4].equals("vs")) {
								totalDangerValue += 4.5;
								isAlreadyDangerCheck[i-4][j-4] = "vs";
							} else if (chessBoard[i - 4][j - 4].equals("ss")) {
								totalDangerValue += 50;
								isAlreadyDangerCheck[i-4][j-4] = "ss";
							} else if ((i - 5) >= 0 && (j - 5) >= 0 && !whitePiecesList.contains(chessBoard[i - 5][j - 5]) && isAlreadyDangerCheck[i-5][j-5].equals("--")) {
								if (chessBoard[i - 5][j - 5].equals("ps")) {
									totalDangerValue += 0.5;
									isAlreadyDangerCheck[i-5][j-5] = "ss";
								} else if (chessBoard[i - 5][j - 5].equals("as")) {
									totalDangerValue += 1.5;
									isAlreadyDangerCheck[i-5][j-5] = "as";
								} else if (chessBoard[i - 5][j - 5].equals("fs")) {
									totalDangerValue += 1.5;
									isAlreadyDangerCheck[i-5][j-5] = "fs";
								} else if (chessBoard[i - 5][j - 5].equals("ks")) {
									totalDangerValue += 2.5;
									isAlreadyDangerCheck[i-5][j-5] = "ks";
								} else if (chessBoard[i - 5][j - 5].equals("vs")) {
									totalDangerValue += 4.5;
									isAlreadyDangerCheck[i-5][j-5] = "vs";
								} else if (chessBoard[i - 5][j - 5].equals("ss")) {
									totalDangerValue += 50;
									isAlreadyDangerCheck[i-5][j-5] = "ss";
								} else if ((i - 6) >= 0 && (j - 6) >= 0 && !whitePiecesList.contains(chessBoard[i - 6][j - 6]) && isAlreadyDangerCheck[i-6][j-6].equals("--")) {
									if (chessBoard[i - 6][j - 6].equals("ps")) {
										totalDangerValue += 0.5;
										isAlreadyDangerCheck[i-6][j-6] = "ps";
									} else if (chessBoard[i - 6][j - 6].equals("as")) {
										totalDangerValue += 1.5;
										isAlreadyDangerCheck[i-6][j-6] = "as";
									} else if (chessBoard[i - 6][j - 6].equals("fs")) {
										totalDangerValue += 1.5;
										isAlreadyDangerCheck[i-6][j-6] = "fs";
									} else if (chessBoard[i - 6][j - 6].equals("ks")) {
										totalDangerValue += 2.5;
										isAlreadyDangerCheck[i-6][j-6] = "ks";
									} else if (chessBoard[i - 6][j - 6].equals("vs")) {
										totalDangerValue += 4.5;
										isAlreadyDangerCheck[i-6][j-6] = "vs";
									} else if (chessBoard[i - 6][j - 6].equals("ss")) {
										totalDangerValue += 50;
										isAlreadyDangerCheck[i-6][j-6] = "ss";
									} else if ((i - 7) >= 0 && (j - 7) >= 0 && !whitePiecesList.contains(chessBoard[i - 7][j - 7]) && isAlreadyDangerCheck[i-7][j-7].equals("--")) {
										if (chessBoard[i - 7][j - 7].equals("ps")) {
											totalDangerValue += 0.5;
											isAlreadyDangerCheck[i-7][j-7] = "ps";
										} else if (chessBoard[i - 7][j - 7].equals("as")) {
											totalDangerValue += 1.5;
											isAlreadyDangerCheck[i-7][j-7] = "as";
										} else if (chessBoard[i - 7][j - 7].equals("fs")) {
											totalDangerValue += 1.5;
											isAlreadyDangerCheck[i-7][j-7] = "fs";
										} else if (chessBoard[i - 7][j - 7].equals("ks")) {
											totalDangerValue += 2.5;
											isAlreadyDangerCheck[i-7][j-7] = "ks";
										} else if (chessBoard[i - 7][j - 7].equals("vs")) {
											totalDangerValue += 4.5;
											isAlreadyDangerCheck[i-7][j-7] = "vs";
										} else if (chessBoard[i - 7][j - 7].equals("ss")) {
											totalDangerValue += 50;
											isAlreadyDangerCheck[i-7][j-7] = "ss";
										}
									}
								}
							}
						}
					}
				}
			}
			if ((i + 1) <= 7 && (j - 1) >= 0 && !whitePiecesList.contains(chessBoard[i + 1][j - 1]) && isAlreadyDangerCheck[i+1][j-1].equals("--")) {
				if (chessBoard[i + 1][j - 1].equals("ps")) {
					totalDangerValue += 0.5;
					isAlreadyDangerCheck[i+1][j-1] = "ps";
				} else if (chessBoard[i + 1][j - 1].equals("as")) {
					totalDangerValue += 1.5;
					isAlreadyDangerCheck[i+1][j-1] = "as";
				} else if (chessBoard[i + 1][j - 1].equals("fs")) {
					totalDangerValue += 1.5;
					isAlreadyDangerCheck[i+1][j-1] = "fs";
				} else if (chessBoard[i + 1][j - 1].equals("ks")) {
					totalDangerValue += 2.5;
					isAlreadyDangerCheck[i+1][j-1] = "ks";
				} else if (chessBoard[i + 1][j - 1].equals("vs")) {
					totalDangerValue += 4.5;
					isAlreadyDangerCheck[i+1][j-1] = "vs";
				} else if (chessBoard[i + 1][j - 1].equals("ss")) {
					totalDangerValue += 50;
					isAlreadyDangerCheck[i+1][j-1] = "ss";
				} else if ((i + 2) <= 7 && (j - 2) >= 0 && !whitePiecesList.contains(chessBoard[i + 2][j - 2]) && isAlreadyDangerCheck[i+2][j-2].equals("--")) {
					if (chessBoard[i + 2][j - 2].equals("ps")) {
						totalDangerValue += 0.5;
						isAlreadyDangerCheck[i+2][j-2] = "ps";
					} else if (chessBoard[i + 2][j - 2].equals("as")) {
						totalDangerValue += 1.5;
						isAlreadyDangerCheck[i+2][j-2] = "as";
					} else if (chessBoard[i + 2][j - 2].equals("fs")) {
						totalDangerValue += 1.5;
						isAlreadyDangerCheck[i+2][j-2] = "fs";
					} else if (chessBoard[i + 2][j - 2].equals("ks")) {
						totalDangerValue += 2.5;
						isAlreadyDangerCheck[i+2][j-2] = "ks";
					} else if (chessBoard[i + 2][j - 2].equals("vs")) {
						totalDangerValue += 4.5;
						isAlreadyDangerCheck[i+2][j-2] = "vs";
					} else if (chessBoard[i + 2][j - 2].equals("ss")) {
						totalDangerValue += 50;
						isAlreadyDangerCheck[i+2][j-2] = "ss";
					} else if ((i + 3) <= 7 && (j - 3) >= 0 && !whitePiecesList.contains(chessBoard[i + 3][j - 3]) && isAlreadyDangerCheck[i+3][j-3].equals("--")) {
						if (chessBoard[i + 3][j - 3].equals("ps")) {
							totalDangerValue += 0.5;
							isAlreadyDangerCheck[i+3][j-3] = "ps";
						} else if (chessBoard[i + 3][j - 3].equals("as")) {
							totalDangerValue += 1.5;
							isAlreadyDangerCheck[i+3][j-3] = "as";
						} else if (chessBoard[i + 3][j - 3].equals("fs")) {
							totalDangerValue += 1.5;
							isAlreadyDangerCheck[i+3][j-3] = "fs";
						} else if (chessBoard[i + 3][j - 3].equals("ks")) {
							totalDangerValue += 2.5;
							isAlreadyDangerCheck[i+3][j-3] = "ks";
						} else if (chessBoard[i + 3][j - 3].equals("vs")) {
							totalDangerValue += 4.5;
							isAlreadyDangerCheck[i+3][j-3] = "vs";
						} else if (chessBoard[i + 3][j - 3].equals("ss")) {
							totalDangerValue += 50;
							isAlreadyDangerCheck[i+3][j-3] = "ss";
						} else if ((i + 4) <= 7 && (j - 4) >= 0 && !whitePiecesList.contains(chessBoard[i + 4][j - 4]) && isAlreadyDangerCheck[i+4][j-4].equals("--")) {
							if (chessBoard[i + 4][j - 4].equals("ps")) {
								totalDangerValue += 0.5;
								isAlreadyDangerCheck[i+4][j-4] = "ps";
							} else if (chessBoard[i + 4][j - 4].equals("as")) {
								totalDangerValue += 1.5;
								isAlreadyDangerCheck[i+4][j-4] = "as";
							} else if (chessBoard[i + 4][j - 4].equals("fs")) {
								totalDangerValue += 1.5;
								isAlreadyDangerCheck[i+4][j-4] = "fs";
							} else if (chessBoard[i + 4][j - 4].equals("ks")) {
								totalDangerValue += 2.5;
								isAlreadyDangerCheck[i+4][j-4] = "ks";
							} else if (chessBoard[i + 4][j - 4].equals("vs")) {
								totalDangerValue += 4.5;
								isAlreadyDangerCheck[i+4][j-4] = "vs";
							} else if (chessBoard[i + 4][j - 4].equals("ss")) {
								totalDangerValue += 50;
								isAlreadyDangerCheck[i+4][j-4] = "ss";
							} else if ((i + 5) <= 7 && (j - 5) >= 0 && !whitePiecesList.contains(chessBoard[i + 5][j - 5]) && isAlreadyDangerCheck[i+5][j-5].equals("--")) {
								if (chessBoard[i + 5][j - 5].equals("ps")) {
									totalDangerValue += 0.5;
									isAlreadyDangerCheck[i+5][j-5] = "ss";
								} else if (chessBoard[i + 5][j - 5].equals("as")) {
									totalDangerValue += 1.5;
									isAlreadyDangerCheck[i+5][j-5] = "as";
								} else if (chessBoard[i + 5][j - 5].equals("fs")) {
									totalDangerValue += 1.5;
									isAlreadyDangerCheck[i+5][j-5] = "fs";
								} else if (chessBoard[i + 5][j - 5].equals("ks")) {
									totalDangerValue += 2.5;
									isAlreadyDangerCheck[i+5][j-5] = "ks";
								} else if (chessBoard[i + 5][j - 5].equals("vs")) {
									totalDangerValue += 4.5;
									isAlreadyDangerCheck[i+5][j-5] = "vs";
								} else if (chessBoard[i + 5][j - 5].equals("ss")) {
									totalDangerValue += 50;
									isAlreadyDangerCheck[i+5][j-5] = "ss";
								} else if ((i + 6) <= 7 && (j - 6) >= 0 && !whitePiecesList.contains(chessBoard[i + 6][j - 6]) && isAlreadyDangerCheck[i+6][j-6].equals("--")) {
									if (chessBoard[i + 6][j - 6].equals("ps")) {
										totalDangerValue += 0.5;
										isAlreadyDangerCheck[i+6][j-6] = "ps";
									} else if (chessBoard[i + 6][j - 6].equals("as")) {
										totalDangerValue += 1.5;
										isAlreadyDangerCheck[i+6][j-6] = "as";
									} else if (chessBoard[i + 6][j - 6].equals("fs")) {
										totalDangerValue += 1.5;
										isAlreadyDangerCheck[i+6][j-6] = "fs";
									} else if (chessBoard[i + 6][j - 6].equals("ks")) {
										totalDangerValue += 2.5;
										isAlreadyDangerCheck[i+6][j-6] = "ks";
									} else if (chessBoard[i + 6][j - 6].equals("vs")) {
										totalDangerValue += 4.5;
										isAlreadyDangerCheck[i+6][j-6] = "vs";
									} else if (chessBoard[i + 6][j - 6].equals("ss")) {
										totalDangerValue += 50;
										isAlreadyDangerCheck[i+6][j-6] = "ss";
									} else if ((i + 7) <= 7 && (j - 7) >= 0 && !whitePiecesList.contains(chessBoard[i + 7][j - 7]) && isAlreadyDangerCheck[i+7][j-7].equals("--")) {
										if (chessBoard[i + 7][j - 7].equals("ps")) {
											totalDangerValue += 0.5;
											isAlreadyDangerCheck[i+7][j-7] = "ps";
										} else if (chessBoard[i + 7][j - 7].equals("as")) {
											totalDangerValue += 1.5;
											isAlreadyDangerCheck[i+7][j-7] = "as";
										} else if (chessBoard[i + 7][j - 7].equals("fs")) {
											totalDangerValue += 1.5;
											isAlreadyDangerCheck[i+7][j-7] = "fs";
										} else if (chessBoard[i + 7][j - 7].equals("ks")) {
											totalDangerValue += 2.5;
											isAlreadyDangerCheck[i+7][j-7] = "ks";
										} else if (chessBoard[i + 7][j - 7].equals("vs")) {
											totalDangerValue += 4.5;
											isAlreadyDangerCheck[i+7][j-7] = "vs";
										} else if (chessBoard[i + 7][j - 7].equals("ss")) {
											totalDangerValue += 50;
											isAlreadyDangerCheck[i+7][j-7] = "ss";
										}
									}
								}
							}
						}
					}
				}
			}
			if ((i - 1) >= 0 && (j + 1) <= 7 && !whitePiecesList.contains(chessBoard[i - 1][j + 1]) && isAlreadyDangerCheck[i-1][j+1].equals("--")) {
				if (chessBoard[i - 1][j + 1].equals("ps")) {
					totalDangerValue += 0.5;
					isAlreadyDangerCheck[i-1][j+1] = "ps";
				} else if (chessBoard[i - 1][j + 1].equals("as")) {
					totalDangerValue += 1.5;
					isAlreadyDangerCheck[i-1][j+1] = "as";
				} else if (chessBoard[i - 1][j + 1].equals("fs")) {
					totalDangerValue += 1.5;
					isAlreadyDangerCheck[i-1][j+1] = "fs";
				} else if (chessBoard[i - 1][j + 1].equals("ks")) {
					totalDangerValue += 2.5;
					isAlreadyDangerCheck[i-1][j+1] = "ks";
				} else if (chessBoard[i - 1][j + 1].equals("vs")) {
					totalDangerValue += 4.5;
					isAlreadyDangerCheck[i-1][j+1] = "vs";
				} else if (chessBoard[i - 1][j + 1].equals("ss")) {
					totalDangerValue += 50;
					isAlreadyDangerCheck[i-1][j+1] = "ss";
				} else if ((i - 2) >= 0 && (j + 2) <= 7 && !whitePiecesList.contains(chessBoard[i - 2][j + 2]) && isAlreadyDangerCheck[i-2][j+2].equals("--")) {
					if (chessBoard[i - 2][j + 2].equals("ps")) {
						totalDangerValue += 0.5;
						isAlreadyDangerCheck[i-2][j+2] = "ps";
					} else if (chessBoard[i - 2][j + 2].equals("as")) {
						totalDangerValue += 1.5;
						isAlreadyDangerCheck[i-2][j+2] = "as";
					} else if (chessBoard[i - 2][j + 2].equals("fs")) {
						totalDangerValue += 1.5;
						isAlreadyDangerCheck[i-2][j+2] = "fs";
					} else if (chessBoard[i - 2][j + 2].equals("ks")) {
						totalDangerValue += 2.5;
						isAlreadyDangerCheck[i-2][j+2] = "ks";
					} else if (chessBoard[i - 2][j + 2].equals("vs")) {
						totalDangerValue += 4.5;
						isAlreadyDangerCheck[i-2][j+2] = "vs";
					} else if (chessBoard[i - 2][j + 2].equals("ss")) {
						totalDangerValue += 50;
						isAlreadyDangerCheck[i-2][j+2] = "ss";
					} else if ((i - 3) >= 0 && (j + 3) <= 7 && !whitePiecesList.contains(chessBoard[i - 3][j + 3]) && isAlreadyDangerCheck[i-3][j+3].equals("--")) {
						if (chessBoard[i - 3][j + 3].equals("ps")) {
							totalDangerValue += 0.5;
							isAlreadyDangerCheck[i-3][j+3] = "ps";
						} else if (chessBoard[i - 3][j + 3].equals("as")) {
							totalDangerValue += 1.5;
							isAlreadyDangerCheck[i-3][j+3] = "as";
						} else if (chessBoard[i - 3][j + 3].equals("fs")) {
							totalDangerValue += 1.5;
							isAlreadyDangerCheck[i-3][j+3] = "fs";
						} else if (chessBoard[i - 3][j + 3].equals("ks")) {
							totalDangerValue += 2.5;
							isAlreadyDangerCheck[i-3][j+3] = "ks";
						} else if (chessBoard[i - 3][j + 3].equals("vs")) {
							totalDangerValue += 4.5;
							isAlreadyDangerCheck[i-3][j+3] = "vs";
						} else if (chessBoard[i - 3][j + 3].equals("ss")) {
							totalDangerValue += 50;
							isAlreadyDangerCheck[i-3][j+3] = "ss";
						} else if ((i - 4) >= 0 && (j + 4) <= 7 && !whitePiecesList.contains(chessBoard[i - 4][j + 4]) && isAlreadyDangerCheck[i-4][j+4].equals("--")) {
							if (chessBoard[i - 4][j + 4].equals("ps")) {
								totalDangerValue += 0.5;
								isAlreadyDangerCheck[i-4][j+4] = "ps";
							} else if (chessBoard[i - 4][j + 4].equals("as")) {
								totalDangerValue += 1.5;
								isAlreadyDangerCheck[i-4][j+4] = "as";
							} else if (chessBoard[i - 4][j + 4].equals("fs")) {
								totalDangerValue += 1.5;
								isAlreadyDangerCheck[i-4][j+4] = "fs";
							} else if (chessBoard[i - 4][j + 4].equals("ks")) {
								totalDangerValue += 2.5;
								isAlreadyDangerCheck[i-4][j+4] = "ks";
							} else if (chessBoard[i - 4][j + 4].equals("vs")) {
								totalDangerValue += 4.5;
								isAlreadyDangerCheck[i-4][j+4] = "vs";
							} else if (chessBoard[i - 4][j + 4].equals("ss")) {
								totalDangerValue += 50;
								isAlreadyDangerCheck[i-4][j+4] = "ss";
							} else if ((i - 5) >= 0 && (j + 5) <= 7 && !whitePiecesList.contains(chessBoard[i - 5][j + 5]) && isAlreadyDangerCheck[i-5][j+5].equals("--")) {
								if (chessBoard[i - 5][j + 5].equals("ps")) {
									totalDangerValue += 0.5;
									isAlreadyDangerCheck[i-5][j+5] = "ps";
								} else if (chessBoard[i - 5][j + 5].equals("as")) {
									totalDangerValue += 1.5;
									isAlreadyDangerCheck[i-5][j+5] = "as";
								} else if (chessBoard[i - 5][j + 5].equals("fs")) {
									totalDangerValue += 1.5;
									isAlreadyDangerCheck[i-5][j+5] = "fs";
								} else if (chessBoard[i - 5][j + 5].equals("ks")) {
									totalDangerValue += 2.5;
									isAlreadyDangerCheck[i-5][j+5] = "ks";
								} else if (chessBoard[i - 5][j + 5].equals("vs")) {
									totalDangerValue += 4.5;
									isAlreadyDangerCheck[i-5][j+5] = "vs";
								} else if (chessBoard[i - 5][j + 5].equals("ss")) {
									totalDangerValue += 50;
									isAlreadyDangerCheck[i-5][j+5] = "ss";
								} else if ((i - 6) >= 0 && (j + 6) <= 7 && !whitePiecesList.contains(chessBoard[i - 6][j + 6]) && isAlreadyDangerCheck[i-6][j+6].equals("--")) {
									if (chessBoard[i - 6][j + 6].equals("ps")) {
										totalDangerValue += 0.5;
										isAlreadyDangerCheck[i-6][j+6] = "ps";
									} else if (chessBoard[i - 6][j + 6].equals("as")) {
										totalDangerValue += 1.5;
										isAlreadyDangerCheck[i-6][j+6] = "as";
									} else if (chessBoard[i - 6][j + 6].equals("fs")) {
										totalDangerValue += 1.5;
										isAlreadyDangerCheck[i-6][j+6] = "fs";
									} else if (chessBoard[i - 6][j + 6].equals("ks")) {
										totalDangerValue += 2.5;
										isAlreadyDangerCheck[i-6][j+6] = "ks";
									} else if (chessBoard[i - 6][j + 6].equals("vs")) {
										totalDangerValue += 4.5;
										isAlreadyDangerCheck[i-6][j+6] = "vs";
									} else if (chessBoard[i - 6][j + 6].equals("ss")) {
										totalDangerValue += 50;
										isAlreadyDangerCheck[i-6][j+6] = "ss";
									} else if ((i - 7) >= 0 && (j + 7) <= 7 && !whitePiecesList.contains(chessBoard[i - 7][j + 7]) && isAlreadyDangerCheck[i-7][j+7].equals("--")) {
										if (chessBoard[i - 7][j + 7].equals("ps")) {
											totalDangerValue += 0.5;
											isAlreadyDangerCheck[i-7][j+7] = "ps";
										} else if (chessBoard[i - 7][j + 7].equals("as")) {
											totalDangerValue += 1.5;
											isAlreadyDangerCheck[i-7][j+7] = "as";
										} else if (chessBoard[i - 7][j + 7].equals("fs")) {
											totalDangerValue += 1.5;
											isAlreadyDangerCheck[i-7][j+7] = "fs";
										} else if (chessBoard[i - 7][j + 7].equals("ks")) {
											totalDangerValue += 2.5;
											isAlreadyDangerCheck[i-7][j+7] = "ks";
										} else if (chessBoard[i - 7][j + 7].equals("vs")) {
											totalDangerValue += 4.5;
											isAlreadyDangerCheck[i-7][j+7] = "vs";
										} else if (chessBoard[i - 7][j + 7].equals("ss")) {
											totalDangerValue += 50;
											isAlreadyDangerCheck[i-7][j+7] = "ss";
										}
									}
								}

							}
						}
					}
				}
			}
		}

		if (chessPiece.equals("vs")) {
			if ((i + 1) <= 7 && !blackPiecesList.contains(chessBoard[i + 1][j]) && isAlreadyDangerCheck[i+1][j].equals("--")) {
				if (chessBoard[i + 1][j].equals("pb")) {
					totalDangerValue += 0.5;
					isAlreadyDangerCheck[i+1][j] = "pb";
				} else if (chessBoard[i + 1][j].equals("ab")) {
					totalDangerValue += 1.5;
					isAlreadyDangerCheck[i+1][j] = "ab";
				} else if (chessBoard[i + 1][j].equals("fb")) {
					totalDangerValue += 1.5;
					isAlreadyDangerCheck[i+1][j] = "fb";
				} else if (chessBoard[i + 1][j].equals("kb")) {
					totalDangerValue += 2.5;
					isAlreadyDangerCheck[i+1][j] = "kb";
				} else if (chessBoard[i + 1][j].equals("vb")) {
					totalDangerValue += 4.5;
					isAlreadyDangerCheck[i+1][j] = "vb";
				} else if (chessBoard[i + 1][j].equals("sb")) {
					totalDangerValue += 50;
					isAlreadyDangerCheck[i+1][j] = "sb";
				} else if ((i + 2) <= 7 && !blackPiecesList.contains(chessBoard[i + 2][j]) && isAlreadyDangerCheck[i+2][j].equals("--")) {
					if (chessBoard[i + 2][j].equals("pb")) {
						totalDangerValue += 0.5;
						isAlreadyDangerCheck[i+2][j] = "pb";
					} else if (chessBoard[i + 2][j].equals("ab")) {
						totalDangerValue += 1.5;
						isAlreadyDangerCheck[i+2][j] = "ab";
					} else if (chessBoard[i + 2][j].equals("fb")) {
						totalDangerValue += 1.5;
						isAlreadyDangerCheck[i+2][j] = "fb";
					} else if (chessBoard[i + 2][j].equals("kb")) {
						totalDangerValue += 2.5;
						isAlreadyDangerCheck[i+2][j] = "kb";
					} else if (chessBoard[i + 2][j].equals("vb")) {
						totalDangerValue += 4.5;
						isAlreadyDangerCheck[i+2][j] = "vb";
					} else if (chessBoard[i + 2][j].equals("sb")) {
						totalDangerValue += 50;
						isAlreadyDangerCheck[i+2][j] = "sb";
					} else if ((i + 3) <= 7 && !blackPiecesList.contains(chessBoard[i + 3][j]) && isAlreadyDangerCheck[i+3][j].equals("--")) {
						if (chessBoard[i + 3][j].equals("pb")) {
							totalDangerValue += 0.5;
							isAlreadyDangerCheck[i+3][j] = "pb";
						} else if (chessBoard[i + 3][j].equals("ab")) {
							totalDangerValue += 1.5;
							isAlreadyDangerCheck[i+3][j] = "ab";
						} else if (chessBoard[i + 3][j].equals("fb")) {
							totalDangerValue += 1.5;
							isAlreadyDangerCheck[i+3][j] = "fb";
						} else if (chessBoard[i + 3][j].equals("kb")) {
							totalDangerValue += 2.5;
							isAlreadyDangerCheck[i+3][j] = "kb";
						} else if (chessBoard[i + 3][j].equals("vb")) {
							totalDangerValue += 4.5;
							isAlreadyDangerCheck[i+3][j] = "vb";
						} else if (chessBoard[i + 3][j].equals("sb")) {
							totalDangerValue += 50;
							isAlreadyDangerCheck[i+3][j] = "sb";
						} else if ((i + 4) <= 7 && !blackPiecesList.contains(chessBoard[i + 4][j]) && isAlreadyDangerCheck[i+4][j].equals("--")) {
							if (chessBoard[i + 4][j].equals("pb")) {
								totalDangerValue += 0.5;
								isAlreadyDangerCheck[i+4][j] = "pb";
							} else if (chessBoard[i + 4][j].equals("ab")) {
								totalDangerValue += 1.5;
								isAlreadyDangerCheck[i+4][j] = "ab";
							} else if (chessBoard[i + 4][j].equals("fb")) {
								totalDangerValue += 1.5;
								isAlreadyDangerCheck[i+4][j] = "fb";
							} else if (chessBoard[i + 4][j].equals("kb")) {
								totalDangerValue += 2.5;
								isAlreadyDangerCheck[i+4][j] = "kb";
							} else if (chessBoard[i + 4][j].equals("vb")) {
								totalDangerValue += 4.5;
								isAlreadyDangerCheck[i+4][j] = "vb";
							} else if (chessBoard[i + 4][j].equals("sb")) {
								totalDangerValue += 50;
								isAlreadyDangerCheck[i+4][j] = "sb";
							} else if ((i + 5) <= 7 && !blackPiecesList.contains(chessBoard[i + 5][j]) && isAlreadyDangerCheck[i+5][j].equals("--")) {
								if (chessBoard[i + 5][j].equals("pb")) {
									totalDangerValue += 0.5;
									isAlreadyDangerCheck[i+5][j] = "pb";
								} else if (chessBoard[i + 5][j].equals("ab")) {
									totalDangerValue += 1.5;
									isAlreadyDangerCheck[i+5][j] = "ab";
								} else if (chessBoard[i + 5][j].equals("fb")) {
									totalDangerValue += 1.5;
									isAlreadyDangerCheck[i+5][j] = "fb";
								} else if (chessBoard[i + 5][j].equals("kb")) {
									totalDangerValue += 2.5;
									isAlreadyDangerCheck[i+5][j] = "kb";
								} else if (chessBoard[i + 5][j].equals("vb")) {
									totalDangerValue += 4.5;
									isAlreadyDangerCheck[i+5][j] = "vb";
								} else if (chessBoard[i + 5][j].equals("sb")) {
									totalDangerValue += 50;
									isAlreadyDangerCheck[i+5][j] = "sb";
								} else if ((i + 6) <= 7 && !blackPiecesList.contains(chessBoard[i + 6][j]) && isAlreadyDangerCheck[i+6][j].equals("--")) {
									if (chessBoard[i + 6][j].equals("pb")) {
										totalDangerValue += 0.5;
										isAlreadyDangerCheck[i+6][j] = "pb";
									} else if (chessBoard[i + 6][j].equals("ab")) {
										totalDangerValue += 1.5;
										isAlreadyDangerCheck[i+6][j] = "ab";
									} else if (chessBoard[i + 6][j].equals("fb")) {
										totalDangerValue += 1.5;
										isAlreadyDangerCheck[i+6][j] = "fb";
									} else if (chessBoard[i + 6][j].equals("kb")) {
										totalDangerValue += 2.5;
										isAlreadyDangerCheck[i+6][j] = "kb";
									} else if (chessBoard[i + 6][j].equals("vb")) {
										totalDangerValue += 4.5;
										isAlreadyDangerCheck[i+6][j] = "vb";
									} else if (chessBoard[i + 6][j].equals("sb")) {
										totalDangerValue += 50;
										isAlreadyDangerCheck[i+6][j] = "sb";
									} else if ((i + 7) <= 7 && !blackPiecesList.contains(chessBoard[i + 7][j]) && isAlreadyDangerCheck[i+7][j].equals("--")) {
										if (chessBoard[i + 7][j].equals("pb")) {
											totalDangerValue += 0.5;
											isAlreadyDangerCheck[i+7][j] = "pb";
										} else if (chessBoard[i + 7][j].equals("ab")) {
											totalDangerValue += 1.5;
											isAlreadyDangerCheck[i+7][j] = "ab";
										} else if (chessBoard[i + 7][j].equals("fb")) {
											totalDangerValue += 1.5;
											isAlreadyDangerCheck[i+7][j] = "fb";
										} else if (chessBoard[i + 7][j].equals("kb")) {
											totalDangerValue += 2.5;
											isAlreadyDangerCheck[i+7][j] = "kb";
										} else if (chessBoard[i + 7][j].equals("vb")) {
											totalDangerValue += 4.5;
											isAlreadyDangerCheck[i+7][j] = "vb";
										} else if (chessBoard[i + 7][j].equals("sb")) {
											totalDangerValue += 50;
											isAlreadyDangerCheck[i+7][j] = "sb";
										}
									}
								}
							}
						}
					}
				}
			}
			if ((i - 1) >= 0 && !blackPiecesList.contains(chessBoard[i - 1][j]) && isAlreadyDangerCheck[i-1][j].equals("--")) {
				if (chessBoard[i - 1][j].equals("pb")) {
					totalDangerValue += 0.5;
					isAlreadyDangerCheck[i-1][j] = "pb";
				} else if (chessBoard[i - 1][j].equals("ab")) {
					totalDangerValue += 1.5;
					isAlreadyDangerCheck[i-1][j] = "ab";
				} else if (chessBoard[i - 1][j].equals("fb")) {
					totalDangerValue += 1.5;
					isAlreadyDangerCheck[i-1][j] = "fb";
				} else if (chessBoard[i - 1][j].equals("kb")) {
					totalDangerValue += 2.5;
					isAlreadyDangerCheck[i-1][j] = "kb";
				} else if (chessBoard[i - 1][j].equals("vb")) {
					totalDangerValue += 4.5;
					isAlreadyDangerCheck[i-1][j] = "vb";
				} else if (chessBoard[i - 1][j].equals("sb")) {
					totalDangerValue += 50;
					isAlreadyDangerCheck[i-1][j] = "sb";
				} else if ((i - 2) >= 0 && !blackPiecesList.contains(chessBoard[i - 2][j]) && isAlreadyDangerCheck[i-2][j].equals("--")) {
					if (chessBoard[i - 2][j].equals("pb")) {
						totalDangerValue += 0.5;
						isAlreadyDangerCheck[i-2][j] = "pb";
					} else if (chessBoard[i - 2][j].equals("ab")) {
						totalDangerValue += 1.5;
						isAlreadyDangerCheck[i-2][j] = "ab";
					} else if (chessBoard[i - 2][j].equals("fb")) {
						totalDangerValue += 1.5;
						isAlreadyDangerCheck[i-2][j] = "fb";
					} else if (chessBoard[i - 2][j].equals("kb")) {
						totalDangerValue += 2.5;
						isAlreadyDangerCheck[i-2][j] = "kb";
					} else if (chessBoard[i - 2][j].equals("vb")) {
						totalDangerValue += 4.5;
						isAlreadyDangerCheck[i-2][j] = "vb";
					} else if (chessBoard[i - 2][j].equals("sb")) {
						totalDangerValue += 50;
						isAlreadyDangerCheck[i-2][j] = "pb";
					} else if ((i - 3) >= 0 && !blackPiecesList.contains(chessBoard[i - 3][j]) && isAlreadyDangerCheck[i-3][j].equals("--")) {
						if (chessBoard[i - 3][j].equals("pb")) {
							totalDangerValue += 0.5;
							isAlreadyDangerCheck[i-3][j] = "pb";
						} else if (chessBoard[i - 3][j].equals("ab")) {
							totalDangerValue += 1.5;
							isAlreadyDangerCheck[i-3][j] = "ab";
						} else if (chessBoard[i - 3][j].equals("fb")) {
							totalDangerValue += 1.5;
							isAlreadyDangerCheck[i-3][j] = "fb";
						} else if (chessBoard[i - 3][j].equals("kb")) {
							totalDangerValue += 2.5;
							isAlreadyDangerCheck[i-3][j] = "kb";
						} else if (chessBoard[i - 3][j].equals("vb")) {
							totalDangerValue += 4.5;
							isAlreadyDangerCheck[i-3][j] = "vb";
						} else if (chessBoard[i - 3][j].equals("sb")) {
							totalDangerValue += 50;
							isAlreadyDangerCheck[i-3][j] = "pb";
						} else if ((i - 4) >= 0 && !blackPiecesList.contains(chessBoard[i - 4][j]) && isAlreadyDangerCheck[i-4][j].equals("--")) {
							if (chessBoard[i - 4][j].equals("pb")) {
								totalDangerValue += 0.5;
								isAlreadyDangerCheck[i-4][j] = "pb";
							} else if (chessBoard[i - 4][j].equals("ab")) {
								totalDangerValue += 1.5;
								isAlreadyDangerCheck[i-4][j] = "ab";
							} else if (chessBoard[i - 4][j].equals("fb")) {
								totalDangerValue += 1.5;
								isAlreadyDangerCheck[i-4][j] = "fb";
							} else if (chessBoard[i - 4][j].equals("kb")) {
								totalDangerValue += 2.5;
								isAlreadyDangerCheck[i-4][j] = "kb";
							} else if (chessBoard[i - 4][j].equals("vb")) {
								totalDangerValue += 4.5;
								isAlreadyDangerCheck[i-4][j] = "vb";
							} else if (chessBoard[i - 4][j].equals("sb")) {
								totalDangerValue += 50;
								isAlreadyDangerCheck[i-4][j] = "pb";
							} else if ((i - 5) >= 0 && !blackPiecesList.contains(chessBoard[i - 5][j]) && isAlreadyDangerCheck[i-5][j].equals("--")) {
								if (chessBoard[i - 5][j].equals("pb")) {
									totalDangerValue += 0.5;
									isAlreadyDangerCheck[i-5][j] = "pb";
								} else if (chessBoard[i - 5][j].equals("ab")) {
									totalDangerValue += 1.5;
									isAlreadyDangerCheck[i-5][j] = "ab";
								} else if (chessBoard[i - 5][j].equals("fb")) {
									totalDangerValue += 1.5;
									isAlreadyDangerCheck[i-5][j] = "fb";
								} else if (chessBoard[i - 5][j].equals("kb")) {
									totalDangerValue += 2.5;
									isAlreadyDangerCheck[i-5][j] = "kb";
								} else if (chessBoard[i - 5][j].equals("vb")) {
									totalDangerValue += 4.5;
									isAlreadyDangerCheck[i-5][j] = "vb";
								} else if (chessBoard[i - 5][j].equals("sb")) {
									totalDangerValue += 50;
									isAlreadyDangerCheck[i-5][j] = "pb";
								} else if ((i - 6) >= 0 && !blackPiecesList.contains(chessBoard[i - 6][j]) && isAlreadyDangerCheck[i-6][j].equals("--")) {
									if (chessBoard[i - 6][j].equals("pb")) {
										totalDangerValue += 0.5;
										isAlreadyDangerCheck[i-6][j] = "pb";
									} else if (chessBoard[i - 6][j].equals("ab")) {
										totalDangerValue += 1.5;
										isAlreadyDangerCheck[i-6][j] = "ab";
									} else if (chessBoard[i - 6][j].equals("fb")) {
										totalDangerValue += 1.5;
										isAlreadyDangerCheck[i-6][j] = "fb";
									} else if (chessBoard[i - 6][j].equals("kb")) {
										totalDangerValue += 2.5;
										isAlreadyDangerCheck[i-6][j] = "kb";
									} else if (chessBoard[i - 6][j].equals("vb")) {
										totalDangerValue += 4.5;
										isAlreadyDangerCheck[i-6][j] = "vb";
									} else if (chessBoard[i - 6][j].equals("sb")) {
										totalDangerValue += 50;
										isAlreadyDangerCheck[i-6][j] = "pb";
									} else if ((i - 7) >= 0 && !blackPiecesList.contains(chessBoard[i - 7][j]) && isAlreadyDangerCheck[i-7][j].equals("--")) {
										if (chessBoard[i - 7][j].equals("pb")) {
											totalDangerValue += 0.5;
											isAlreadyDangerCheck[i-7][j] = "pb";
										} else if (chessBoard[i - 7][j].equals("ab")) {
											totalDangerValue += 1.5;
											isAlreadyDangerCheck[i-7][j] = "ab";
										} else if (chessBoard[i - 7][j].equals("fb")) {
											totalDangerValue += 1.5;
											isAlreadyDangerCheck[i-7][j] = "fb";
										} else if (chessBoard[i - 7][j].equals("kb")) {
											totalDangerValue += 2.5;
											isAlreadyDangerCheck[i-7][j] = "kb";
										} else if (chessBoard[i - 7][j].equals("vb")) {
											totalDangerValue += 4.5;
											isAlreadyDangerCheck[i-7][j] = "vb";
										} else if (chessBoard[i - 7][j].equals("sb")) {
											totalDangerValue += 50;
											isAlreadyDangerCheck[i-7][j] = "sb";
										}
									}
								}
							}
						}
					}
				}
			}
			if ((j + 1) <= 7 && !blackPiecesList.contains(chessBoard[i][j + 1]) && isAlreadyDangerCheck[i][j+1].equals("--")) {
				if (chessBoard[i][j + 1].equals("pb")) {
					totalDangerValue += 0.5;
					isAlreadyDangerCheck[i][j+1] = "pb";
				} else if (chessBoard[i][j + 1].equals("ab")) {
					totalDangerValue += 1.5;
					isAlreadyDangerCheck[i][j+1] = "ab";
				} else if (chessBoard[i][j + 1].equals("fb")) {
					totalDangerValue += 1.5;
					isAlreadyDangerCheck[i][j+1] = "fb";
				} else if (chessBoard[i][j + 1].equals("kb")) {
					totalDangerValue += 2.5;
					isAlreadyDangerCheck[i][j+1] = "kb";
				} else if (chessBoard[i][j + 1].equals("vb")) {
					totalDangerValue += 4.5;
					isAlreadyDangerCheck[i][j+1] = "vb";
				} else if (chessBoard[i][j + 1].equals("sb")) {
					totalDangerValue += 50;
					isAlreadyDangerCheck[i][j+1] = "sb";
				} else if ((j + 2) <= 7 && !blackPiecesList.contains(chessBoard[i][j + 2]) && isAlreadyDangerCheck[i][j+2].equals("--")) {
					if (chessBoard[i][j + 2].equals("pb")) {
						totalDangerValue += 0.5;
						isAlreadyDangerCheck[i][j+2] = "pb";
					} else if (chessBoard[i][j + 2].equals("ab")) {
						totalDangerValue += 1.5;
						isAlreadyDangerCheck[i][j+2] = "ab";
					} else if (chessBoard[i][j + 2].equals("fb")) {
						totalDangerValue += 1.5;
						isAlreadyDangerCheck[i][j+2] = "fb";
					} else if (chessBoard[i][j + 2].equals("kb")) {
						totalDangerValue += 2.5;
						isAlreadyDangerCheck[i][j+2] = "kb";
					} else if (chessBoard[i][j + 2].equals("vb")) {
						totalDangerValue += 4.5;
						isAlreadyDangerCheck[i][j+2] = "vb";
					} else if (chessBoard[i][j + 2].equals("sb")) {
						totalDangerValue += 50;
						isAlreadyDangerCheck[i][j+2] = "sb";
					} else if ((j + 3) <= 7 && !blackPiecesList.contains(chessBoard[i][j + 3]) && isAlreadyDangerCheck[i][j+3].equals("--")) {
						if (chessBoard[i][j + 3].equals("pb")) {
							totalDangerValue += 0.5;
							isAlreadyDangerCheck[i][j+3] = "pb";
						} else if (chessBoard[i][j + 3].equals("ab")) {
							totalDangerValue += 1.5;
							isAlreadyDangerCheck[i][j+3] = "ab";
						} else if (chessBoard[i][j + 3].equals("fb")) {
							totalDangerValue += 1.5;
							isAlreadyDangerCheck[i][j+3] = "fb";
						} else if (chessBoard[i][j + 3].equals("kb")) {
							totalDangerValue += 2.5;
							isAlreadyDangerCheck[i][j+3] = "kb";
						} else if (chessBoard[i][j + 3].equals("vb")) {
							totalDangerValue += 4.5;
							isAlreadyDangerCheck[i][j+3] = "vb";
						} else if (chessBoard[i][j + 3].equals("sb")) {
							totalDangerValue += 50;
							isAlreadyDangerCheck[i][j+3] = "sb";
						} else if ((j + 4) <= 7 && !blackPiecesList.contains(chessBoard[i][j + 4]) && isAlreadyDangerCheck[i][j+4].equals("--")) {
							if (chessBoard[i][j + 4].equals("pb")) {
								totalDangerValue += 0.5;
								isAlreadyDangerCheck[i][j+4] = "pb";
							} else if (chessBoard[i][j + 4].equals("ab")) {
								totalDangerValue += 1.5;
								isAlreadyDangerCheck[i][j+4] = "ab";
							} else if (chessBoard[i][j + 4].equals("fb")) {
								totalDangerValue += 1.5;
								isAlreadyDangerCheck[i][j+4] = "fb";
							} else if (chessBoard[i][j + 4].equals("kb")) {
								totalDangerValue += 2.5;
								isAlreadyDangerCheck[i][j+4] = "kb";
							} else if (chessBoard[i][j + 4].equals("vb")) {
								totalDangerValue += 4.5;
								isAlreadyDangerCheck[i][j+4] = "vb";
							} else if (chessBoard[i][j + 4].equals("sb")) {
								totalDangerValue += 50;
								isAlreadyDangerCheck[i][j+4] = "sb";
							} else if ((j + 5) <= 7 && !blackPiecesList.contains(chessBoard[i][j + 5]) && isAlreadyDangerCheck[i][j+5].equals("--")) {
								if (chessBoard[i][j + 5].equals("pb")) {
									totalDangerValue += 0.5;
									isAlreadyDangerCheck[i][j+5] = "pb";
								} else if (chessBoard[i][j + 5].equals("ab")) {
									totalDangerValue += 1.5;
									isAlreadyDangerCheck[i][j+5] = "ab";
								} else if (chessBoard[i][j + 5].equals("fb")) {
									totalDangerValue += 1.5;
									isAlreadyDangerCheck[i][j+5] = "fb";
								} else if (chessBoard[i][j + 5].equals("kb")) {
									totalDangerValue += 2.5;
									isAlreadyDangerCheck[i][j+5] = "kb";
								} else if (chessBoard[i][j + 5].equals("vb")) {
									totalDangerValue += 4.5;
									isAlreadyDangerCheck[i][j+5] = "vb";
								} else if (chessBoard[i][j + 5].equals("sb")) {
									totalDangerValue += 50;
									isAlreadyDangerCheck[i][j+5] = "sb";
								} else if ((j + 6) <= 7 && !blackPiecesList.contains(chessBoard[i][j + 6]) && isAlreadyDangerCheck[i][j+6].equals("--")) {
									if (chessBoard[i][j + 6].equals("pb")) {
										totalDangerValue += 0.5;
										isAlreadyDangerCheck[i][j+6] = "pb";
									} else if (chessBoard[i][j + 6].equals("ab")) {
										totalDangerValue += 1.5;
										isAlreadyDangerCheck[i][j+6] = "ab";
									} else if (chessBoard[i][j + 6].equals("fb")) {
										totalDangerValue += 1.5;
										isAlreadyDangerCheck[i][j+6] = "fb";
									} else if (chessBoard[i][j + 6].equals("kb")) {
										totalDangerValue += 2.5;
										isAlreadyDangerCheck[i][j+6] = "kb";
									} else if (chessBoard[i][j + 6].equals("vb")) {
										totalDangerValue += 4.5;
										isAlreadyDangerCheck[i][j+6] = "vb";
									} else if (chessBoard[i][j + 6].equals("sb")) {
										totalDangerValue += 50;
										isAlreadyDangerCheck[i][j+6] = "sb";
									} else if ((j + 7) <= 7 && !blackPiecesList.contains(chessBoard[i][j + 7]) && isAlreadyDangerCheck[i][j+7].equals("--")) {
										if (chessBoard[i][j + 7].equals("pb")) {
											totalDangerValue += 0.5;
											isAlreadyDangerCheck[i][j+7] = "pb";
										} else if (chessBoard[i][j + 7].equals("ab")) {
											totalDangerValue += 1.5;
											isAlreadyDangerCheck[i][j+7] = "ab";
										} else if (chessBoard[i][j + 7].equals("fb")) {
											totalDangerValue += 1.5;
											isAlreadyDangerCheck[i][j+7] = "fb";
										} else if (chessBoard[i][j + 7].equals("kb")) {
											totalDangerValue += 2.5;
											isAlreadyDangerCheck[i][j+7] = "kb";
										} else if (chessBoard[i][j + 7].equals("vb")) {
											totalDangerValue += 4.5;
											isAlreadyDangerCheck[i][j+7] = "vb";
										} else if (chessBoard[i][j + 7].equals("sb")) {
											totalDangerValue += 50;
											isAlreadyDangerCheck[i][j+7] = "sb";
										}
									}
								}
							}
						}
					}
				}
			}
			if ((j - 1) >= 0 && !blackPiecesList.contains(chessBoard[i][j - 1]) && isAlreadyDangerCheck[i][j-1].equals("--")) {
				if (chessBoard[i][j - 1].equals("pb")) {
					totalDangerValue += 0.5;
					isAlreadyDangerCheck[i][j-1] = "pb";
				} else if (chessBoard[i][j - 1].equals("ab")) {
					totalDangerValue += 1.5;
					isAlreadyDangerCheck[i][j-1] = "ab";
				} else if (chessBoard[i][j - 1].equals("fb")) {
					totalDangerValue += 1.5;
					isAlreadyDangerCheck[i][j-1] = "fb";
				} else if (chessBoard[i][j - 1].equals("kb")) {
					totalDangerValue += 2.5;
					isAlreadyDangerCheck[i][j-1] = "kb";
				} else if (chessBoard[i][j - 1].equals("vb")) {
					totalDangerValue += 4.5;
					isAlreadyDangerCheck[i][j-1] = "vb";
				} else if (chessBoard[i][j - 1].equals("sb")) {
					totalDangerValue += 50;
					isAlreadyDangerCheck[i][j-1] = "sb";
				} else if ((j - 2) >= 0 && !blackPiecesList.contains(chessBoard[i][j - 2]) && isAlreadyDangerCheck[i][j-2].equals("--")) {
					if (chessBoard[i][j - 2].equals("pb")) {
						totalDangerValue += 0.5;
						isAlreadyDangerCheck[i][j-2] = "pb";
					} else if (chessBoard[i][j - 2].equals("ab")) {
						totalDangerValue += 1.5;
						isAlreadyDangerCheck[i][j-2] = "ab";
					} else if (chessBoard[i][j - 2].equals("fb")) {
						totalDangerValue += 1.5;
						isAlreadyDangerCheck[i][j-2] = "fb";
					} else if (chessBoard[i][j - 2].equals("kb")) {
						totalDangerValue += 2.5;
						isAlreadyDangerCheck[i][j-2] = "kb";
					} else if (chessBoard[i][j - 2].equals("vb")) {
						totalDangerValue += 4.5;
						isAlreadyDangerCheck[i][j-2] = "vb";
					} else if (chessBoard[i][j - 2].equals("sb")) {
						totalDangerValue += 50;
						isAlreadyDangerCheck[i][j-2] = "sb";
					} else if ((j - 3) >= 0 && !blackPiecesList.contains(chessBoard[i][j - 3]) && isAlreadyDangerCheck[i][j-3].equals("--")) {
						if (chessBoard[i][j - 3].equals("pb")) {
							totalDangerValue += 0.5;
							isAlreadyDangerCheck[i][j-3] = "pb";
						} else if (chessBoard[i][j - 3].equals("ab")) {
							totalDangerValue += 1.5;
							isAlreadyDangerCheck[i][j-3] = "ab";
						} else if (chessBoard[i][j - 3].equals("fb")) {
							totalDangerValue += 1.5;
							isAlreadyDangerCheck[i][j-3] = "fb";
						} else if (chessBoard[i][j - 3].equals("kb")) {
							totalDangerValue += 2.5;
							isAlreadyDangerCheck[i][j-3] = "kb";
						} else if (chessBoard[i][j - 3].equals("vb")) {
							totalDangerValue += 4.5;
							isAlreadyDangerCheck[i][j-3] = "vb";
						} else if (chessBoard[i][j - 3].equals("sb")) {
							totalDangerValue += 50;
							isAlreadyDangerCheck[i][j-3] = "pb";
						} else if ((j - 4) >= 0 && !blackPiecesList.contains(chessBoard[i][j - 4]) && isAlreadyDangerCheck[i][j-4].equals("--")) {
							if (chessBoard[i][j - 4].equals("pb")) {
								totalDangerValue += 0.5;
								isAlreadyDangerCheck[i][j-4] = "pb";
							} else if (chessBoard[i][j - 4].equals("ab")) {
								totalDangerValue += 1.5;
								isAlreadyDangerCheck[i][j-4] = "ab";
							} else if (chessBoard[i][j - 4].equals("fb")) {
								totalDangerValue += 1.5;
								isAlreadyDangerCheck[i][j-4] = "fb";
							} else if (chessBoard[i][j - 4].equals("kb")) {
								totalDangerValue += 2.5;
								isAlreadyDangerCheck[i][j-4] = "kb";
							} else if (chessBoard[i][j - 4].equals("vb")) {
								totalDangerValue += 4.5;
								isAlreadyDangerCheck[i][j-4] = "vb";
							} else if (chessBoard[i][j - 4].equals("sb")) {
								totalDangerValue += 50;
								isAlreadyDangerCheck[i][j-4] = "sb";
							} else if ((j - 5) >= 0 && !blackPiecesList.contains(chessBoard[i][j - 5]) && isAlreadyDangerCheck[i][j-5].equals("--")) {
								if (chessBoard[i][j - 5].equals("pb")) {
									totalDangerValue += 0.5;
									isAlreadyDangerCheck[i][j-5] = "pb";
								} else if (chessBoard[i][j - 5].equals("ab")) {
									totalDangerValue += 1.5;
									isAlreadyDangerCheck[i][j-5] = "ab";
								} else if (chessBoard[i][j - 5].equals("fb")) {
									totalDangerValue += 1.5;
									isAlreadyDangerCheck[i][j-5] = "fb";
								} else if (chessBoard[i][j - 5].equals("kb")) {
									totalDangerValue += 2.5;
									isAlreadyDangerCheck[i][j-5] = "kb";
								} else if (chessBoard[i][j - 5].equals("vb")) {
									totalDangerValue += 4.5;
									isAlreadyDangerCheck[i][j-5] = "vb";
								} else if (chessBoard[i][j - 5].equals("sb")) {
									totalDangerValue += 50;
									isAlreadyDangerCheck[i][j-5] = "sb";
								} else if ((j - 6) >= 0 && !blackPiecesList.contains(chessBoard[i][j - 6]) && isAlreadyDangerCheck[i][j-6].equals("--")) {
									if (chessBoard[i][j - 6].equals("pb")) {
										totalDangerValue += 0.5;
										isAlreadyDangerCheck[i][j-6] = "pb";
									} else if (chessBoard[i][j - 6].equals("ab")) {
										totalDangerValue += 1.5;
										isAlreadyDangerCheck[i][j-6] = "ab";
									} else if (chessBoard[i][j - 6].equals("fb")) {
										totalDangerValue += 1.5;
										isAlreadyDangerCheck[i][j-6] = "fb";
									} else if (chessBoard[i][j - 6].equals("kb")) {
										totalDangerValue += 2.5;
										isAlreadyDangerCheck[i][j-6] = "kb";
									} else if (chessBoard[i][j - 6].equals("vb")) {
										totalDangerValue += 4.5;
										isAlreadyDangerCheck[i][j-6] = "vb";
									} else if (chessBoard[i][j - 6].equals("sb")) {
										totalDangerValue += 50;
										isAlreadyDangerCheck[i][j-6] = "pb";
									} else if ((j - 7) >= 0 && !blackPiecesList.contains(chessBoard[i][j - 7]) && isAlreadyDangerCheck[i][j-7].equals("--")) {
										if (chessBoard[i][j - 7].equals("pb")) {
											totalDangerValue += 0.5;
											isAlreadyDangerCheck[i][j-7] = "pb";
										} else if (chessBoard[i][j - 7].equals("ab")) {
											totalDangerValue += 1.5;
											isAlreadyDangerCheck[i][j-7] = "ab";
										} else if (chessBoard[i][j - 7].equals("fb")) {
											totalDangerValue += 1.5;
											isAlreadyDangerCheck[i][j-7] = "fb";
										} else if (chessBoard[i][j - 7].equals("kb")) {
											totalDangerValue += 2.5;
											isAlreadyDangerCheck[i][j-7] = "kb";
										} else if (chessBoard[i][j - 7].equals("vb")) {
											totalDangerValue += 4.5;
											isAlreadyDangerCheck[i][j-7] = "vb";
										} else if (chessBoard[i][j - 7].equals("sb")) {
											totalDangerValue += 50;
											isAlreadyDangerCheck[i][j-7] = "sb";
										}
									}
								}
							}
						}
					}
				}
			}
			if ((i + 1) <= 7 && (j + 1) <= 7 && !blackPiecesList.contains(chessBoard[i + 1][j + 1]) && isAlreadyDangerCheck[i+1][j+1].equals("--")) {
				if (chessBoard[i + 1][j + 1].equals("pb")) {
					totalDangerValue += 0.5;
					isAlreadyDangerCheck[i+1][j+1] = "pb";
				} else if (chessBoard[i + 1][j + 1].equals("ab")) {
					totalDangerValue += 1.5;
					isAlreadyDangerCheck[i+1][j+1] = "ab";
				} else if (chessBoard[i + 1][j + 1].equals("fb")) {
					totalDangerValue += 1.5;
					isAlreadyDangerCheck[i+1][j+1] = "fb";
				} else if (chessBoard[i + 1][j + 1].equals("kb")) {
					totalDangerValue += 2.5;
					isAlreadyDangerCheck[i+1][j+1] = "kb";
				} else if (chessBoard[i + 1][j + 1].equals("vb")) {
					totalDangerValue += 4.5;
					isAlreadyDangerCheck[i+1][j+1] = "vb";
				} else if (chessBoard[i + 1][j + 1].equals("sb")) {
					totalDangerValue += 50;
					isAlreadyDangerCheck[i+1][j+1] = "sb";
				} else if ((i + 2) <= 7 && (j + 2) <= 7 && !blackPiecesList.contains(chessBoard[i + 2][j + 2]) && isAlreadyDangerCheck[i+2][j+2].equals("--")) {
					if (chessBoard[i + 2][j + 2].equals("pb")) {
						totalDangerValue += 0.5;
						isAlreadyDangerCheck[i+2][j+2] = "pb";
					} else if (chessBoard[i + 2][j + 2].equals("ab")) {
						totalDangerValue += 1.5;
						isAlreadyDangerCheck[i+2][j+2] = "ab";
					} else if (chessBoard[i + 2][j + 2].equals("fb")) {
						totalDangerValue += 1.5;
						isAlreadyDangerCheck[i+2][j+2] = "fb";
					} else if (chessBoard[i + 2][j + 2].equals("kb")) {
						totalDangerValue += 2.5;
						isAlreadyDangerCheck[i+2][j+2] = "kb";
					} else if (chessBoard[i + 2][j + 2].equals("vb")) {
						totalDangerValue += 4.5;
						isAlreadyDangerCheck[i+2][j+2] = "vb";
					} else if (chessBoard[i + 2][j + 2].equals("sb")) {
						totalDangerValue += 50;
						isAlreadyDangerCheck[i+2][j+2] = "sb";
					} else if ((i + 3) <= 7 && (j + 3) <= 7 && !blackPiecesList.contains(chessBoard[i + 3][j + 3]) && isAlreadyDangerCheck[i+3][j+3].equals("--")) {
						if (chessBoard[i + 3][j + 3].equals("pb")) {
							totalDangerValue += 0.5;
							isAlreadyDangerCheck[i+3][j+3] = "pb";
						} else if (chessBoard[i + 3][j + 3].equals("ab")) {
							totalDangerValue += 1.5;
							isAlreadyDangerCheck[i+3][j+3] = "ab";
						} else if (chessBoard[i + 3][j + 3].equals("fb")) {
							totalDangerValue += 1.5;
							isAlreadyDangerCheck[i+3][j+3] = "fb";
						} else if (chessBoard[i + 3][j + 3].equals("kb")) {
							totalDangerValue += 2.5;
							isAlreadyDangerCheck[i+3][j+3] = "kb";
						} else if (chessBoard[i + 3][j + 3].equals("vb")) {
							totalDangerValue += 4.5;
							isAlreadyDangerCheck[i+3][j+3] = "vb";
						} else if (chessBoard[i + 3][j + 3].equals("sb")) {
							totalDangerValue += 50;
							isAlreadyDangerCheck[i+3][j+3] = "pb";
						} else if ((i + 4) <= 7 && (j + 4) <= 7 && !blackPiecesList.contains(chessBoard[i + 4][j + 4]) && isAlreadyDangerCheck[i+4][j+4].equals("--")) {
							if (chessBoard[i + 4][j + 4].equals("pb")) {
								totalDangerValue += 0.5;
								isAlreadyDangerCheck[i+4][j+4] = "pb";
							} else if (chessBoard[i + 4][j + 4].equals("ab")) {
								totalDangerValue += 1.5;
								isAlreadyDangerCheck[i+4][j+4] = "ab";
							} else if (chessBoard[i + 4][j + 4].equals("fb")) {
								totalDangerValue += 1.5;
								isAlreadyDangerCheck[i+4][j+4] = "fb";
							} else if (chessBoard[i + 4][j + 4].equals("kb")) {
								totalDangerValue += 2.5;
								isAlreadyDangerCheck[i+4][j+4] = "kb";
							} else if (chessBoard[i + 4][j + 4].equals("vb")) {
								totalDangerValue += 4.5;
								isAlreadyDangerCheck[i+4][j+4] = "vb";
							} else if (chessBoard[i + 4][j + 4].equals("sb")) {
								totalDangerValue += 50;
								isAlreadyDangerCheck[i+4][j+4] = "sb";
							} else if ((i + 5) <= 7 && (j + 5) <= 7 && !blackPiecesList.contains(chessBoard[i + 5][j + 5]) && isAlreadyDangerCheck[i+5][j+5].equals("--")) {
								if (chessBoard[i + 5][j + 5].equals("pb")) {
									totalDangerValue += 0.5;
									isAlreadyDangerCheck[i+5][j+5] = "pb";
								} else if (chessBoard[i + 5][j + 5].equals("ab")) {
									totalDangerValue += 1.5;
									isAlreadyDangerCheck[i+5][j+5] = "ab";
								} else if (chessBoard[i + 5][j + 5].equals("fb")) {
									totalDangerValue += 1.5;
									isAlreadyDangerCheck[i+5][j+5] = "fb";
								} else if (chessBoard[i + 5][j + 5].equals("kb")) {
									totalDangerValue += 2.5;
									isAlreadyDangerCheck[i+5][j+5] = "kb";
								} else if (chessBoard[i + 5][j + 5].equals("vb")) {
									totalDangerValue += 4.5;
									isAlreadyDangerCheck[i+5][j+5] = "vb";
								} else if (chessBoard[i + 5][j + 5].equals("sb")) {
									totalDangerValue += 50;
									isAlreadyDangerCheck[i+5][j+5] = "sb";
								} else if ((i + 6) <= 7 && (j + 6) <= 7 && !blackPiecesList.contains(chessBoard[i + 6][j + 6]) && isAlreadyDangerCheck[i+6][j+6].equals("--")) {
									if (chessBoard[i + 6][j + 6].equals("pb")) {
										totalDangerValue += 0.5;
										isAlreadyDangerCheck[i+6][j+6] = "pb";
									} else if (chessBoard[i + 6][j + 6].equals("ab")) {
										totalDangerValue += 1.5;
										isAlreadyDangerCheck[i+6][j+6] = "ab";
									} else if (chessBoard[i + 6][j + 6].equals("fb")) {
										totalDangerValue += 1.5;
										isAlreadyDangerCheck[i+6][j+6] = "fb";
									} else if (chessBoard[i + 6][j + 6].equals("kb")) {
										totalDangerValue += 2.5;
										isAlreadyDangerCheck[i+6][j+6] = "kb";
									} else if (chessBoard[i + 6][j + 6].equals("vb")) {
										totalDangerValue += 4.5;
										isAlreadyDangerCheck[i+6][j+6] = "vb";
									} else if (chessBoard[i + 6][j + 6].equals("sb")) {
										totalDangerValue += 50;
										isAlreadyDangerCheck[i+6][j+6] = "sb";
									} else if ((i + 7) <= 7 && (j + 7) <= 7 && !blackPiecesList.contains(chessBoard[i + 7][j + 7]) && isAlreadyDangerCheck[i+7][j+7].equals("--")) {
										if (chessBoard[i + 7][j + 7].equals("pb")) {
											totalDangerValue += 0.5;
											isAlreadyDangerCheck[i+7][j+7] = "pb";
										} else if (chessBoard[i + 7][j + 7].equals("ab")) {
											totalDangerValue += 1.5;
											isAlreadyDangerCheck[i+7][j+7] = "ab";
										} else if (chessBoard[i + 7][j + 7].equals("fb")) {
											totalDangerValue += 1.5;
											isAlreadyDangerCheck[i+7][j+7] = "fb";
										} else if (chessBoard[i + 7][j + 7].equals("kb")) {
											totalDangerValue += 2.5;
											isAlreadyDangerCheck[i+7][j+7] = "kb";
										} else if (chessBoard[i + 7][j + 7].equals("vb")) {
											totalDangerValue += 4.5;
											isAlreadyDangerCheck[i+7][j+7] = "vb";
										} else if (chessBoard[i + 7][j + 7].equals("sb")) {
											totalDangerValue += 50;
											isAlreadyDangerCheck[i+7][j+7] = "sb";
										}
									}
								}
							}
						}
					}
				}
			}
			if ((i - 1) >= 0 && (j - 1) >= 0 && !blackPiecesList.contains(chessBoard[i - 1][j - 1]) && isAlreadyDangerCheck[i-1][j-1].equals("--")) {
				if (chessBoard[i - 1][j - 1].equals("pb")) {
					totalDangerValue += 0.5;
					isAlreadyDangerCheck[i-1][j-1] = "pb";
				} else if (chessBoard[i - 1][j - 1].equals("ab")) {
					totalDangerValue += 1.5;
					isAlreadyDangerCheck[i-1][j-1] = "ab";
				} else if (chessBoard[i - 1][j - 1].equals("fb")) {
					totalDangerValue += 1.5;
					isAlreadyDangerCheck[i-1][j-1] = "fb";
				} else if (chessBoard[i - 1][j - 1].equals("kb")) {
					totalDangerValue += 2.5;
					isAlreadyDangerCheck[i-1][j-1] = "kb";
				} else if (chessBoard[i - 1][j - 1].equals("vb")) {
					totalDangerValue += 4.5;
					isAlreadyDangerCheck[i-1][j-1] = "vb";
				} else if (chessBoard[i - 1][j - 1].equals("sb")) {
					totalDangerValue += 50;
					isAlreadyDangerCheck[i-1][j-1] = "sb";
				} else if ((i - 2) >= 0 && (j - 2) >= 0 && !blackPiecesList.contains(chessBoard[i - 2][j - 2]) && isAlreadyDangerCheck[i-2][j-2].equals("--")) {
					if (chessBoard[i - 2][j - 2].equals("pb")) {
						totalDangerValue += 0.5;
						isAlreadyDangerCheck[i-2][j-2] = "pb";
					} else if (chessBoard[i - 2][j - 2].equals("ab")) {
						totalDangerValue += 1.5;
						isAlreadyDangerCheck[i-2][j-2] = "ab";
					} else if (chessBoard[i - 2][j - 2].equals("fb")) {
						totalDangerValue += 1.5;
						isAlreadyDangerCheck[i-2][j-2] = "fb";
					} else if (chessBoard[i - 2][j - 2].equals("kb")) {
						totalDangerValue += 2.5;
						isAlreadyDangerCheck[i-2][j-2] = "kb";
					} else if (chessBoard[i - 2][j - 2].equals("vb")) {
						totalDangerValue += 4.5;
						isAlreadyDangerCheck[i-2][j-2] = "vb";
					} else if (chessBoard[i - 2][j - 2].equals("sb")) {
						totalDangerValue += 50;
						isAlreadyDangerCheck[i-2][j-2] = "sb";
					} else if ((i - 3) >= 0 && (j - 3) >= 0 && !blackPiecesList.contains(chessBoard[i - 3][j - 3]) && isAlreadyDangerCheck[i-3][j-3].equals("--")) {
						if (chessBoard[i - 3][j - 3].equals("pb")) {
							totalDangerValue += 0.5;
							isAlreadyDangerCheck[i-3][j-3] = "pb";
						} else if (chessBoard[i - 3][j - 3].equals("ab")) {
							totalDangerValue += 1.5;
							isAlreadyDangerCheck[i-3][j-3] = "ab";
						} else if (chessBoard[i - 3][j - 3].equals("fb")) {
							totalDangerValue += 1.5;
							isAlreadyDangerCheck[i-3][j-3] = "fb";
						} else if (chessBoard[i - 3][j - 3].equals("kb")) {
							totalDangerValue += 2.5;
							isAlreadyDangerCheck[i-3][j-3] = "kb";
						} else if (chessBoard[i - 3][j - 3].equals("vb")) {
							totalDangerValue += 4.5;
							isAlreadyDangerCheck[i-3][j-3] = "vb";
						} else if (chessBoard[i - 3][j - 3].equals("sb")) {
							totalDangerValue += 50;
							isAlreadyDangerCheck[i-3][j-3] = "sb";
						} else if ((i - 4) >= 0 && (j - 4) >= 0 && !blackPiecesList.contains(chessBoard[i - 4][j - 4]) && isAlreadyDangerCheck[i-4][j-4].equals("--")) {
							if (chessBoard[i - 4][j - 4].equals("pb")) {
								totalDangerValue += 0.5;
								isAlreadyDangerCheck[i-4][j-4] = "pb";
							} else if (chessBoard[i - 4][j - 4].equals("ab")) {
								totalDangerValue += 1.5;
								isAlreadyDangerCheck[i-4][j-4] = "ab";
							} else if (chessBoard[i - 4][j - 4].equals("fb")) {
								totalDangerValue += 1.5;
								isAlreadyDangerCheck[i-4][j-4] = "fb";
							} else if (chessBoard[i - 4][j - 4].equals("kb")) {
								totalDangerValue += 2.5;
								isAlreadyDangerCheck[i-4][j-4] = "kb";
							} else if (chessBoard[i - 4][j - 4].equals("vb")) {
								totalDangerValue += 4.5;
								isAlreadyDangerCheck[i-4][j-4] = "vb";
							} else if (chessBoard[i - 4][j - 4].equals("sb")) {
								totalDangerValue += 50;
								isAlreadyDangerCheck[i-4][j-4] = "pb";
							} else if ((i - 5) >= 0 && (j - 5) >= 0 && !blackPiecesList.contains(chessBoard[i - 5][j - 5]) && isAlreadyDangerCheck[i-5][j-5].equals("--")) {
								if (chessBoard[i - 5][j - 5].equals("pb")) {
									totalDangerValue += 0.5;
									isAlreadyDangerCheck[i-5][j-5] = "pb";
								} else if (chessBoard[i - 5][j - 5].equals("ab")) {
									totalDangerValue += 1.5;
									isAlreadyDangerCheck[i-5][j-5] = "ab";
								} else if (chessBoard[i - 5][j - 5].equals("fb")) {
									totalDangerValue += 1.5;
									isAlreadyDangerCheck[i-5][j-5] = "fb";
								} else if (chessBoard[i - 5][j - 5].equals("kb")) {
									totalDangerValue += 2.5;
									isAlreadyDangerCheck[i-5][j-5] = "kb";
								} else if (chessBoard[i - 5][j - 5].equals("vb")) {
									totalDangerValue += 4.5;
									isAlreadyDangerCheck[i-5][j-5] = "vb";
								} else if (chessBoard[i - 5][j - 5].equals("sb")) {
									totalDangerValue += 50;
									isAlreadyDangerCheck[i-5][j-5] = "sb";
								} else if ((i - 6) >= 0 && (j - 6) >= 0 && !blackPiecesList.contains(chessBoard[i - 6][j - 6]) && isAlreadyDangerCheck[i-6][j-6].equals("--")) {
									if (chessBoard[i - 6][j - 6].equals("pb")) {
										totalDangerValue += 0.5;
										isAlreadyDangerCheck[i-6][j-6] = "pb";
									} else if (chessBoard[i - 6][j - 6].equals("ab")) {
										totalDangerValue += 1.5;
										isAlreadyDangerCheck[i-6][j-6] = "ab";
									} else if (chessBoard[i - 6][j - 6].equals("fb")) {
										totalDangerValue += 1.5;
										isAlreadyDangerCheck[i-6][j-6] = "fb";
									} else if (chessBoard[i - 6][j - 6].equals("kb")) {
										totalDangerValue += 2.5;
										isAlreadyDangerCheck[i-6][j-6] = "kb";
									} else if (chessBoard[i - 6][j - 6].equals("vb")) {
										totalDangerValue += 4.5;
										isAlreadyDangerCheck[i-6][j-6] = "vb";
									} else if (chessBoard[i - 6][j - 6].equals("sb")) {
										totalDangerValue += 50;
										isAlreadyDangerCheck[i-6][j-6] = "sb";
									} else if ((i - 7) >= 0 && (j - 7) >= 0 && !blackPiecesList.contains(chessBoard[i - 7][j - 7]) && isAlreadyDangerCheck[i-7][j-7].equals("--")) {
										if (chessBoard[i - 7][j - 7].equals("pb")) {
											totalDangerValue += 0.5;
											isAlreadyDangerCheck[i-7][j-7] = "pb";
										} else if (chessBoard[i - 7][j - 7].equals("ab")) {
											totalDangerValue += 1.5;
											isAlreadyDangerCheck[i-7][j-7] = "ab";
										} else if (chessBoard[i - 7][j - 7].equals("fb")) {
											totalDangerValue += 1.5;
											isAlreadyDangerCheck[i-7][j-7] = "fb";
										} else if (chessBoard[i - 7][j - 7].equals("kb")) {
											totalDangerValue += 2.5;
											isAlreadyDangerCheck[i-7][j-7] = "kb";
										} else if (chessBoard[i - 7][j - 7].equals("vb")) {
											totalDangerValue += 4.5;
											isAlreadyDangerCheck[i-7][j-7] = "vb";
										} else if (chessBoard[i - 7][j - 7].equals("sb")) {
											totalDangerValue += 50;
											isAlreadyDangerCheck[i-7][j-7] = "sb";
										}
									}
								}
							}
						}
					}
				}
			}
			if ((i + 1) <= 7 && (j - 1) >= 0 && !blackPiecesList.contains(chessBoard[i + 1][j - 1]) && isAlreadyDangerCheck[i+1][j-1].equals("--")) {
				if (chessBoard[i + 1][j - 1].equals("pb")) {
					totalDangerValue += 0.5;
					isAlreadyDangerCheck[i+1][j-1] = "pb";
				} else if (chessBoard[i + 1][j - 1].equals("ab")) {
					totalDangerValue += 1.5;
					isAlreadyDangerCheck[i+1][j-1] = "ab";
				} else if (chessBoard[i + 1][j - 1].equals("fb")) {
					totalDangerValue += 1.5;
					isAlreadyDangerCheck[i+1][j-1] = "fb";
				} else if (chessBoard[i + 1][j - 1].equals("kb")) {
					totalDangerValue += 2.5;
					isAlreadyDangerCheck[i+1][j-1] = "kb";
				} else if (chessBoard[i + 1][j - 1].equals("vb")) {
					totalDangerValue += 4.5;
					isAlreadyDangerCheck[i+1][j-1] = "vb";
				} else if (chessBoard[i + 1][j - 1].equals("sb")) {
					totalDangerValue += 50;
					isAlreadyDangerCheck[i+1][j-1] = "sb";
				} else if ((i + 2) <= 7 && (j - 2) >= 0 && !blackPiecesList.contains(chessBoard[i + 2][j - 2]) && isAlreadyDangerCheck[i+2][j-2].equals("--")) {
					if (chessBoard[i + 2][j - 2].equals("pb")) {
						totalDangerValue += 0.5;
						isAlreadyDangerCheck[i+2][j-2] = "pb";
					} else if (chessBoard[i + 2][j - 2].equals("ab")) {
						totalDangerValue += 1.5;
						isAlreadyDangerCheck[i+2][j-2] = "ab";
					} else if (chessBoard[i + 2][j - 2].equals("fb")) {
						totalDangerValue += 1.5;
						isAlreadyDangerCheck[i+2][j-2] = "fb";
					} else if (chessBoard[i + 2][j - 2].equals("kb")) {
						totalDangerValue += 2.5;
						isAlreadyDangerCheck[i+2][j-2] = "kb";
					} else if (chessBoard[i + 2][j - 2].equals("vb")) {
						totalDangerValue += 4.5;
						isAlreadyDangerCheck[i+2][j-2] = "vb";
					} else if (chessBoard[i + 2][j - 2].equals("sb")) {
						totalDangerValue += 50;
						isAlreadyDangerCheck[i+2][j-2] = "sb";
					} else if ((i + 3) <= 7 && (j - 3) >= 0 && !blackPiecesList.contains(chessBoard[i + 3][j - 3]) && isAlreadyDangerCheck[i+3][j-3].equals("--")) {
						if (chessBoard[i + 3][j - 3].equals("pb")) {
							totalDangerValue += 0.5;
							isAlreadyDangerCheck[i+3][j-3] = "pb";
						} else if (chessBoard[i + 3][j - 3].equals("ab")) {
							totalDangerValue += 1.5;
							isAlreadyDangerCheck[i+3][j-3] = "ab";
						} else if (chessBoard[i + 3][j - 3].equals("fb")) {
							totalDangerValue += 1.5;
							isAlreadyDangerCheck[i+3][j-3] = "fb";
						} else if (chessBoard[i + 3][j - 3].equals("kb")) {
							totalDangerValue += 2.5;
							isAlreadyDangerCheck[i+3][j-3] = "kb";
						} else if (chessBoard[i + 3][j - 3].equals("vb")) {
							totalDangerValue += 4.5;
							isAlreadyDangerCheck[i+3][j-3] = "vb";
						} else if (chessBoard[i + 3][j - 3].equals("sb")) {
							totalDangerValue += 50;
							isAlreadyDangerCheck[i+3][j-3] = "sb";
						} else if ((i + 4) <= 7 && (j - 4) >= 0 && !blackPiecesList.contains(chessBoard[i + 4][j - 4]) && isAlreadyDangerCheck[i+4][j-4].equals("--")) {
							if (chessBoard[i + 4][j - 4].equals("pb")) {
								totalDangerValue += 0.5;
								isAlreadyDangerCheck[i+4][j-4] = "pb";
							} else if (chessBoard[i + 4][j - 4].equals("ab")) {
								totalDangerValue += 1.5;
								isAlreadyDangerCheck[i+4][j-4] = "ab";
							} else if (chessBoard[i + 4][j - 4].equals("fb")) {
								totalDangerValue += 1.5;
								isAlreadyDangerCheck[i+4][j-4] = "fb";
							} else if (chessBoard[i + 4][j - 4].equals("kb")) {
								totalDangerValue += 2.5;
								isAlreadyDangerCheck[i+4][j-4] = "kb";
							} else if (chessBoard[i + 4][j - 4].equals("vb")) {
								totalDangerValue += 4.5;
								isAlreadyDangerCheck[i+4][j-4] = "vb";
							} else if (chessBoard[i + 4][j - 4].equals("sb")) {
								totalDangerValue += 50;
								isAlreadyDangerCheck[i+4][j-4] = "sb";
							} else if ((i + 5) <= 7 && (j - 5) >= 0 && !blackPiecesList.contains(chessBoard[i + 5][j - 5]) && isAlreadyDangerCheck[i+5][j-5].equals("--")) {
								if (chessBoard[i + 5][j - 5].equals("pb")) {
									totalDangerValue += 0.5;
									isAlreadyDangerCheck[i+5][j-5] = "pb";
								} else if (chessBoard[i + 5][j - 5].equals("ab")) {
									totalDangerValue += 1.5;
									isAlreadyDangerCheck[i+5][j-5] = "ab";
								} else if (chessBoard[i + 5][j - 5].equals("fb")) {
									totalDangerValue += 1.5;
									isAlreadyDangerCheck[i+5][j-5] = "fb";
								} else if (chessBoard[i + 5][j - 5].equals("kb")) {
									totalDangerValue += 2.5;
									isAlreadyDangerCheck[i+5][j-5] = "kb";
								} else if (chessBoard[i + 5][j - 5].equals("vb")) {
									totalDangerValue += 4.5;
									isAlreadyDangerCheck[i+5][j-5] = "vb";
								} else if (chessBoard[i + 5][j - 5].equals("sb")) {
									totalDangerValue += 50;
									isAlreadyDangerCheck[i+5][j-5] = "sb";
								} else if ((i + 6) <= 7 && (j - 6) >= 0 && !blackPiecesList.contains(chessBoard[i + 6][j - 6]) && isAlreadyDangerCheck[i+6][j-6].equals("--")) {
									if (chessBoard[i + 6][j - 6].equals("pb")) {
										totalDangerValue += 0.5;
										isAlreadyDangerCheck[i+6][j-6] = "pb";
									} else if (chessBoard[i + 6][j - 6].equals("ab")) {
										totalDangerValue += 1.5;
										isAlreadyDangerCheck[i+6][j-6] = "ab";
									} else if (chessBoard[i + 6][j - 6].equals("fb")) {
										totalDangerValue += 1.5;
										isAlreadyDangerCheck[i+6][j-6] = "fb";
									} else if (chessBoard[i + 6][j - 6].equals("kb")) {
										totalDangerValue += 2.5;
										isAlreadyDangerCheck[i+6][j-6] = "kb";
									} else if (chessBoard[i + 6][j - 6].equals("vb")) {
										totalDangerValue += 4.5;
										isAlreadyDangerCheck[i+6][j-6] = "vb";
									} else if (chessBoard[i + 6][j - 6].equals("sb")) {
										totalDangerValue += 50;
										isAlreadyDangerCheck[i+6][j-6] = "sb";
									} else if ((i + 7) <= 7 && (j - 7) >= 0 && !blackPiecesList.contains(chessBoard[i + 7][j - 7]) && isAlreadyDangerCheck[i+7][j-7].equals("--")) {
										if (chessBoard[i + 7][j - 7].equals("pb")) {
											totalDangerValue += 0.5;
											isAlreadyDangerCheck[i+7][j-7] = "pb";
										} else if (chessBoard[i + 7][j - 7].equals("ab")) {
											totalDangerValue += 1.5;
											isAlreadyDangerCheck[i+7][j-7] = "ab";
										} else if (chessBoard[i + 7][j - 7].equals("fb")) {
											totalDangerValue += 1.5;
											isAlreadyDangerCheck[i+7][j-7] = "fb";
										} else if (chessBoard[i + 7][j - 7].equals("kb")) {
											totalDangerValue += 2.5;
											isAlreadyDangerCheck[i+7][j-7] = "kb";
										} else if (chessBoard[i + 7][j - 7].equals("vb")) {
											totalDangerValue += 4.5;
											isAlreadyDangerCheck[i+7][j-7] = "vb";
										} else if (chessBoard[i + 7][j - 7].equals("sb")) {
											totalDangerValue += 50;
											isAlreadyDangerCheck[i+7][j-7] = "sb";
										}
									}
								}
							}
						}
					}
				}
			}
			if ((i - 1) >= 0 && (j + 1) <= 7 && !blackPiecesList.contains(chessBoard[i - 1][j + 1]) && isAlreadyDangerCheck[i-1][j+1].equals("--")) {
				if (chessBoard[i - 1][j + 1].equals("pb")) {
					totalDangerValue += 0.5;
					isAlreadyDangerCheck[i-1][j+1] = "pb";
				} else if (chessBoard[i - 1][j + 1].equals("ab")) {
					totalDangerValue += 1.5;
					isAlreadyDangerCheck[i-1][j+1] = "ab";
				} else if (chessBoard[i - 1][j + 1].equals("fb")) {
					totalDangerValue += 1.5;
					isAlreadyDangerCheck[i-1][j+1] = "fb";
				} else if (chessBoard[i - 1][j + 1].equals("kb")) {
					totalDangerValue += 2.5;
					isAlreadyDangerCheck[i-1][j+1] = "kb";
				} else if (chessBoard[i - 1][j + 1].equals("vb")) {
					totalDangerValue += 4.5;
					isAlreadyDangerCheck[i-1][j+1] = "vb";
				} else if (chessBoard[i - 1][j + 1].equals("sb")) {
					totalDangerValue += 50;
					isAlreadyDangerCheck[i-1][j+1] = "sb";
				} else if ((i - 2) >= 0 && (j + 2) <= 7 && !blackPiecesList.contains(chessBoard[i - 2][j + 2]) && isAlreadyDangerCheck[i-2][j+2].equals("--")) {
					if (chessBoard[i - 2][j + 2].equals("pb")) {
						totalDangerValue += 0.5;
						isAlreadyDangerCheck[i-2][j+2] = "pb";
					} else if (chessBoard[i - 2][j + 2].equals("ab")) {
						totalDangerValue += 1.5;
						isAlreadyDangerCheck[i-2][j+2] = "ab";
					} else if (chessBoard[i - 2][j + 2].equals("fb")) {
						totalDangerValue += 1.5;
						isAlreadyDangerCheck[i-2][j+2] = "fb";
					} else if (chessBoard[i - 2][j + 2].equals("kb")) {
						totalDangerValue += 2.5;
						isAlreadyDangerCheck[i-2][j+2] = "kb";
					} else if (chessBoard[i - 2][j + 2].equals("vb")) {
						totalDangerValue += 4.5;
						isAlreadyDangerCheck[i-2][j+2] = "vb";
					} else if (chessBoard[i - 2][j + 2].equals("sb")) {
						totalDangerValue += 50;
						isAlreadyDangerCheck[i-2][j+2] = "sb";
					} else if ((i - 3) >= 0 && (j + 3) <= 7 && !blackPiecesList.contains(chessBoard[i - 3][j + 3]) && isAlreadyDangerCheck[i-3][j+3].equals("--")) {
						if (chessBoard[i - 3][j + 3].equals("pb")) {
							totalDangerValue += 0.5;
							isAlreadyDangerCheck[i-3][j+3] = "pb";
						} else if (chessBoard[i - 3][j + 3].equals("ab")) {
							totalDangerValue += 1.5;
							isAlreadyDangerCheck[i-3][j+3] = "ab";
						} else if (chessBoard[i - 3][j + 3].equals("fb")) {
							totalDangerValue += 1.5;
							isAlreadyDangerCheck[i-3][j+3] = "fb";
						} else if (chessBoard[i - 3][j + 3].equals("kb")) {
							totalDangerValue += 2.5;
							isAlreadyDangerCheck[i-3][j+3] = "kb";
						} else if (chessBoard[i - 3][j + 3].equals("vb")) {
							totalDangerValue += 4.5;
							isAlreadyDangerCheck[i-3][j+3] = "vb";
						} else if (chessBoard[i - 3][j + 3].equals("sb")) {
							totalDangerValue += 50;
							isAlreadyDangerCheck[i-3][j+3] = "sb";
						} else if ((i - 4) >= 0 && (j + 4) <= 7 && !blackPiecesList.contains(chessBoard[i - 4][j + 4]) && isAlreadyDangerCheck[i-4][j+4].equals("--")) {
							if (chessBoard[i - 4][j + 4].equals("pb")) {
								totalDangerValue += 0.5;
								isAlreadyDangerCheck[i-4][j+4] = "pb";
							} else if (chessBoard[i - 4][j + 4].equals("ab")) {
								totalDangerValue += 1.5;
								isAlreadyDangerCheck[i-4][j+4] = "ab";
							} else if (chessBoard[i - 4][j + 4].equals("fb")) {
								totalDangerValue += 1.5;
								isAlreadyDangerCheck[i-4][j+4] = "fb";
							} else if (chessBoard[i - 4][j + 4].equals("kb")) {
								totalDangerValue += 2.5;
								isAlreadyDangerCheck[i-4][j+4] = "kb";
							} else if (chessBoard[i - 4][j + 4].equals("vb")) {
								totalDangerValue += 4.5;
								isAlreadyDangerCheck[i-4][j+4] = "vb";
							} else if (chessBoard[i - 4][j + 4].equals("sb")) {
								totalDangerValue += 50;
								isAlreadyDangerCheck[i-4][j+4] = "sb";
							} else if ((i - 5) >= 0 && (j + 5) <= 7 && !blackPiecesList.contains(chessBoard[i - 5][j + 5]) && isAlreadyDangerCheck[i-5][j+5].equals("--")) {
								if (chessBoard[i - 5][j + 5].equals("pb")) {
									totalDangerValue += 0.5;
									isAlreadyDangerCheck[i-5][j+5] = "pb";
								} else if (chessBoard[i - 5][j + 5].equals("ab")) {
									totalDangerValue += 1.5;
									isAlreadyDangerCheck[i-5][j+5] = "ab";
								} else if (chessBoard[i - 5][j + 5].equals("fb")) {
									totalDangerValue += 1.5;
									isAlreadyDangerCheck[i-5][j+5] = "fb";
								} else if (chessBoard[i - 5][j + 5].equals("kb")) {
									totalDangerValue += 2.5;
									isAlreadyDangerCheck[i-5][j+5] = "kb";
								} else if (chessBoard[i - 5][j + 5].equals("vb")) {
									totalDangerValue += 4.5;
									isAlreadyDangerCheck[i-5][j+5] = "vb";
								} else if (chessBoard[i - 5][j + 5].equals("sb")) {
									totalDangerValue += 50;
									isAlreadyDangerCheck[i-5][j+5] = "sb";
								} else if ((i - 6) >= 0 && (j + 6) <= 7 && !blackPiecesList.contains(chessBoard[i - 6][j + 6]) && isAlreadyDangerCheck[i-6][j+6].equals("--")) {
									if (chessBoard[i - 6][j + 6].equals("pb")) {
										totalDangerValue += 0.5;
										isAlreadyDangerCheck[i-6][j+6] = "pb";
									} else if (chessBoard[i - 6][j + 6].equals("ab")) {
										totalDangerValue += 1.5;
										isAlreadyDangerCheck[i-6][j+6] = "ab";
									} else if (chessBoard[i - 6][j + 6].equals("fb")) {
										totalDangerValue += 1.5;
										isAlreadyDangerCheck[i-6][j+6] = "fb";
									} else if (chessBoard[i - 6][j + 6].equals("kb")) {
										totalDangerValue += 2.5;
										isAlreadyDangerCheck[i-6][j+6] = "kb";
									} else if (chessBoard[i - 6][j + 6].equals("vb")) {
										totalDangerValue += 4.5;
										isAlreadyDangerCheck[i-6][j+6] = "vb";
									} else if (chessBoard[i - 6][j + 6].equals("sb")) {
										totalDangerValue += 50;
										isAlreadyDangerCheck[i-6][j+6] = "sb";
									} else if ((i - 7) >= 0 && (j + 7) <= 7 && !blackPiecesList.contains(chessBoard[i - 7][j + 7]) && isAlreadyDangerCheck[i-7][j+7].equals("--")) {
										if (chessBoard[i - 7][j + 7].equals("pb")) {
											totalDangerValue += 0.5;
											isAlreadyDangerCheck[i-7][j+7] = "pb";
										} else if (chessBoard[i - 7][j + 7].equals("ab")) {
											totalDangerValue += 1.5;
											isAlreadyDangerCheck[i-7][j+7] = "ab";
										} else if (chessBoard[i - 7][j + 7].equals("fb")) {
											totalDangerValue += 1.5;
											isAlreadyDangerCheck[i-7][j+7] = "fb";
										} else if (chessBoard[i - 7][j + 7].equals("kb")) {
											totalDangerValue += 2.5;
											isAlreadyDangerCheck[i-7][j+7] = "kb";
										} else if (chessBoard[i - 7][j + 7].equals("vb")) {
											totalDangerValue += 4.5;
											isAlreadyDangerCheck[i-7][j+7] = "vb";
										} else if (chessBoard[i - 7][j + 7].equals("sb")) {
											totalDangerValue += 50;
											isAlreadyDangerCheck[i-7][j+7] = "sb";
										}
									}
								}
							}
						}
					}
				}
			}

		}

		return totalDangerValue;
	}

}
