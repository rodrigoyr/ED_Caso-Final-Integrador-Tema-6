import Indexacion_y_Visualizacion_de_Archivos.IndexacionRecursiva;
import Indexacion_y_Visualizacion_de_Archivos.OrdenacionListado;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        // Crear una nueva instancia de la interfaz de usuario
        SwingUtilities.invokeLater(() -> new UserInterface().setVisible(true));
    }
}

class UserInterface extends JFrame {
    private JTextField directoryField;
    private JButton indexButton;
    private JRadioButton sortByNameButton;
    private JRadioButton sortBySizeButton;
    private JTextArea outputArea;

    public UserInterface() {
        // Configurar la ventana
        setTitle("Indexador de Archivos");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Crear los componentes de la interfaz de usuario
        directoryField = new JTextField(50);
        indexButton = new JButton("Indexar");
        sortByNameButton = new JRadioButton("Ordenar por nombre", true);
        sortBySizeButton = new JRadioButton("Ordenar por tamaño");
        outputArea = new JTextArea();
        outputArea.setEditable(false);

        // Agrupar los botones de radio
        ButtonGroup sortOptions = new ButtonGroup();
        sortOptions.add(sortByNameButton);
        sortOptions.add(sortBySizeButton);

        // Añadir un oyente de acción al botón de indexación
        indexButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indexAndSortFiles();
            }
        });

        // Añadir los componentes a la ventana
        setLayout(new FlowLayout());
        add(new JLabel("Directorio:"));
        add(directoryField);
        add(indexButton);
        add(sortByNameButton);
        add(sortBySizeButton);
        add(new JScrollPane(outputArea));
    }

    private void indexAndSortFiles() {
        // Crear una instancia de IndexacionRecursiva
        IndexacionRecursiva indexacionRecursiva = new IndexacionRecursiva();

        // Indexar los archivos en el directorio proporcionado por el usuario
        indexacionRecursiva.indexarArchivos(new File(directoryField.getText()));

        // Crear una instancia de OrdenacionListado con los archivos indexados
        OrdenacionListado ordenacionListado = new OrdenacionListado(indexacionRecursiva.obtenerArchivosIndexados());

        // Ordenar los archivos según la opción seleccionada por el usuario
        if (sortByNameButton.isSelected()) {
            ordenacionListado.ordenarPorNombre();
        } else {
            ordenacionListado.ordenarPorTamano();
        }

        // Imprimir los archivos ordenados en el área de texto
        outputArea.setText("");
        for (File archivo : ordenacionListado.obtenerArchivosIndexados()) {
            outputArea.append(archivo.getName() + "\n");
        }
    }
}