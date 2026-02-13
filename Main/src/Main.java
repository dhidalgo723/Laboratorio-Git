import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;


public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenido al Calculador de Notas");
    }

    public static void afegirnNota(int assignatura, int notaNova, Alumno a){
            a.setNotas(assignatura, notaNova);
    
        //INTERFAZ GRAFICA

         // LOOK and FEEL
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        //VENTANA PRINCIPAL
        JFrame f = new JFrame("Calculador de Notas");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Cierre al cerrar la ventana
        JPanel panelPrincipal = new JPanel(new GridBagLayout());// Layout para organizar componentes dentro del panel principal
        panelPrincipal.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));// Margen interno para mejor apariencia
        f.add(panelPrincipal);
        GridBagConstraints gbc = new GridBagConstraints();// Constraints para organizar componentes en el GridBagLayout
        gbc.insets = new Insets(5, 5, 5, 5);// Espaciado entre componentes
        gbc.fill = GridBagConstraints.HORIZONTAL;// Para que los componentes ocupen todo el espacio horizontal disponible

        //NOMBRE DEL ALUMNO(recoje el nombre y la guarda en la variable nombre del objeto alumno)
        
        gbc.gridy = 0; gbc.gridx = 0;//Fila 0, Columna 0
        panelPrincipal.add(new JLabel("Nombre del alumno:"), gbc);// Etiqueta para el campo de nombre
        gbc.gridx = 1; gbc.gridwidth = 2;// El campo de texto ocupará 2 columnas
        JTextField txtNombre = new JTextField(15);// Campo de texto para el nombre del cliente
        panelPrincipal.add(txtNombre, gbc);

        //NOTAS DEL ALUMNO(recoje cada nora por separado de las asignaturas: matematicas, lengua, ingles, historia, geografia y tecnologia y las guarda en las variables correspondientes del objeto alumno)
        
        //NOTA DE MATEMATICAS
        gbc.gridy = 1; gbc.gridx = 0; gbc.gridwidth = 1;//Fila 1, Columna 0
        panelPrincipal.add(new JLabel("Nota de Matemáticas:"), gbc);// Etiqueta para la nota de matemáticas 
        gbc.gridx = 1; gbc.gridwidth = 2;// El campo de texto ocupará 2 columnas
        JTextField txtMatematicas = new JTextField(5);// Campo de texto para la nota de matemáticas
        panelPrincipal.add(txtMatematicas, gbc);       

        //NOTA DE LENGUA
        gbc.gridy = 2; gbc.gridx = 0; gbc.gridwidth = 1;//Fila 2, Columna 0
        panelPrincipal.add(new JLabel("Nota de Lengua:"), gbc);// Etiqueta para la nota de lengua
        gbc.gridx = 1; gbc.gridwidth = 2;// El campo de texto ocupará 2 columnas
        JTextField txtLengua = new JTextField(5);// Campo de texto para la nota de lengua
        panelPrincipal.add(txtLengua, gbc); 

        //NOTA DE INGLES
        gbc.gridy = 3; gbc.gridx = 0; gbc.gridwidth = 1;//Fila 3, Columna 0
        panelPrincipal.add(new JLabel("Nota de Inglés:"), gbc);// Etiqueta para la nota de inglés
        gbc.gridx = 1; gbc.gridwidth = 2;// El campo de texto ocupará 2 columnas
        JTextField txtIngles = new JTextField(5);// Campo de texto para la nota de inglés
        panelPrincipal.add(txtIngles, gbc);

        //NOTA DE HISTORIA
        gbc.gridy = 4; gbc.gridx = 0; gbc.gridwidth = 1;//Fila 4, Columna 0
        panelPrincipal.add(new JLabel("Nota de Historia:"), gbc);// Etiqueta para la nota de historia
        gbc.gridx = 1; gbc.gridwidth = 2;// El campo de texto ocupará 2 columnas
        JTextField txtHistoria = new JTextField(5);// Campo de texto para la nota de historia
        panelPrincipal.add(txtHistoria, gbc);

        //NOTA DE GEOGRAFIA
        gbc.gridy = 5; gbc.gridx = 0; gbc.gridwidth = 1;//Fila 5, Columna 0
        panelPrincipal.add(new JLabel("Nota de Geografía:"), gbc);// Etiqueta para la nota de geografía
        gbc.gridx = 1; gbc.gridwidth = 2;// El campo de texto ocupará 2 columnas
        JTextField txtGeografia = new JTextField(5);// Campo de texto para la nota de geografía
        panelPrincipal.add(txtGeografia, gbc);

        //NOTA DE TECNOLOGIA
        gbc.gridy = 6; gbc.gridx = 0; gbc.gridwidth = 1;//Fila 6, Columna 0
        panelPrincipal.add(new JLabel("Nota de Tecnología:"), gbc);// Etiqueta para la nota de tecnología
        gbc.gridx = 1; gbc.gridwidth = 2;// El campo de texto ocupará 2 columnas
        JTextField txtTecnologia = new JTextField(5);// Campo de texto para la nota de tecnología
        panelPrincipal.add(txtTecnologia, gbc);

        //NOTA MEDIA DEL ALUMNO(usa el metodo calcular_nota_media para calcular la nota media del alumno y la guarda en la variable notaMedia del objeto alumno)
        gbc.gridy = 7; gbc.gridx = 0; gbc.gridwidth = 1;//Fila 7, Columna 0
        

        //APROBADO/SUSPENSO DEL ALUMNO(usa el metodo mostrar_resultat para mostrar si el alumno ha aprobado o suspendido en base a su nota media)
        //BOTON GUARDAR ALUMNO(guarda el alumno en un array de alumnos para poder mostrarlo posteriormente en la tabla de alumnos guardados)
        
        //BOTON GUARDAR CLASE (guarda la clase en un array de clases para poder mostrarlo posteriormente en la tabla de clases guardadas)

        //MOSTRAR LA VENTANA
        f.pack();// Ajusta el tamaño de la ventana al contenido
        f.setLocationRelativeTo(null);// Centra la ventana en la pantalla
        f.setVisible(true);// Hace visible la ventana
    }
    }



