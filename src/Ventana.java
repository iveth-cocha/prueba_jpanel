import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Ventana {
    private JPanel rootpanel;
    private JTextField codi;
    private JTextField ci;
    private JTextField noms;
    private JTextField apels;
    private JComboBox signo;
    private JComboBox anio;
    private JComboBox mes;
    private JComboBox dia;
    private JCheckBox rojoCheckBox;
    private JCheckBox verdeCheckBox;
    private JCheckBox ningunoCheckBox;
    private JRadioButton siRadioButton;
    private JRadioButton noRadioButton;
    private JButton cargarDatosDesdeDiscoButton;
    private JButton guardarDatosEnDiscoButton;
    private JButton verSiguienteRegistroButton;
    private JButton verAnteriorRegistroButton;

    private ArrayList<Informacion>dato;
    int contador=0;




    public Ventana() {

        dato=new ArrayList();


        guardarDatosEnDiscoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String codico =codi.getText();
                String cedula = ci.getText();
                String nombres=noms.getText();
                String apellidos=apels.getText();
                String sig=signo.getSelectedItem().toString();
                String f_anio=anio.getSelectedItem().toString();
                String f_mes= mes.getSelectedItem().toString();
                String f_dia=dia.getSelectedItem().toString();
               /* String color;
                String casado;*/

                Informacion nuevo = new Informacion(codico,cedula,nombres,apellidos,sig,f_anio,f_mes,f_dia);
                dato.add(nuevo);

                String filePath = "data.dat";
                try(
                        FileOutputStream fileOut = new FileOutputStream(filePath);
                        ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
                ){
                    objOut.writeObject(nuevo);
                    System.out.println("Archivo guardado correctamente");
                }catch (IOException ex){
                    throw new RuntimeException(ex);
                }

                codi.setText("");
                ci.setText("");
                noms.setText("");
                apels.setText("");
                signo.setSelectedIndex(0);
                anio.setSelectedIndex(0);
                mes.setSelectedIndex(0);
                dia.setSelectedIndex(0);





            }
        });
        verAnteriorRegistroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (contador > 0) {
                    contador--;
                    Informacion data = dato.get(contador);
                    System.out.println(data);
                    codi.setText(data.getCodico());
                    ci.setText(data.getCedula());
                    noms.setText(data.getNombres());
                    apels.setText(data.getApellidos());
                    signo.setSelectedItem(data.getSig());
                    anio.setSelectedItem(data.getF_anio());
                    mes.setSelectedItem(data.getF_mes());
                    dia.setSelectedItem(data.getF_dia());


                }

            }
        });
        verSiguienteRegistroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (contador < dato.size() - 1) {
                    contador++;
                    Informacion data = dato.get(contador);
                    System.out.println(data);
                    codi.setText(data.getCodico());
                    ci.setText(data.getCedula());
                    noms.setText(data.getNombres());
                    apels.setText(data.getApellidos());
                    signo.setSelectedItem(data.getSig());
                    anio.setSelectedItem(data.getF_anio());
                    mes.setSelectedItem(data.getF_mes());
                    dia.setSelectedItem(data.getF_dia());


                }

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Estudiantes");
        frame.setContentPane(new Ventana().rootpanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
