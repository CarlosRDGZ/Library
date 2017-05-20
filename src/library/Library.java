package library;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Library extends javax.swing.JFrame
{
    private DefaultListModel books;

    public Library()
    {
        initComponents();
        books = new DefaultListModel();
        lstLibros.setModel(books);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frmSetCopias = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstLibros = new javax.swing.JList<>();
        lblHeader = new javax.swing.JLabel();
        lblCantCopies = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblAuthor = new javax.swing.JLabel();
        lblYearPrint = new javax.swing.JLabel();
        lblEditorial = new javax.swing.JLabel();
        txtCantCopies = new javax.swing.JTextField();
        txtTitle = new javax.swing.JTextField();
        txtAuthor = new javax.swing.JTextField();
        txtYearPrint = new javax.swing.JTextField();
        txtEditorial = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnActualizarCopias = new javax.swing.JButton();

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

        lstLibros.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstLibros);

        lblHeader.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblHeader.setText("BIBLIOTECA");

        lblCantCopies.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCantCopies.setText("Cantidad de copias");

        lblTitle.setText("Título:");

        lblAuthor.setText("Autor:");

        lblYearPrint.setText("Año Impresion:");

        lblEditorial.setText("Editorial:");

        txtCantCopies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantCopiesActionPerformed(evt);
            }
        });

        btnSave.setText("Guardar");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnActualizarCopias.setText("Actualizar Copias");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
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
                            .addComponent(txtEditorial, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(txtCantCopies, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTitle)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSave, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnActualizarCopias, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblHeader)
                .addGap(210, 210, 210))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
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
                            .addComponent(txtCantCopies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCantCopies))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnActualizarCopias)
                        .addGap(0, 25, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCantCopiesActionPerformed(java.awt.event.ActionEvent evt)
    {}

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt)
    {
        if(camposLlenos() && datosValidos() && copiasValidas())
        {

            Book book = BookControler.createBook(txtTitle.getText(), txtAuthor.getText(),
                    Integer.valueOf(txtYearPrint.getText()), txtEditorial.getText());
            
            books.addElement(book);
        }
    }

    public boolean copiasValidas()
    {
        if(txtCantCopies != null)
        {
            try
            {
                int copias = Integer.valueOf(txtCantCopies.getText());
                if(copias < 0)
                {
                    txtCantCopies.setText("");
                    JOptionPane.showMessageDialog(this, "Copias debe ser un valor entero", "ERROR", JOptionPane.ERROR_MESSAGE);
                    return false;
                }
            }
            catch ( NumberFormatException e )
            {
                txtCantCopies.setText("");
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
        if(txtYearPrint.getText().isEmpty() ||
                txtAuthor.getText().isEmpty() ||
                txtEditorial.getText().isEmpty() ||
                txtTitle.getText().isEmpty())
        {

            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos");
            return false;
        }
        else
            return true;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAuthor;
    private javax.swing.JLabel lblCantCopies;
    private javax.swing.JLabel lblEditorial;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblYearPrint;
    private javax.swing.JList<String> lstLibros;
    private javax.swing.JTextField txtAuthor;
    private javax.swing.JTextField txtCantCopies;
    private javax.swing.JTextField txtEditorial;
    private javax.swing.JTextField txtTitle;
    private javax.swing.JTextField txtYearPrint;
    // End of variables declaration//GEN-END:variables
}
