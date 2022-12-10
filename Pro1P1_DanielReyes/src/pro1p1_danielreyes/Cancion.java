
package pro1p1_danielreyes;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class Cancion {
    // Atributos
    private String song;
    private String album;
    private String artist;
    private int year;
    private int length;
    
    //Metodo constructor
    public Cancion(String song, String album, String artist, int year, int length){
        this.song = song;
        this.album = album;
        this.artist = artist;
        this.year = year;
        this.length = length;
    }


    public String getSong() {
        return song;
    }
    public void setSong(String song) {
        this.song = song;
    }
    public String getAlbum() {
        return album;
    }
    public void setAlbum(String album) {
        this.album = album;
    }
    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    
    public void Labotify(){
        ArrayList<Cancion> almacen = new ArrayList<>();
        
        
        //Grafico
        JPanel panel = new JPanel();
        JFrame frame = new JFrame("Labotify");
        frame.add(panel);
        panel.setLayout(null);
        panel.setBackground(new Color(169,227,146));
        frame.setLocation(540, 140); // Ubicacion en pantalla centro
        frame.setSize(450,580); // tamaño de frame
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Texto
        JLabel etiqueta = new JLabel("Labotify");
        etiqueta.setForeground(Color.BLACK);
        etiqueta.setFont(new Font("Dialog", 3, 28));
        etiqueta.setBounds(170, 30,200,100);
        panel.add(etiqueta);
        
        //Botones
        JButton boton = new JButton();
        boton.setText("Agregar");
        boton.setFont(new Font("Dialog",3, 12));
        boton.setForeground(Color.WHITE);
        boton.setBounds(170, 140, 110, 25);
        boton.setBackground(Color.BLACK);
        boton.setEnabled(true);
        panel.add(boton);
        
        MouseListener oyente;
        oyente = new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {
                song = JOptionPane.showInputDialog(null, "Cancion: ");
                album = JOptionPane.showInputDialog(null, "Album: ");
                artist = JOptionPane.showInputDialog(null, "Artista: ");
                String year2 = JOptionPane.showInputDialog(null, "Año publicado: ");
                year = Integer.parseInt(year2);
                String length2 = JOptionPane.showInputDialog(null, "Duracion en segundos: ");
                length = Integer.parseInt(length2);
                almacen.add(new Cancion(song,album,artist,year,length));
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        };
        boton.addMouseListener(oyente);
        
        JButton boton2 = new JButton();
        boton2.setText("Eliminar");
        boton2.setFont(new Font("Dialog",3, 12));
        boton2.setForeground(Color.WHITE);
        boton2.setBounds(170, 200, 110, 25);
        boton2.setBackground(Color.BLACK);
        boton2.setEnabled(true);
        panel.add(boton2);
        
        MouseListener oyente2 = new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {
                String result = ""; 
                int cont = 1;
                for(int i = 0; i < almacen.size(); i++){
                    Cancion c = almacen.get(i);
                    result += cont + "- " + c.datos();
                    cont++;
                    result += "\n";
                }
                String num = JOptionPane.showInputDialog(null, result+"\n"
                        + "Ingrese el indice de la canción a eliminar: ");
                int numero = Integer.parseInt(num);
                cont = numero;
                numero = numero - 1;
                JOptionPane.showMessageDialog(null, "Se ha eliminado la canción "+ cont + "- " + almacen.get(numero).datos() );
                almacen.remove(numero);
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        };
        boton2.addMouseListener(oyente2);
        
        JButton boton3 = new JButton();
        boton3.setText("Listar");
        boton3.setFont(new Font("Dialog",3, 12));
        boton3.setForeground(Color.WHITE);
        boton3.setBounds(170, 260, 110, 25);
        boton3.setBackground(Color.BLACK);
        boton3.setEnabled(true);
        panel.add(boton3);
        
        MouseListener oyente3 = new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {
                String result = ""; 
                int cont = 1;
                for(int i = 0; i < almacen.size(); i++){
                    Cancion c = almacen.get(i);
                    result += cont + "- " + c.datos();
                    cont++;
                    result += "\n";
                }
                JOptionPane.showMessageDialog(null, result);
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        };
        boton3.addMouseListener(oyente3);
        
        
        JButton boton4 = new JButton();
        boton4.setText("Información");
        boton4.setFont(new Font("Dialog",3, 12));
        boton4.setForeground(Color.WHITE);
        boton4.setBounds(170, 320, 110, 25);
        boton4.setBackground(Color.BLACK);
        boton4.setEnabled(true);
        panel.add(boton4);
        MouseListener oyente4 = new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {
            String result = ""; 
                int cont = 1;
                for(int i = 0; i < almacen.size(); i++){
                    Cancion c = almacen.get(i);
                    result += cont + "- " + c.datos();
                    cont++;
                    result += "\n";
                }
                String num = JOptionPane.showInputDialog(null, result+"\n"
                        + "Ingrese el indice de la canción para ver la información: ");
                int numero = Integer.parseInt(num);
                numero = numero - 1;
                JOptionPane.showMessageDialog(null, almacen.get(numero).datoscompletos());
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        };
        boton4.addMouseListener(oyente4);
        
        JButton boton5 = new JButton();
        boton5.setText("Modificar");
        boton5.setFont(new Font("Dialog",3, 12));
        boton5.setForeground(Color.WHITE);
        boton5.setBounds(170, 380, 110, 25);
        boton5.setBackground(Color.BLACK);
        boton5.setEnabled(true);
        panel.add(boton5);
        MouseListener oyente5 = new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {
                String result = ""; 
                int cont = 1;
                for(int i = 0; i < almacen.size(); i++){
                    Cancion c = almacen.get(i);
                    result += cont + "- " + c.datos();
                    cont++;
                    result += "\n";
                }
                String num = JOptionPane.showInputDialog(null, result+"\n"
                        + "Ingrese el indice de la canción a editar: ");
                int numero = Integer.parseInt(num);
                numero = numero - 1;
                
                JPanel panel = new JPanel();
                JFrame frame = new JFrame("Modificar Canciones");
                frame.add(panel);
                panel.setLayout(null);
                panel.setBackground(new Color(169,227,146));
                frame.setLocation(540, 140); 
                frame.setSize(450,580); 
                frame.setVisible(true);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                
                //Cancion
                JLabel etiq = new JLabel("Canción:");
                etiq.setBounds(30, 40, 110, 40);
                etiq.setFont(new Font ("Dialog", 3,20));
                panel.add(etiq);
                JTextField caja = new JTextField(almacen.get(numero).getSong());
                caja.setBounds(170, 40, 200, 35);
                panel.add(caja);
                
                //Album
                JLabel etiq2 = new JLabel("Álbum:");
                etiq2.setBounds(30, 140, 110, 40);
                etiq2.setFont(new Font ("Dialog", 3,20));
                panel.add(etiq2);
                JTextField caja2 = new JTextField(almacen.get(numero).getAlbum());
                caja2.setBounds(170, 140, 200, 35);
                panel.add(caja2);
                
                //Artista
                JLabel etiq3 = new JLabel("Artista:");
                etiq3.setBounds(30, 240, 110, 40);
                etiq3.setFont(new Font ("Dialog", 3,20));
                panel.add(etiq3);
                JTextField caja3 = new JTextField(almacen.get(numero).getArtist());
                caja3.setBounds(170, 240, 200, 35);
                panel.add(caja3);
                
                //Año
                JLabel etiq4 = new JLabel("Año:");
                etiq4.setBounds(30, 340, 110, 40);
                etiq4.setFont(new Font ("Dialog", 3,20));
                panel.add(etiq4);
                JTextField caja4 = new JTextField(almacen.get(numero).datosyear());
                caja4.setBounds(170, 340, 200, 35);
                panel.add(caja4);
                
                //Duración
                JLabel etiq5 = new JLabel("Duración:");
                etiq5.setBounds(30, 440, 110, 40);
                etiq5.setFont(new Font ("Dialog", 3,20));
                panel.add(etiq5);
                JTextField caja5 = new JTextField(almacen.get(numero).datoslength());
                caja5.setBounds(170, 440, 200, 35);
                panel.add(caja5);
                
                JButton guardar = new JButton();
                guardar.setText("Guardar");
                guardar.setFont(new Font("Dialog",3, 12));
                guardar.setForeground(Color.BLACK);
                guardar.setBounds(300, 505, 110, 25);
                guardar.setBackground(Color.GREEN);
                guardar.setEnabled(true);
                panel.add(guardar);
                
                ActionListener efecto = new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                       int numero = Integer.parseInt(num);
                       numero = numero -1;
                        song = caja.getText();
                       caja.setText(song);
                       album = caja2.getText();
                       caja2.setText(album);
                       artist = caja3.getText();
                       caja3.setText(artist);
                       String year2="";
                       year2 = caja4.getText();
                       caja4.setText(year2);
                       year = Integer.parseInt(year2);
                       String length2 = "";
                       length2 = caja5.getText();
                       caja5.setText(length2);
                       length = Integer.parseInt(length2);
                       //almacen.add(new Cancion(song,album,artist,year,length));
                       almacen.set(numero, new Cancion(song,album,artist,year,length));
                       frame.dispose();
                       
                        
                    }
                };
                guardar.addActionListener(efecto);
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        };
        boton5.addMouseListener(oyente5);
        
        
        JButton boton6 = new JButton();
        boton6.setText("Menu");
        boton6.setFont(new Font("Dialog",3, 12));
        boton6.setForeground(Color.BLACK);
        boton6.setBounds(170, 440, 110, 25);
        boton6.setBackground(Color.GREEN);
        boton6.setEnabled(true);
        panel.add(boton6);
        
        MouseListener oyente6 = new MouseListener() {
           @Override
           public void mouseClicked(MouseEvent e) {
               Menu menu = new Menu();
               menu.setVisible(true);
               frame.dispose();
               
           }

           @Override
           public void mousePressed(MouseEvent e) {
           }

           @Override
           public void mouseReleased(MouseEvent e) {
           }

           @Override
           public void mouseEntered(MouseEvent e) {
           }

           @Override
           public void mouseExited(MouseEvent e) {
           }
           
       };
       boton6.addMouseListener(oyente6);
       
    
    } 
    public String datos(){
        
        return song + " - " + artist;
    }
    public String datoscompletos(){
        return "Canción: "+ song + "\n"+ "Álbum: "+ album + "\n" + "Artista: "+ artist+ "\n" + "Año: "+ year+ "\n"+ "Duración: "+ length+"s";
    }
    public String datoslength(){
        String length2 = "";
        length2 = Integer.toString(length);
        return length2;
    }
    public String datosyear(){
        String year2 = "";
        year2 = Integer.toString(year);
        return year2;
    }
}
