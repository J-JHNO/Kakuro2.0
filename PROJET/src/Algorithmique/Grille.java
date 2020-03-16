package Algorithmique;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.util.Random;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import javax.swing.text.*;

public class Grille extends JFrame implements ActionListener {
	private JFrame frame=new JFrame();
	private JPanel insertion=new JPanel();
	private static Dimension dim=new Dimension(50,40);
	public String[][] tab=new String[8][8];
	public String[][] tabSolu = new String[8][8];
	public int[][] tabInt = new int[8][8]; 
	public JButton[][] TaBoutton=new JButton[8][8];
	public JTextField[][] tabText=new JTextField[8][8];
	public JTextField test = new JTextField("");
	public JTextField test2 = new JTextField("");
	//public JTextField[][] tabVide=new JTextField[8][8]; 
	public Random rdm= new Random();
	
	private JButton bouton  = new JButton("ENVOYER");
	
	public void initTabSolu() {
		// case texte
		tabSolu[1][1] = "9";
		tabSolu[1][2] = "7";
		tabSolu[1][5] = "8";
		tabSolu[1][6] = "7";
		tabSolu[1][7] = "9";
		tabSolu[2][1] = "8";
		tabSolu[2][2] = "9";
		tabSolu[2][4] = "8";
		tabSolu[2][5] = "9";
		tabSolu[2][6] = "5";
		tabSolu[2][7] = "7";
		tabSolu[3][1] = "6";
		tabSolu[3][2] = "8";
		tabSolu[3][3] = "5";
		tabSolu[3][4] = "9";
		tabSolu[3][5] = "7";
		tabSolu[4][2] = "6";
		tabSolu[4][3] = "1";
		tabSolu[4][5] = "2";
		tabSolu[4][6] = "6";
		tabSolu[5][3] = "4";
		tabSolu[5][4] = "6";
		tabSolu[5][5] = "1";
		tabSolu[5][6] = "3";
		tabSolu[5][7] = "2";
		tabSolu[6][1] = "8";
		tabSolu[6][2] = "9";
		tabSolu[6][3] = "3";
		tabSolu[6][4] = "1";
		tabSolu[6][6] = "1";
		tabSolu[6][7] = "4";
		tabSolu[7][1] = "3";
		tabSolu[7][2] = "1";
		tabSolu[7][3] = "2";
		tabSolu[7][6] = "2";
		tabSolu[7][7] = "1";
	}

	public void initTab()
	{
		for(int i=0;i<8;i++)
		{
			for(int j=0;j<8;j++)
			{
				int nombre=rdm.nextInt(9);
				
				while(nombre==0)
        		{
        			nombre = rdm.nextInt(9);
        		
        		}
        		String nbrS=String.valueOf(nombre);
				tab[i][j]=nbrS;
				tabInt[i][j] = 0;
			}
			
		}
			
	}

	public void initTabNoir() {
		for (int i=0; i<8; i++) {
			TaBoutton[i][0].setBackground(Color.BLACK);
			TaBoutton[i][0].setText(null);
			TaBoutton[i][0].setVisible(true);
			tabText[i][0].setVisible(false);
			tab[i][0] = "-1";

			TaBoutton[0][i].setBackground(Color.BLACK);
			TaBoutton[0][i].setText(null);
			TaBoutton[0][i].setVisible(true);
			tabText[0][i].setVisible(false);
			tab[0][i] = "-1";
		}

		TaBoutton[1][3].setBackground(Color.BLACK);
		TaBoutton[1][3].setText(null);
		TaBoutton[1][3].setVisible(true);
		tabText[1][3].setVisible(false);
		tab[1][3] = "-1";

		TaBoutton[3][7].setBackground(Color.BLACK);
		TaBoutton[3][7].setText(null);
		TaBoutton[3][7].setVisible(true);
		tabText[3][7].setVisible(false);
		tab[3][7] = "-1";

		TaBoutton[7][4].setBackground(Color.BLACK);
		TaBoutton[7][4].setText(null);
		TaBoutton[7][4].setVisible(true);
		tabText[7][4].setVisible(false);
		tab[7][4] = "-1";
	}

	public void initSomme() {
		TaBoutton[2][3].setBackground(Color.BLUE);
		TaBoutton[2][3].setText(null);
		TaBoutton[2][3].setVisible(true);
		tabText[2][3].setVisible(false);
		tab[2][3] = "-1";

		TaBoutton[1][4].setBackground(Color.BLUE);
		TaBoutton[1][4].setText(null);
		TaBoutton[1][4].setVisible(true);
		tabText[1][4].setVisible(false);
		tab[1][4] = "-1";

		TaBoutton[4][4].setBackground(Color.BLUE);
		TaBoutton[4][4].setText(null);
		TaBoutton[4][4].setVisible(true);
		tabText[4][4].setVisible(false);
		tab[4][4] = "-1";

		TaBoutton[5][2].setBackground(Color.BLUE);
		TaBoutton[5][2].setText(null);
		TaBoutton[5][2].setVisible(true);
		tabText[5][2].setVisible(false);
		tab[5][2] = "-1";

		TaBoutton[6][5].setBackground(Color.BLUE);
		TaBoutton[6][5].setText(null);
		TaBoutton[6][5].setVisible(true);
		tabText[6][5].setVisible(false);
		tab[6][5] = "-1";

		TaBoutton[5][1].setBackground(Color.BLUE);
		TaBoutton[5][1].setText(null);
		TaBoutton[5][1].setVisible(true);
		tabText[5][1].setVisible(false);
		tab[5][1] = "-1";

		TaBoutton[3][6].setBackground(Color.BLUE);
		TaBoutton[3][6].setText(null);
		TaBoutton[3][6].setVisible(true);
		tabText[3][6].setVisible(false);
		tab[3][6] = "-1";

		TaBoutton[4][7].setBackground(Color.BLUE);
		TaBoutton[4][7].setText(null);
		TaBoutton[4][7].setVisible(true);
		tabText[4][7].setVisible(false);

		TaBoutton[4][1].setBackground(Color.BLUE);
		TaBoutton[4][1].setText(null);
		TaBoutton[4][1].setVisible(true);
		tabText[4][1].setVisible(false);
		tab[4][1] = "-1";

		TaBoutton[7][5].setBackground(Color.BLUE);
		TaBoutton[7][5].setText(null);
		TaBoutton[7][5].setVisible(true);
		tabText[7][5].setVisible(false);
		tab[7][5] = "-1";

		TaBoutton[0][1].setBackground(Color.BLUE);
		TaBoutton[0][1].setText(null);
		TaBoutton[0][1].setVisible(true);
		tabText[0][1].setVisible(false);
		tab[0][1] = "-1";

		TaBoutton[0][2].setBackground(Color.BLUE);
		TaBoutton[0][2].setText(null);
		TaBoutton[0][2].setVisible(true);
		tabText[0][2].setVisible(false);
		tab[0][2] = "-1";

		TaBoutton[0][5].setBackground(Color.BLUE);
		TaBoutton[0][5].setText(null);
		TaBoutton[0][5].setVisible(true);
		tabText[0][5].setVisible(false);
		tab[0][5] = "-1";

		TaBoutton[0][6].setBackground(Color.BLUE);
		TaBoutton[0][6].setText(null);
		TaBoutton[0][6].setVisible(true);
		tabText[0][6].setVisible(false);
		tab[0][6] = "-1";

		TaBoutton[0][7].setBackground(Color.BLUE);
		TaBoutton[0][7].setText(null);
		TaBoutton[0][7].setVisible(true);
		tabText[0][7].setVisible(false);
		tab[0][7] = "-1";

		TaBoutton[1][0].setBackground(Color.BLUE);
		TaBoutton[1][0].setText(null);
		TaBoutton[1][0].setVisible(true);
		tabText[1][0].setVisible(false);
		tab[1][0] = "-1";

		TaBoutton[2][0].setBackground(Color.BLUE);
		TaBoutton[2][0].setText(null);
		TaBoutton[2][0].setVisible(true);
		tabText[2][0].setVisible(false);
		tab[2][0] = "-1";

		TaBoutton[3][0].setBackground(Color.BLUE);
		TaBoutton[3][0].setText(null);
		TaBoutton[3][0].setVisible(true);
		tabText[3][0].setVisible(false);
		tab[3][0] = "-1";

		TaBoutton[6][0].setBackground(Color.BLUE);
		TaBoutton[6][0].setText(null);
		TaBoutton[6][0].setVisible(true);
		tabText[6][0].setVisible(false);
		tab[6][0] = "-1";

		TaBoutton[7][0].setBackground(Color.BLUE);
		TaBoutton[7][0].setText(null);
		TaBoutton[7][0].setVisible(true);
		tabText[7][0].setVisible(false);
		tab[7][0] = "-1";
	}

	public void initCaseVide() {
		for(int i=0;i<8;i++)
		{
			for(int j=0;j<8;j++)
			{
				tabText[i][j] = new JTextField();
				
				tabText[i][j].setPreferredSize(dim);

				
			}
		}


	}
		
	public void initButton()
	{
		for(int i=0;i<8;i++)
		{
			for(int j=0;j<8;j++)
			{
				TaBoutton[i][j]=new JButton(tab[i][j]);
				
				TaBoutton[i][j].setPreferredSize(dim);
				TaBoutton[i][j].setVisible(false);
				
			}
		}	
		
	}
	
	// public void caseNoir()
	// {
	// 	for(int i=1;i<8;i++)
	// 	{
	// 		for(int j=1;j<8;j++)
	// 		{
	// 			int c1=rdm.nextInt(5);
	// 			int c2=rdm.nextInt(5);
				
	// 			if(c1==c2)
	// 			{
	// 				TaBoutton[i][j].setBackground(Color.BLACK);
	// 				TaBoutton[i][j].setText(null);
					
	// 			}
				
	// 		}
	// 	}
		
	// }

	

	public void addBouton() {
		insertion.setPreferredSize(new Dimension(450,400));
		for(int i=0;i<8;i++)
		{
			for(int j=0;j<8;j++)
			{
				 insertion.add(TaBoutton[i][j]);
				 insertion.add(tabText[i][j]);
				 tabSolu[i][j] = "";
				 //tabSolu[0][0] = "-1";
				 //tabVide[i][j].setPreferredSize(dim);
				 //insertion.add(tabVide[i][j]);
				
			}
		}
		
	}

	public void actionPerformed(ActionEvent evt) {
		TaBoutton[0][0].setBackground(Color.RED);
		String texte ;
		String texteS = " ggg ";
		for (int i=0; i<8; i++) {
			for (int j=0; j<8; j++) {
				texte = (tabText[i][j].getText());
				tab[i][j] = texte;
			}
		}
		
		test.setText(tab[1][1]);
		test.setPreferredSize(dim);
		insertion.add(test);

		estSolution();

		// if (tab[1][1].equals("9")) {
		// 	TaBoutton[0][1].setBackground(Color.RED);
		// 	TaBoutton[0][1].setText("3");
		// }
	}

	public void estSolution() {
		boolean b = true;
		for (int i=0; i<8; i++) {
			for (int j=0; j<8; j++) {
				if (!tab[j][i].equals(tabSolu[i][j])){
					b = false;
				}
			}
		}
		if (tab[2][1].equals(tabSolu[2][1])){
			test2.setText("gagné"); 
		}
		else {
			test2.setText("pas encore gagné");
		}

		TaBoutton[0][1].setText("");
		insertion.add(test2);
	}

	public boolean checkCase(int i, int j) {
		if (j != 0) {
			if (i != 7 && j != 7) {
				if ((TaBoutton[i][j].getBackground() == Color.BLACK) || (tab[i][j] == "somme") || (tab[i][j] == "vide") || checkCaseSomme(i,j-1) || checkCaseSomme(i+1,j) || checkCaseSomme(i,j+1) || checkCaseSomme(i+1,j)){
					return true;
				}
				else return false;
			}
			else return true;
		}
		else {
			if (i != 7 && j != 7) {
				if ((TaBoutton[i][j].getBackground() == Color.BLACK) || (tab[i][j] == "somme") || (tab[i][j] == "vide") || checkCaseSomme(i,j+1) || checkCaseSomme(i+1,j)){
					return true;
				}
				else return false;
			}
			else return true;
		}
	}

	public boolean checkCaseSomme(int i, int j) {
		if (i != 8 && j != 8) {
			if ((TaBoutton[i][j].getBackground() == Color.BLACK) || (tab[i][j] == "somme") || (tab[i][j] == "vide")){
				return true;
			}
			else return false;
		}
		else return true;
	}


	public boolean tabComplet(String[][] t) {
		//boolean b = true;
		for(int i=0;i<8;i++)
		{
			for(int j=0;j<8;j++)
			{
				if ((tab[i][j] != "somme") && (tab[i][j] != "vide") /*&& (TaBoutton[i][j].getBackground() != Color.BLACK)*/) {
					return false;
				}
			}
		}
		return true;
	}

	public void initTabInt(int[] tab, int taille) {
		for (int i=0; i<taille; i++) {
			tab[i] = -1;
		}
	}

	public boolean estDansTab(String x, int[] tab, int taille) {
		int val = Integer.parseInt(x);
		for (int i=0; i<taille; i++) {
			if (tab[i] == val) {
				return false;
			}
		}
		return true;
	}

	public void ajoutTab(int x, int[] tab, int taille) {
		int count = 0, i = 0;
		while ((i < 8) && (tab[i] != -1)) {
			count++;
			i++;
		}
		tab[count] = x;
	}

	// public void initSomme() {
	// 	int[] existeInt = new int[8]; 
	// 	initTabInt(existeInt,8);
	// 	int somme = 0;
	// 	String sommeS = null;
	// 	int nbr = 0;
	// 	int i=0,j=0,k=0,iDepart=0,jDepart=0;
	// 	while (/*tabComplet(tab) == false*/ k != 8) {
	// 		somme = 0;
	// 		i = rdm.nextInt(7)+1;
			
	// 		iDepart = i;
	// 		j = rdm.nextInt(7)+1;
			
	// 		jDepart = j;
	// 		initTabInt(existeInt,8);
	// 		int val = -2;
	// 		if (checkCase(i,j) == false) {
	// 			j++;
	// 			while ((checkCaseSomme(i,j) == false) && (estDansTab(tab[i][j],existeInt,8))) {
	// 				String ca = tab[i][j];
	// 				nbr = Integer.parseInt(ca);
	// 				ajoutTab(nbr,existeInt,8);
	// 				somme = somme + nbr;
	// 				tab[i][j] = "vide";
	// 				TaBoutton[i][j].setForeground(Color.BLUE);
	// 				j++;
	// 			}
	// 			sommeS = String.valueOf(somme);
	// 			TaBoutton[iDepart][jDepart].setText(sommeS);
	// 			TaBoutton[iDepart][jDepart].setForeground(Color.RED);
	// 			tab[iDepart][jDepart] = "somme";
				
	// 			k++;
	// 		}
			
	// 	}

	// }


	
	public Grille()
	{
		
		initTab();
		initButton();
		initCaseVide();
		addBouton();
		initTabNoir();
		initSomme();
		initTabSolu();
		
		//caseNoir();
		//initSomme();
		//addBouton();
		
		//ActionEvent actionPerformed2 = new ActionEvent()
		bouton.addActionListener(this);
		insertion.add(bouton);

		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setContentPane(insertion);
	       // on demander d'attribuer une taille minimale à la fenêtre
	       //  (juste assez pour voir tous les composants)
	      frame.pack();
	       // on centre la fenêtre
	       frame.setLocationRelativeTo(null);
	       // on rend la fenêtre visible
	       frame.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		
		Grille grille=new Grille();
	}
	
	
	

}
