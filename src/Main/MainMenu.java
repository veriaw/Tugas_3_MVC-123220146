/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import View.Dosen.ViewDataDosen;
import View.Mahasiswa.ViewDataMahasiswa;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Lenovo
 */
public class MainMenu extends JFrame implements ActionListener {
     
    JLabel welcome = new JLabel("Daftar Mahasiswa & Dosen UPNVY");
    JLabel deskripsi = new JLabel("Pilih Menu Terlebih Dahulu!");
    JButton viewMahasiswa = new JButton("Data Mahasiswa");
    JButton viewDosen = new JButton("Data Dosen");
    public MainMenu () {
        setVisible(true);
        setSize(552, 600);
        setLocationRelativeTo(null);
        setTitle("Main Menu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        add(welcome);
        welcome.setBounds(40, 20, 500, 35);
        welcome.setFont(new Font("Arial", Font.PLAIN, 25));

        add(deskripsi);
        deskripsi.setBounds(40, 55, 300, 35);
        deskripsi.setFont(new Font("Arial", Font.ITALIC, 15));
        
        add(viewMahasiswa);
        viewMahasiswa.setBounds(40, 100, 200, 30);
        viewMahasiswa.setFont(new Font("Arial", Font.ITALIC, 15));
        viewMahasiswa.addActionListener(this);
        
        add(viewDosen);
        viewDosen.setBounds(40, 140, 200, 30);
        viewDosen.setFont(new Font("Arial", Font.ITALIC, 15));
        viewDosen.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==viewMahasiswa){
            new ViewDataMahasiswa();
            this.dispose();
        }else{
            new ViewDataDosen();
            this.dispose();
        }
        
    }
}
