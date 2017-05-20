package library;

import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Library extends javax.swing.JFrame
{
    private DefaultTableModel books;
    private LibraryFile file;

    public Library()
    {
        initComponents();
        books = (DefaultTableModel) tblListBooks.getModel();
        tblListBooks.setModel(books);
        file = new LibraryFile("Public_Library");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frmSetCopias = new javax.swing.JFrame();
        lblHeader = new javax.swing.JLabel();
        lblCantCopies = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblAuthor = new javax.swing.JLabel();
        lblYearPrint = new javax.swing.JLabel();
        lblEditorial = new javax.swing.JLabel();
        txtCopies = new javax.swing.JTextField();
        txtTitle = new javax.swing.JTextField();
        txtAuthor = new javax.swing.JTextField();
        txtYearPrint = new javax.swing.JTextField();
        txtEditorial = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnActualizarCopias = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblListBooks = new javax.swing.JTable();

        javax.swing.GroupLayout frmSetCopiasLayout = new javax.swing.GroupLayout(frmSetCopias.getContentPane());
        frmSetCopias.getContentPane().setLayout(frmSetCopiasLayout);
        frmSetCopiasLayout.setHorizontalGroup(
            frmSetCopiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
        );
        frmSetCopiasLayout.setVerticalGroup(
            frmSetCopiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblHeader.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblHeader.setText("BIBLIOTECA");

        lblCantCopies.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCantCopies.setText("Cantidad de copias");

        lblTitle.setText("Título:");

        lblAuthor.setText("Autor:");

        lblYearPrint.setText("Año Impresion:");

        lblEditorial.setText("Editorial:");

        txtCopies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCopiesActionPerformed(evt);
            }
        });

        btnSave.setText("Guardar");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnActualizarCopias.setText("Actualizar Copias");

        tblListBooks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Título", "Autor", "Editorial", "Copias"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblListBooks);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTitle)
                            .addComponent(lblAuthor)
                            .addComponent(lblYearPrint)
                            .addComponent(lblEditorial)
                            .addComponent(lblCantCopies))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtYearPrint)
                            .addComponent(txtAuthor)
                            .addComponent(txtEditorial, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCopies, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTitle)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 17, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSave, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnActualizarCopias, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(136, 136, 136)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(layout.createSequentialGroup()
                .addGap(317, 317, 317)
                .addComponent(lblHeader)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTitle)
                            .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAuthor)
                            .addComponent(txtAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblYearPrint)
                            .addComponent(txtYearPrint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEditorial)
                            .addComponent(txtEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCopies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCantCopies))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnActualizarCopias))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCopiesActionPerformed(java.awt.event.ActionEvent evt)
    {}

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt)
    {
        if(camposLlenos() && datosValidos() && copiasValidas())
        {

            Book book = BookControler.createBook(txtTitle.getText(), txtAuthor.getText(),
                    Integer.valueOf(txtYearPrint.getText()), txtEditorial.getText(), Integer.valueOf(txtCopies.getText()));

            addToTable(book);
        }
    }

    public boolean copiasValidas()
    {
        if(txtCopies != null)
        {
            try
            {
                int copias = Integer.valueOf(txtCopies.getText());
                if(copias < 0)
                {
                    txtCopies.setText("");
                    JOptionPane.showMessageDialog(this, "Copias debe ser un valor entero", "ERROR", JOptionPane.ERROR_MESSAGE);
                    return false;
                }
            }
            catch ( NumberFormatException e )
            {
                txtCopies.setText("");
                JOptionPane.showMessageDialog(this, "Copias debe ser un valor entero", "ERROR", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        return true;
    }

    public boolean datosValidos() {
        try
        {
            int anioImpr = Integer.valueOf(txtYearPrint.getText());
            if(anioImpr <  0)
            {
                txtYearPrint.setText("");
                JOptionPane.showMessageDialog(this, "Año debe ser un valor entero" , "ERROR", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        catch ( NumberFormatException e )
        {
            txtYearPrint.setText("");
            JOptionPane.showMessageDialog(this, "Año debe ser un valor entero" , "ERROR", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    public boolean camposLlenos(){
        if(txtYearPrint.getText().isEmpty() || txtAuthor.getText().isEmpty() ||
            txtEditorial.getText().isEmpty() || txtTitle.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos");
            return false;
        }
        else
            return true;
    }

    private void addToTable(Book book)
    {
        String[] newBook = {book.getCode(), book.getTitle(), book.getAuthor(),
            book.getEditorial(), Integer.toString(book.getCopies())};
        books.addRow(newBook);
    }

    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {new Library().setVisible(true);}
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarCopias;
    private javax.swing.JButton btnSave;
    private javax.swing.JFrame frmSetCopias;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAuthor;
    private javax.swing.JLabel lblCantCopies;
    private javax.swing.JLabel lblEditorial;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblYearPrint;
    private javax.swing.JTable tblListBooks;
    private javax.swing.JTextField txtAuthor;
    private javax.swing.JTextField txtCopies;
    private javax.swing.JTextField txtEditorial;
    private javax.swing.JTextField txtTitle;
    private javax.swing.JTextField txtYearPrint;
    // End of variables declaration//GEN-END:variables
}
