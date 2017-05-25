package library;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Library extends javax.swing.JFrame
{
    private DefaultTableModel books;
    private ArrayList<Book> books_array;
    private LibraryFile file;

    public Library()
    {
        initComponents();
        
        btnRefresh.setVisible(false);

        /*Crea el modelo para la tabla, books*/
        books = (DefaultTableModel) tblListBooks.getModel();
        /*Le asigna el modelo a la tabla tblListBooks*/
        tblListBooks.setModel(books);

        /*Crea o abre el archivo el binario*/
        file = new LibraryFile("Public_Library");
        /*Lee todos los registos del libro y los asigna al ArrayList fileBooks*/
        books_array = file.readAll();
        for(Book book:books_array)
        {
            addToTable(book);
        }

        /*Estable las dimenciones del frame frmNewBook
        Evita que se pueda redimencionar*/
        frmNewBook.setSize(355, 300);
        frmNewBook.setResizable(false);

        /*Estable las dimenciones del frame frmEditRegistry
        Evita que se pueda redimencionar*/
        frmEditRegistry.setSize(355, 300);
        frmEditRegistry.setResizable(false);
        
        frmSearch.setSize(410, 330);
        frmSearch.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frmNewBook = new javax.swing.JFrame();
        lblCantCopies = new javax.swing.JLabel();
        txtEditorial = new javax.swing.JTextField();
        txtYearPrint = new javax.swing.JTextField();
        txtAuthor = new javax.swing.JTextField();
        txtCopies = new javax.swing.JTextField();
        txtTitle = new javax.swing.JTextField();
        lblEditorial = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        lblYearPrint = new javax.swing.JLabel();
        lblAuthor = new javax.swing.JLabel();
        btnCancelNew = new javax.swing.JButton();
        frmEditRegistry = new javax.swing.JFrame();
        txtAuthorE = new javax.swing.JTextField();
        txtTitleE = new javax.swing.JTextField();
        lblEditorialE = new javax.swing.JLabel();
        lblTitleE = new javax.swing.JLabel();
        lblYearPrintE = new javax.swing.JLabel();
        lblAuthorE = new javax.swing.JLabel();
        txtEditorialE = new javax.swing.JTextField();
        txtYearPrintE = new javax.swing.JTextField();
        btnCancelChanges = new javax.swing.JButton();
        btnSaveChanges = new javax.swing.JButton();
        frmSearch = new javax.swing.JFrame();
        txtAuthorS = new javax.swing.JTextField();
        txtTitleS = new javax.swing.JTextField();
        txtEditorialS = new javax.swing.JTextField();
        txtYearPrintS = new javax.swing.JTextField();
        lblInstSearch = new javax.swing.JLabel();
        btnRdTitle = new javax.swing.JRadioButton();
        btnRdCode = new javax.swing.JRadioButton();
        txtCodeS = new javax.swing.JTextField();
        btnRdAuthor = new javax.swing.JRadioButton();
        btnRdYear = new javax.swing.JRadioButton();
        btnRdEditorial = new javax.swing.JRadioButton();
        lblCodeS = new javax.swing.JLabel();
        lblTitleS = new javax.swing.JLabel();
        lblAuthorS = new javax.swing.JLabel();
        lblYearS = new javax.swing.JLabel();
        lblEditorialS = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        btnCancelSearch = new javax.swing.JButton();
        lblHeader = new javax.swing.JLabel();
        btnNewBook = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblListBooks = new javax.swing.JTable();
        btnEditRegistry = new javax.swing.JButton();
        btnNewSearch = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();

        frmNewBook.setTitle("Nuevo");
        frmNewBook.setResizable(false);
        frmNewBook.setType(java.awt.Window.Type.UTILITY);

        lblCantCopies.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCantCopies.setText("Cantidad de copias:");

        txtCopies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCopiesActionPerformed(evt);
            }
        });

        lblEditorial.setText("Editorial:");

        lblTitle.setText("Título:");

        btnSave.setText("Guardar");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblYearPrint.setText("Año Impresion:");

        lblAuthor.setText("Autor:");

        btnCancelNew.setText("Cancelar");
        btnCancelNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelNewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout frmNewBookLayout = new javax.swing.GroupLayout(frmNewBook.getContentPane());
        frmNewBook.getContentPane().setLayout(frmNewBookLayout);
        frmNewBookLayout.setHorizontalGroup(
            frmNewBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmNewBookLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(frmNewBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTitle)
                    .addComponent(lblAuthor)
                    .addComponent(lblYearPrint)
                    .addComponent(lblEditorial))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(frmNewBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtYearPrint, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(txtAuthor, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTitle, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEditorial))
                .addGap(18, 18, 18))
            .addGroup(frmNewBookLayout.createSequentialGroup()
                .addGroup(frmNewBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frmNewBookLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(lblCantCopies))
                    .addGroup(frmNewBookLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(btnCancelNew)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(frmNewBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frmNewBookLayout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(btnSave)
                        .addGap(38, 38, 38))
                    .addGroup(frmNewBookLayout.createSequentialGroup()
                        .addComponent(txtCopies)
                        .addGap(122, 122, 122))))
        );
        frmNewBookLayout.setVerticalGroup(
            frmNewBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmNewBookLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(frmNewBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle)
                    .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(frmNewBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAuthor)
                    .addComponent(txtAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(frmNewBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblYearPrint)
                    .addComponent(txtYearPrint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(frmNewBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEditorial)
                    .addComponent(txtEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(frmNewBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCopies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCantCopies))
                .addGap(14, 14, 14)
                .addGroup(frmNewBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelNew)
                    .addComponent(btnSave))
                .addContainerGap())
        );

        frmEditRegistry.setTitle("Editar");
        frmEditRegistry.setResizable(false);
        frmEditRegistry.setType(java.awt.Window.Type.UTILITY);

        lblEditorialE.setText("Editorial:");

        lblTitleE.setText("Título:");

        lblYearPrintE.setText("Año Impresion:");

        lblAuthorE.setText("Autor:");

        btnCancelChanges.setText("Cancel");
        btnCancelChanges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelChangesActionPerformed(evt);
            }
        });

        btnSaveChanges.setText("Guardar");
        btnSaveChanges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveChangesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout frmEditRegistryLayout = new javax.swing.GroupLayout(frmEditRegistry.getContentPane());
        frmEditRegistry.getContentPane().setLayout(frmEditRegistryLayout);
        frmEditRegistryLayout.setHorizontalGroup(
            frmEditRegistryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmEditRegistryLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(frmEditRegistryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCancelChanges)
                    .addComponent(lblTitleE)
                    .addComponent(lblAuthorE)
                    .addComponent(lblYearPrintE)
                    .addComponent(lblEditorialE))
                .addGroup(frmEditRegistryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frmEditRegistryLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(frmEditRegistryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtYearPrintE, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAuthorE, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTitleE, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEditorialE, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmEditRegistryLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSaveChanges)
                        .addGap(49, 49, 49))))
        );
        frmEditRegistryLayout.setVerticalGroup(
            frmEditRegistryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmEditRegistryLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(frmEditRegistryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitleE)
                    .addComponent(txtTitleE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(frmEditRegistryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAuthorE)
                    .addComponent(txtAuthorE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(frmEditRegistryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblYearPrintE)
                    .addComponent(txtYearPrintE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(frmEditRegistryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEditorialE)
                    .addComponent(txtEditorialE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(frmEditRegistryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelChanges)
                    .addComponent(btnSaveChanges))
                .addGap(24, 24, 24))
        );

        txtEditorialS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEditorialSActionPerformed(evt);
            }
        });

        lblInstSearch.setText("Selecciona los filtros de busqueda");

        lblCodeS.setText("Codigo");

        lblTitleS.setText("Título");

        lblAuthorS.setText("Autor");

        lblYearS.setText("Año Impresión");

        lblEditorialS.setText("Editorial");

        btnSearch.setText("Buscar");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnCancelSearch.setText("Cancelar");
        btnCancelSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout frmSearchLayout = new javax.swing.GroupLayout(frmSearch.getContentPane());
        frmSearch.getContentPane().setLayout(frmSearchLayout);
        frmSearchLayout.setHorizontalGroup(
            frmSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmSearchLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(frmSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frmSearchLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(frmSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblAuthorS)
                            .addComponent(lblTitleS)
                            .addComponent(lblCodeS))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(frmSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCodeS, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                            .addComponent(txtAuthorS)
                            .addComponent(txtTitleS))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(frmSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRdTitle)
                            .addComponent(btnRdCode)
                            .addComponent(btnRdAuthor)))
                    .addComponent(lblInstSearch)
                    .addGroup(frmSearchLayout.createSequentialGroup()
                        .addGroup(frmSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(frmSearchLayout.createSequentialGroup()
                                .addGroup(frmSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblYearS)
                                    .addComponent(lblEditorialS))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(frmSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtEditorialS, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                                    .addComponent(txtYearPrintS)))
                            .addGroup(frmSearchLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btnCancelSearch)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                                .addComponent(btnSearch)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(frmSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRdEditorial)
                            .addComponent(btnRdYear))))
                .addGap(0, 23, Short.MAX_VALUE))
        );
        frmSearchLayout.setVerticalGroup(
            frmSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmSearchLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblInstSearch)
                .addGap(18, 18, 18)
                .addGroup(frmSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRdCode)
                    .addComponent(txtCodeS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodeS))
                .addGap(18, 18, 18)
                .addGroup(frmSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRdTitle)
                    .addGroup(frmSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTitleS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTitleS)))
                .addGap(18, 18, 18)
                .addGroup(frmSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAuthorS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAuthorS)
                    .addComponent(btnRdAuthor))
                .addGap(18, 18, 18)
                .addGroup(frmSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtYearPrintS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblYearS)
                    .addComponent(btnRdYear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(frmSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtEditorialS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblEditorialS))
                    .addComponent(btnRdEditorial))
                .addGap(18, 18, 18)
                .addGroup(frmSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(btnCancelSearch))
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblHeader.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblHeader.setText("BIBLIOTECA");

        btnNewBook.setText("Nuevo");
        btnNewBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewBookActionPerformed(evt);
            }
        });

        tblListBooks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Título", "Autor", "Editorial", "Año Impresión", "Copias", "Disponibles"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblListBooks);
        if (tblListBooks.getColumnModel().getColumnCount() > 0) {
            tblListBooks.getColumnModel().getColumn(0).setResizable(false);
            tblListBooks.getColumnModel().getColumn(0).setPreferredWidth(60);
            tblListBooks.getColumnModel().getColumn(1).setResizable(false);
            tblListBooks.getColumnModel().getColumn(2).setResizable(false);
            tblListBooks.getColumnModel().getColumn(3).setResizable(false);
            tblListBooks.getColumnModel().getColumn(4).setResizable(false);
            tblListBooks.getColumnModel().getColumn(4).setPreferredWidth(60);
            tblListBooks.getColumnModel().getColumn(5).setResizable(false);
            tblListBooks.getColumnModel().getColumn(5).setPreferredWidth(35);
            tblListBooks.getColumnModel().getColumn(6).setResizable(false);
            tblListBooks.getColumnModel().getColumn(6).setPreferredWidth(40);
        }

        btnEditRegistry.setText("Editar");
        btnEditRegistry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditRegistryActionPerformed(evt);
            }
        });

        btnNewSearch.setText("Buscar");
        btnNewSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewSearchActionPerformed(evt);
            }
        });

        btnRefresh.setText("Recargar");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(279, 279, 279)
                .addComponent(lblHeader)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRefresh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNewSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEditRegistry)
                .addGap(18, 18, 18)
                .addComponent(btnNewBook)
                .addGap(62, 62, 62))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditRegistry)
                    .addComponent(btnNewBook)
                    .addComponent(btnNewSearch)
                    .addComponent(btnRefresh))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelChangesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelChangesActionPerformed
        frmEditRegistry.setVisible(false);
    }//GEN-LAST:event_btnCancelChangesActionPerformed

    private void btnSaveChangesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveChangesActionPerformed
        if(isDataValid() && areFieldsFull())
        {
            int row = tblListBooks.getSelectedRow();
            Book book = books_array.get(row);

            book = BookControler.editBook(txtTitleE.getText(),
                    txtAuthorE.getText(),
                    Integer.valueOf(txtYearPrintE.getText()),
                    txtEditorialE.getText(), book);

            books.setValueAt(book.getCode(), row, 0);
            books.setValueAt(book.getTitle(), row, 1);
            books.setValueAt(book.getAuthor(), row, 2);
            books.setValueAt(book.getEditorial(), row, 3);
            books.setValueAt(Integer.toString(book.getYearPrint()), row, 4);
            
            books_array.add(row, book);
            file.addRecord(book, book.getRegistryNumber());
            
            frmEditRegistry.setVisible(false);
        }
    }//GEN-LAST:event_btnSaveChangesActionPerformed

    private void txtEditorialSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditorialSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEditorialSActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        ArrayList<Book> searchResult = new ArrayList();
        DefaultTableModel modelSearchResult = (DefaultTableModel) tblListBooks.getModel();
        
        if(btnRdCode.isSelected())
        {
            String searchedCode = txtCodeS.getText();
            for(Book book:books_array)
            {
                if(book.getCode().contains(searchedCode))
                {
                    searchResult.add(book);
                    String[] newBook = {book.getCode(), book.getTitle(), book.getAuthor(),
                        book.getEditorial(), Integer.toString(book.getYearPrint()),
                        Integer.toString(book.getCopies()), Integer.toString(book.getAvailable())};
                    modelSearchResult.addRow(newBook);
                }
            }
            tblListBooks = new javax.swing.JTable();
            tblListBooks.setModel(modelSearchResult);
            btnRefresh.setVisible(true);
            frmSearch.setVisible(false);
        }
        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnNewSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewSearchActionPerformed
        frmSearch.setVisible(true);
    }//GEN-LAST:event_btnNewSearchActionPerformed

    private void btnCancelSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelSearchActionPerformed
        txtAuthorS.setText("");
        txtCodeS.setText("");
        txtEditorialS.setText("");
        txtTitleS.setText("");
        txtYearPrintS.setText("");
        frmSearch.setVisible(false);
    }//GEN-LAST:event_btnCancelSearchActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        tblListBooks.setModel(books);
        btnRefresh.setVisible(false);
        btnSearch.setVisible(true);
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnEditRegistryActionPerformed(java.awt.event.ActionEvent evt)
    {
        int row = tblListBooks.getSelectedRow();
        if(row > -1)
        {
            txtAuthorE.setText((String)books.getValueAt(row, 2));
            txtEditorialE.setText((String)books.getValueAt(row, 3));
            txtTitleE.setText((String)books.getValueAt(row, 1));
            txtYearPrintE.setText((String)books.getValueAt(row, 4));
            frmEditRegistry.setVisible(true);
        }
        else
        {
           JOptionPane.showMessageDialog(this, "Seleccione un registro",
                "Editar", JOptionPane.INFORMATION_MESSAGE);

        }
    }

    private void btnCancelNewActionPerformed(java.awt.event.ActionEvent evt)
    {
        frmNewBook.setVisible(false);
    }

    private void btnNewBookActionPerformed(java.awt.event.ActionEvent evt)
    {
        txtAuthor.setText("");
        txtCopies.setText("");
        txtEditorial.setText("");
        txtTitle.setText("");
        txtYearPrint.setText("");
        frmNewBook.setVisible(true);
    }

    private void txtCopiesActionPerformed(java.awt.event.ActionEvent evt)
    {}

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt)
    {
        if(areFieldsFull() && isDataValid())
        {

            Book book = BookControler.createBook(txtTitle.getText(), txtAuthor.getText(),
                    Integer.valueOf(txtYearPrint.getText()), txtEditorial.getText(),
                    Integer.valueOf(txtCopies.getText()), file.numberOfRecords());

            addToTable(book);
            books_array.add(book);
            file.addRecord(book, file.numberOfRecords());
            frmNewBook.setVisible(false);
        }
    }

    public boolean isDataValid()
    {
        if(frmNewBook.isVisible())
        {
            try
            {
                int year = Integer.valueOf(txtYearPrint.getText());
                if(year <  0)
                {
                    txtYearPrint.setText("");
                    JOptionPane.showMessageDialog(frmNewBook, "Años entre 0 y el actual" , "ERROR", JOptionPane.ERROR_MESSAGE);
                    return false;
                }
            } catch ( NumberFormatException e )
            {
                txtYearPrint.setText("");
                JOptionPane.showMessageDialog(frmNewBook, "Año debe ser un valor entero" , "ERROR", JOptionPane.ERROR_MESSAGE);
                return false;
            }

            try
            {
                int copias = Integer.valueOf(txtCopies.getText());
                if(copias < 0)
                {
                    txtCopies.setText("");
                    JOptionPane.showMessageDialog(frmNewBook, "Copias debe ser positivo", "ERROR", JOptionPane.ERROR_MESSAGE);
                    return false;
                }
            } catch ( NumberFormatException e )
            {
                txtCopies.setText("");
                JOptionPane.showMessageDialog(frmNewBook, "Copias debe ser un valor entero", "ERROR", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        else if(frmEditRegistry.isVisible())
        {
            try
            {
                int year = Integer.valueOf(txtYearPrintE.getText());
                if(year <  0)
                {
                    txtYearPrintE.setText("");
                    JOptionPane.showMessageDialog(frmEditRegistry, "Años entre 0 y el actual" , "ERROR", JOptionPane.ERROR_MESSAGE);
                    return false;
                }
            } catch ( NumberFormatException e )
            {
                txtYearPrintE.setText("");
                JOptionPane.showMessageDialog(frmEditRegistry, "Año debe ser un valor entero" , "ERROR", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }

        return true;
    }

    public boolean areFieldsFull()
    {
        if(frmNewBook.isVisible())
        {
            if(txtYearPrint.getText().isEmpty() || txtAuthor.getText().isEmpty() ||
                txtEditorial.getText().isEmpty() || txtTitle.getText().isEmpty() ||
                txtCopies.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(frmNewBook, "Debe llenar todos los campos");
                return false;
            }
        }

        else if(frmEditRegistry.isVisible())
        {
            if(txtYearPrintE.getText().isEmpty() || txtAuthorE.getText().isEmpty() ||
                txtEditorialE.getText().isEmpty() || txtTitleE.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(frmEditRegistry, "Debe llenar todos los campos");
                return false;
            }
        }

        return true;
    }

    private void addToTable(Book book)
    {
        String[] newBook = {book.getCode(), book.getTitle(), book.getAuthor(),
            book.getEditorial(), Integer.toString(book.getYearPrint()),
            Integer.toString(book.getCopies()), Integer.toString(book.getAvailable())};
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
    private javax.swing.JButton btnCancelChanges;
    private javax.swing.JButton btnCancelNew;
    private javax.swing.JButton btnCancelSearch;
    private javax.swing.JButton btnEditRegistry;
    private javax.swing.JButton btnNewBook;
    private javax.swing.JButton btnNewSearch;
    private javax.swing.JRadioButton btnRdAuthor;
    private javax.swing.JRadioButton btnRdCode;
    private javax.swing.JRadioButton btnRdEditorial;
    private javax.swing.JRadioButton btnRdTitle;
    private javax.swing.JRadioButton btnRdYear;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSaveChanges;
    private javax.swing.JButton btnSearch;
    private javax.swing.JFrame frmEditRegistry;
    private javax.swing.JFrame frmNewBook;
    private javax.swing.JFrame frmSearch;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAuthor;
    private javax.swing.JLabel lblAuthorE;
    private javax.swing.JLabel lblAuthorS;
    private javax.swing.JLabel lblCantCopies;
    private javax.swing.JLabel lblCodeS;
    private javax.swing.JLabel lblEditorial;
    private javax.swing.JLabel lblEditorialE;
    private javax.swing.JLabel lblEditorialS;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblInstSearch;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTitleE;
    private javax.swing.JLabel lblTitleS;
    private javax.swing.JLabel lblYearPrint;
    private javax.swing.JLabel lblYearPrintE;
    private javax.swing.JLabel lblYearS;
    private javax.swing.JTable tblListBooks;
    private javax.swing.JTextField txtAuthor;
    private javax.swing.JTextField txtAuthorE;
    private javax.swing.JTextField txtAuthorS;
    private javax.swing.JTextField txtCodeS;
    private javax.swing.JTextField txtCopies;
    private javax.swing.JTextField txtEditorial;
    private javax.swing.JTextField txtEditorialE;
    private javax.swing.JTextField txtEditorialS;
    private javax.swing.JTextField txtTitle;
    private javax.swing.JTextField txtTitleE;
    private javax.swing.JTextField txtTitleS;
    private javax.swing.JTextField txtYearPrint;
    private javax.swing.JTextField txtYearPrintE;
    private javax.swing.JTextField txtYearPrintS;
    // End of variables declaration//GEN-END:variables
}
