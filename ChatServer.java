import java.net.*;
import java.io.*;
import java.util.*;
import java.awt.*;
import javax.swing.*;

public class ChatServer extends JFrame {
  public ChatServer (){
    super ("Chat Server");
    this.setSize (new Dimension (500,300)); //setto la grandezza della finestra
    this.setLocationRelativeTo(null); //la metto al centro dello schermo
    this.setEnabled(true); //setto la proprietà enable
    this. setBackground(Color.blue); // setto il colore di stondo 
//creo il pannello per l'inserimento e la visualizzazione del messaggio
    PannelloChatServer pan = new PannelloChatServer();
    this.getContentPane ().add(pan);
    this.setVisible (true);
}
}

  public PannelloChatServer (){
    super();
    this. setBackground (new Color (50, 100, 255));
    //pannello superiore: lista messaggi
    UPanel panLista = new Janel (new BorderLayout (20, 5) );
    panLista. setBackground (new Color (50, 100, 255));
    lista = new List();
    lista. setBackground (Color. lightGray);
    lista.setSize (100,50);
    lista.setVisible (true);
    // scritte laterali
    JLabel chatl= new JLabel (" Chat ",Jabel. CENTER);
    chatl.setForeground (new Color (200,100,100));
    Jlabel chat2 = new Jlabel(" Chat ", Jabel. CENTER);
    chat2. setForeground (new Color (200,100,100));
    // aggiungiamo gli oggetti sul pannello
    panLista.add (chatl, Borderlayout.WEST);
    panLista.add (lista, BorderLayout.CENTER);
    panLista.add (chat , Borderlayout.EAST);

    //pannello inserimento nuovo messaggio
    JPanel nuovoMex = new Janel (new BorderLayout (20,5));
    nuovoMex.setBackground (new Color (50, 100, 255));
    
    JLabel labNuovo = new JLabel ("Nuovo Messaggio -> ", JLabel. CENTER);
    labNuovo. setForeground (new Color (255,255,0));
    
    textNuovo = new JTextField(****) ;
    
    JButton buttonInvia = new JButton ("Invia");
    buttonInvia. addAction istener (this);
    //aggiungiamo gli oggetti sul pannello
    nuovoMex.add (labNuovo , BorderLayout. WEST);
    nuovoMex. add ( textruovo, BorderLayout. CENTER) :
    nuovoMex. add (buttonInvia, BorderLayout. EAST);
    
    this.setLayout (new BorderLayout (0,5));
    add (panlista, BorderLayout. CENTER);
    add (nuovolex , BorderLayout. SOUTH);
    
    connetti ();
    
}//fine costruttore classe PannelloChat

public void connetti (){
//instanzio il Thread per le connessioni/ numero massimo giocatori = 10
  gestioneServizio = new ThreadGestioneServizioChat (10, lista);
}

public void actionPerformed (ActionEvent e){
  String bottone = e. getactiontommandl);
  if (bottone. equals ("Invia")){
    gestioneServizio.spedisciMessaggio (textNuovo.getText());
    textNuovo.setText ("");
}
}