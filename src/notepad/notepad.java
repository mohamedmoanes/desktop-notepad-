package notepad;

 import java.io.*;
 import java.awt.*;
 import java.awt.event.*;
 import javax.swing.*;
 import java.awt.print.*;
 
 public class notepad extends JFrame implements ActionListener {
 	private JFileChooser fc = new JFileChooser();
 	private JTextArea dat;
 	private JMenuBar menu = new JMenuBar();
 	private JMenu file, edit, format, font, bg, fg, help;
 	private JMenuItem nu, open, save, saveas, exit, copy,cut, paste, clear, sall, print,  about, b8, b14, b18, b25, b30, bb, br, bge, fb, fr, fge;
 	
 	
 	void file_menu()
 	{
 		////////////////////////////////// by3ml add lal file menu we al items gowaha //////////////////////////////////////
 		file = new JMenu("File");
 		menu.add(file);
 		
 		nu = new JMenuItem("New");
 		KeyStroke keyStrokeToOpen1 = KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_DOWN_MASK);
		nu.setAccelerator(keyStrokeToOpen1);
 		file.add(nu);
 		nu.addActionListener(this);
 		
 		open = new JMenuItem("open");
 		KeyStroke keyStrokeToOpen2 = KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.CTRL_DOWN_MASK);
		open.setAccelerator(keyStrokeToOpen2);
 		file.add(open);
 		open.addActionListener(this);
 		
 		file.add(new JSeparator());
 		
 		save = new JMenuItem("save");
 		KeyStroke keyStrokeToOpen3 = KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_DOWN_MASK);
		save.setAccelerator(keyStrokeToOpen3);
 		file.add(save);
 		save.addActionListener(this);
 		
 		saveas = new JMenuItem("save as");
 		KeyStroke keyStrokeToOpen4 = KeyStroke.getKeyStroke(KeyEvent.VK_S,KeyEvent.SHIFT_DOWN_MASK);
		saveas.setAccelerator(keyStrokeToOpen4);
 		file.add(saveas);
 		saveas.addActionListener(this);
 		
 		file.add(new JSeparator());
 		
 		print = new JMenuItem("print");
 		KeyStroke keyStrokeToOpen5 = KeyStroke.getKeyStroke(KeyEvent.VK_P, KeyEvent.CTRL_DOWN_MASK);
		print.setAccelerator(keyStrokeToOpen5);
 		file.add(print);
 		print.addActionListener(this);
 		
 		file.add(new JSeparator());
 		
 		exit = new JMenuItem("exit");
 		file.add(exit);
 		exit.addActionListener(this);
 	}
 	void edit_menu()
 	{
 		////////////////////////////////////// by3mal add lal edit fe al menu we by70t al items gowaha ///////////////////
 		edit = new JMenu("Edit");
 		menu.add(edit);
 		
 		format = new JMenu("Format");
 		menu.add(format);
 			
 		sall = new JMenuItem("select all");
 		KeyStroke keyStrokeToOpen6 = KeyStroke.getKeyStroke(KeyEvent.VK_A, KeyEvent.CTRL_DOWN_MASK);
		sall.setAccelerator(keyStrokeToOpen6);
 		edit.add(sall);
 		sall.addActionListener(this);
 		
 		copy = new JMenuItem("copy");
 		KeyStroke keyStrokeToOpen7 = KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.CTRL_DOWN_MASK);
		copy.setAccelerator(keyStrokeToOpen7);
 		edit.add(copy);
 		copy.addActionListener(this);
 		
 		cut = new JMenuItem("cut");
 		KeyStroke keyStrokeToOpen10 = KeyStroke.getKeyStroke(KeyEvent.VK_X, KeyEvent.CTRL_DOWN_MASK);
		cut.setAccelerator(keyStrokeToOpen10);
 		edit.add(cut);
 		cut.addActionListener(this);
 		
 		paste = new JMenuItem("paste");
 		KeyStroke keyStrokeToOpen8 = KeyStroke.getKeyStroke(KeyEvent.VK_V, KeyEvent.CTRL_DOWN_MASK);
		paste.setAccelerator(keyStrokeToOpen8);
 		edit.add(paste);
 		paste.addActionListener(this);
 		
 		clear = new JMenuItem("clear");
 		edit.add(clear);
 		clear.addActionListener(this);
 	}
 	void font_menu()
 	{
 		//////////////////////////////////////by3mal add lal fot fe al menu we al options bata3tha gwaha /////////////////////
 		
 		font = new JMenu("font");
 		format.add(font);
 		font.addActionListener(this);
 		
 		b8 = new JMenuItem("8");
 		font.add(b8);
 		b8.addActionListener(this);
 		
 		b14 = new JMenuItem("14");
 		font.add(b14);
 		b14.addActionListener(this);
 		
 		b18 = new JMenuItem("18");
 		font.add(b18);
 		b18.addActionListener(this);
 		
 		b25 = new JMenuItem("25");
 		font.add(b25);
 		b25.addActionListener(this);
 		
 		b30 = new JMenuItem("30");
 		font.add(b25);
 		b25.addActionListener(this);
 		
 		bg = new JMenu("Background Color");
 		format.add(bg);
 		
 		bb = new JMenuItem("Blue");
 		bb.addActionListener(this);
 		bg.add(bb);
 		
 		br = new JMenuItem("Red");
 		br.addActionListener(this);
 		bg.add(br);
 		
 		bge = new JMenuItem("Green");
 		bge.addActionListener(this);
 		bg.add(bge);
 		
 		fg = new JMenu("Text Color");
 		format.add(fg);
 		
 		fb = new JMenuItem("Blue");
 		fb.addActionListener(this);
 		fg.add(fb);
 		
 		fr = new JMenuItem("Red");
 		fr.addActionListener(this);
 		fg.add(fr);
 		
 		fge = new JMenuItem("Green");
 		fge.addActionListener(this);
 		fg.add(fge);
 	}
 	void help_menu()
 	{
 			////////////////////////////////// by3 mal add lal help we gowaha about ///////////////////////////////////////////// 
 		help = new JMenu("Help");
 		menu.add(help);
 		
 		about = new JMenuItem("about");
 		help.add(about);
 		about.addActionListener(this);
 	}
 	public notepad() {
 		setLocation(400, 100);
 		setTitle("Notepad ");
 		setSize(500,500);
 		file_menu();
 		edit_menu();
 		font_menu();
 		help_menu();
 		
 		dat = new JTextArea( );
 		
 		JPanel spane = new JPanel(new GridLayout(0, 1));
 		spane.add(dat);
 		
 		JScrollPane sp = new JScrollPane(spane);
 		
 		JPanel mpane = new JPanel(new GridLayout(0, 1));
 		getContentPane().add(sp);
 		setJMenuBar(menu);
 	}
 	public void actionPerformed(ActionEvent e) {
 		if (e.getSource() == nu) {
 			int nuask = JOptionPane.showConfirmDialog(notepad.this,"Are you sure? This will make a erease any unsaved documents!");
 			if (nuask == JOptionPane.YES_OPTION) {
 				dat.setText("");
 			}
 		}
 		if (e.getSource() == open) {
 			int returnVal = fc.showOpenDialog(notepad.this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
               File file = fc.getSelectedFile();
               try {
                   BufferedReader inputStream = new BufferedReader(new FileReader(file.getPath()));
                   String inputLine;
                   dat.setText("");
                   setTitle("notepad-"+file.getName());
                   while((inputLine = inputStream.readLine()) != null) {
                         dat.append(inputLine+"\n");
                   }
               }
               catch(FileNotFoundException ioe) {
                    JOptionPane.showMessageDialog(null, "Sorry,File Not Found", "", JOptionPane.WARNING_MESSAGE );
               }
               catch(IOException ioe) {
                    System.out.println(file.getAbsoluteFile());
               }
            }
 		}
 		if (e.getSource() == save) {
 			try {
                File file = fc.getSelectedFile();
                FileWriter outputStream=new FileWriter(file.getPath());
                outputStream.write(dat.getText());
                outputStream.close();	
                setTitle("Text Editor-"+file.getName());
            }
            catch(IOException ioe) {
            	System.out.println("IOException");
            }
 		}
 		if (e.getSource() == saveas) {
 			int returnVal = fc.showSaveDialog(notepad.this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                try {
                    File file = fc.getSelectedFile();
                    FileWriter outputStream=new FileWriter(file.getPath()+".txt");        				
                    setTitle("notepad-"+file.getName());
                    outputStream.write(dat.getText());
                    outputStream.close();
                }
                catch(IOException ioe) {
                     System.out.println("IOException");
                }
            }
 		}
 		if(e.getSource() == print)
 		{
 			try
 			{
 			
 			boolean complete =dat.print();
 			if(complete){
 				JOptionPane.showMessageDialog(null, "Done printing ", "Information ", JOptionPane.INFORMATION_MESSAGE );
 			}else{
 				JOptionPane.showMessageDialog(null, "printing ! error", "printer", JOptionPane.WARNING_MESSAGE );
 			}
 			}
 			catch (PrinterException ee)
 			{
 				JOptionPane.showMessageDialog(null,e);
 			}
 		}
 		if (e.getSource() == exit) {
 			int aske = JOptionPane.showConfirmDialog(notepad.this,"Are you sure you want to exit " +getTitle() + " ?");
 			if (aske == JOptionPane.YES_OPTION) {
 				System.exit(0);
 			}
 		}
 		if (e.getSource() == sall) {
 			//coming
 		}
 		if (e.getSource() == copy) {
 			dat.copy();
 		}
 		if (e.getSource() == cut) {
 			dat.cut();
 		}
 		if (e.getSource() == paste) {
 			dat.paste();
 		}
 		if (e.getSource() == clear) {
 			int cask = JOptionPane.showConfirmDialog(notepad.this,"Are you sure you want to clear the document?");
 			if (cask == JOptionPane.YES_OPTION) {
 				dat.setText("");
 				setTitle("Notepad ");
 			}
 		}
 		if (e.getSource() == b8) {
 			dat.setFont(new Font(dat.getFont().getName(),dat.getFont().getStyle(),8));
 		}
 		if (e.getSource() == b14) {
 			dat.setFont(new Font(dat.getFont().getName(),dat.getFont().getStyle(),14));
 		}
 		if (e.getSource() == b18) {
 			dat.setFont(new Font(dat.getFont().getName(),dat.getFont().getStyle(),18));
 		}
 		if (e.getSource() == b25) {
 			dat.setFont(new Font(dat.getFont().getName(),dat.getFont().getStyle(),25));
 		}
 		if (e.getSource() == b30) {
 			dat.setFont(new Font(dat.getFont().getName(),dat.getFont().getStyle(),30));
 		}
 		if (e.getSource() == about) {
 			JOptionPane.showMessageDialog(null, "Created by team 23 \n mohamed moanes c:7\n mohamed tarek c:7\n mostafa abd el ghany c:8\nErrors:\n--------------------------------------------------------\n1.Saving color (background & textcolor)", "", JOptionPane.INFORMATION_MESSAGE);
 		}
 		if (e.getSource() == bb) {
 			dat.setBackground(Color.BLUE);
 		}
 		if (e.getSource() == br) {
 			dat.setBackground(Color.RED);
 		}
 		if (e.getSource() == bge) {
 			dat.setBackground(Color.GREEN);
 		}
 		if (e.getSource() == fb) {
 			dat.setForeground(Color.BLUE);
 		}
 		if (e.getSource() == fr) {
 			dat.setForeground(Color.RED);
 		}
 		if (e.getSource() == fge) {
 			dat.setForeground(Color.GREEN);
 		}
 	}
 	public static void main (String args[]) {
 		new notepad().setVisible(true);
 	}
 }