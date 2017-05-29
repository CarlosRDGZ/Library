package library;

import java.awt.print.PrinterException;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Library extends javax.swing.JFrame
{
    private ArrayList<Book> books_array;
    private LibraryFile file;
    private ArrayList<Book> searchResult = new ArrayList();
    private boolean showingSearch;
    private LibraryUserFile usersFile;
    private ArrayList<LibraryUser> users_array;
    private ArrayList<LibraryUser> searchUsers;
    private boolean showingUserSearch;
    private CountersFile counters;
    private long usersIDCount;

    public Library()
    {
        initComponents();
        
        setLocationRelativeTo(null);
        
        /*Crea el modelo para la tabla, books*/
        DefaultTableModel books = (DefaultTableModel) tblListBooks.getModel();
        /*Le asigna el modelo a la tabla tblListBooks*/
        tblListBooks.setModel(books);

        /*Crea o abre el archivo el binario*/
        file = new LibraryFile("Public_Library");
        /*Lee todos los registos del libro y los asigna al ArrayList fileBooks*/
        books_array = file.readAll();
        for(Book book:books_array)
        {
            addToTable(book, books);
        }
        showingSearch = false;
        
        usersFile = new LibraryUserFile("Users");
        users_array = usersFile.readAll();
     /*   
        DefaultListModel users = new DefaultListModel();
        for(LibraryUser user:users_array)
            users.addElement(user);
        lstUsers.setModel(users);
        */
        showingUserSearch = false;
        
        counters = new CountersFile();
        if(counters.readUsers() == -1)
            usersIDCount = 0;
        else
            usersIDCount = counters.readUsers();

        /*Estable las dimenciones del frame frmNewBook
        Evita que se pueda redimencionar*/
        frmNewBook.setSize(frmNewBook.getPreferredSize());
        frmNewBook.setLocationRelativeTo(this);
        frmNewBook.setResizable(false);

        /*Estable las dimenciones del frame frmEditRegistry
        Evita que se pueda redimencionar*/
        frmEditRegistry.setSize(frmEditRegistry.getPreferredSize());
        frmEditRegistry.setLocationRelativeTo(this);
        frmEditRegistry.setResizable(false);
        
        frmSearch.setSize(frmSearch.getPreferredSize());
        frmSearch.setLocationRelativeTo(this);
        frmSearch.setResizable(false);
        
        dlgDelete.setResizable(false);
        dlgDelete.setLocationRelativeTo(this);
        dlgDelete.setSize(dlgDelete.getPreferredSize());
                
        frmSeeDetails.setResizable(false);
        frmSeeDetails.setLocation(getX()/2,getY()/2);
        frmSeeDetails.setSize(frmSeeDetails.getPreferredSize());
        
        frmUsers.setResizable(false);
        frmUsers.setLocationRelativeTo(null);
        frmUsers.setSize(frmUsers.getPreferredSize());
        
        frmNewUser.setResizable(false);
        frmNewUser.setLocationRelativeTo(frmUsers);
        frmNewUser.setSize(frmNewUser.getPreferredSize());
        
        frmUserDetails.setResizable(false);
        frmUserDetails.setLocationRelativeTo(frmUsers);
        frmUserDetails.setSize(frmUserDetails.getPreferredSize());
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
        btnShowAll = new javax.swing.JButton();
        dlgDelete = new javax.swing.JDialog();
        lblMnsg1D = new javax.swing.JLabel();
        lblMnsg2D = new javax.swing.JLabel();
        btnConfirmDelete = new javax.swing.JButton();
        btnCancelDelete = new javax.swing.JButton();
        lblTitleD = new javax.swing.JLabel();
        frmSeeDetails = new javax.swing.JFrame();
        txtAuthorSD = new javax.swing.JTextField();
        txtTitleSD = new javax.swing.JTextField();
        lblEditorialSD = new javax.swing.JLabel();
        lblTitleSD = new javax.swing.JLabel();
        lblYearPrintSD = new javax.swing.JLabel();
        lblAuthorSD = new javax.swing.JLabel();
        txtEditorialSD = new javax.swing.JTextField();
        txtYearPrintSD = new javax.swing.JTextField();
        lblCodeSD = new javax.swing.JLabel();
        txtCodeSD = new javax.swing.JTextField();
        lblCopiesSD = new javax.swing.JLabel();
        lblAvailableSD = new javax.swing.JLabel();
        txtAvailableSD = new javax.swing.JTextField();
        txtCopiesSD = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        btnEditRegistry = new javax.swing.JButton();
        frmUsers = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstUsers = new javax.swing.JList<>();
        lblUsersHeader = new javax.swing.JLabel();
        btnNewUser = new javax.swing.JButton();
        btnSearchUser = new javax.swing.JButton();
        btnSeeUserDetails = new javax.swing.JButton();
        frmNewUser = new javax.swing.JFrame();
        txtUserNameN = new javax.swing.JTextField();
        lblAgeN = new javax.swing.JLabel();
        txtAgeN = new javax.swing.JTextField();
        lblSchool = new javax.swing.JLabel();
        txtSchoolN = new javax.swing.JTextField();
        btnSaveNewUser = new javax.swing.JButton();
        btnCancelNewUser = new javax.swing.JButton();
        lblHeaderNewUser = new javax.swing.JLabel();
        lblUserNameN = new javax.swing.JLabel();
        frmUserDetails = new javax.swing.JFrame();
        txtUserNameUD = new javax.swing.JTextField();
        lblAgeUD = new javax.swing.JLabel();
        txtAgeUD = new javax.swing.JTextField();
        lblSchoolUD = new javax.swing.JLabel();
        txtSchoolUD = new javax.swing.JTextField();
        lblUserNameUD = new javax.swing.JLabel();
        lblUserIDUD = new javax.swing.JLabel();
        txtUserIDUD = new javax.swing.JTextField();
        btnDeleteUser = new javax.swing.JButton();
        btnEditUser = new javax.swing.JButton();
        btnCloseUserDetails = new javax.swing.JButton();
        lblHeader = new javax.swing.JLabel();
        btnNewBook = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblListBooks = new javax.swing.JTable();
        btnNewSearch = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        btnSeeDetails = new javax.swing.JButton();
        btnUsers = new javax.swing.JButton();

        frmNewBook.setTitle("Nuevo");
        frmNewBook.setResizable(false);
        frmNewBook.setType(java.awt.Window.Type.UTILITY);

        lblCantCopies.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCantCopies.setText("Cantidad de copias:");

        txtEditorial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEditorialKeyPressed(evt);
            }
        });

        txtYearPrint.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtYearPrintKeyPressed(evt);
            }
        });

        txtAuthor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAuthorKeyPressed(evt);
            }
        });

        txtCopies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCopiesActionPerformed(evt);
            }
        });
        txtCopies.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCopiesKeyPressed(evt);
            }
        });

        txtTitle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTitleKeyPressed(evt);
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
                .addGap(13, 13, 13)
                .addComponent(lblCantCopies)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCopies, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                .addGap(128, 128, 128))
            .addGroup(frmNewBookLayout.createSequentialGroup()
                .addGroup(frmNewBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frmNewBookLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(btnCancelNew)
                        .addGap(109, 109, 109)
                        .addComponent(btnSave))
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
                            .addComponent(txtEditorial))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(56, Short.MAX_VALUE))
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
                .addContainerGap(56, Short.MAX_VALUE))
        );

        frmSearch.setTitle("Buscar");
        frmSearch.setType(java.awt.Window.Type.UTILITY);
        frmSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                frmSearchMouseClicked(evt);
            }
        });

        txtAuthorS.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAuthorSFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAuthorSFocusLost(evt);
            }
        });
        txtAuthorS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAuthorSKeyPressed(evt);
            }
        });

        txtTitleS.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTitleSFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTitleSFocusLost(evt);
            }
        });
        txtTitleS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTitleSKeyPressed(evt);
            }
        });

        txtEditorialS.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEditorialSFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEditorialSFocusLost(evt);
            }
        });
        txtEditorialS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEditorialSActionPerformed(evt);
            }
        });
        txtEditorialS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEditorialSKeyPressed(evt);
            }
        });

        txtYearPrintS.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtYearPrintSFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtYearPrintSFocusLost(evt);
            }
        });
        txtYearPrintS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtYearPrintSActionPerformed(evt);
            }
        });
        txtYearPrintS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtYearPrintSKeyPressed(evt);
            }
        });

        lblInstSearch.setText("Selecciona los filtros de busqueda");

        btnRdTitle.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                btnRdTitleStateChanged(evt);
            }
        });

        btnRdCode.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                btnRdCodeStateChanged(evt);
            }
        });

        txtCodeS.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCodeSFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCodeSFocusLost(evt);
            }
        });
        txtCodeS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodeSKeyPressed(evt);
            }
        });

        btnRdAuthor.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                btnRdAuthorStateChanged(evt);
            }
        });

        btnRdYear.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                btnRdYearStateChanged(evt);
            }
        });

        btnRdEditorial.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                btnRdEditorialStateChanged(evt);
            }
        });

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

        btnShowAll.setText("Mostrar Todos");
        btnShowAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowAllActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout frmSearchLayout = new javax.swing.GroupLayout(frmSearch.getContentPane());
        frmSearch.getContentPane().setLayout(frmSearchLayout);
        frmSearchLayout.setHorizontalGroup(
            frmSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmSearchLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(frmSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblInstSearch)
                    .addGroup(frmSearchLayout.createSequentialGroup()
                        .addGroup(frmSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(frmSearchLayout.createSequentialGroup()
                                .addGroup(frmSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblAuthorS)
                                    .addComponent(lblTitleS)
                                    .addComponent(lblCodeS))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(frmSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtAuthorS, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                                    .addComponent(txtTitleS)
                                    .addComponent(txtCodeS)))
                            .addGroup(frmSearchLayout.createSequentialGroup()
                                .addGroup(frmSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblEditorialS)
                                    .addComponent(lblYearS))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(frmSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtYearPrintS, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEditorialS, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(frmSearchLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(btnShowAll)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancelSearch)
                                .addGap(18, 18, 18)
                                .addComponent(btnSearch)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(frmSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRdTitle)
                            .addComponent(btnRdCode)
                            .addComponent(btnRdAuthor)
                            .addComponent(btnRdEditorial)
                            .addComponent(btnRdYear))))
                .addContainerGap(23, Short.MAX_VALUE))
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
                .addGroup(frmSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRdYear, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(frmSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblYearS)
                        .addComponent(txtYearPrintS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(frmSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRdEditorial)
                    .addGroup(frmSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtEditorialS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblEditorialS)))
                .addGap(18, 18, 18)
                .addGroup(frmSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frmSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSearch)
                        .addComponent(btnCancelSearch))
                    .addComponent(btnShowAll))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        dlgDelete.setTitle("Eliminar");
        dlgDelete.setIconImage(null);
        dlgDelete.setResizable(false);
        dlgDelete.setType(java.awt.Window.Type.UTILITY);

        lblMnsg1D.setText("¿Deseas eliminar este libro?");

        lblMnsg2D.setText("Esta accion no puede deshacerse");

        btnConfirmDelete.setText("Si");
        btnConfirmDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmDeleteActionPerformed(evt);
            }
        });

        btnCancelDelete.setText("No");
        btnCancelDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelDeleteActionPerformed(evt);
            }
        });

        lblTitleD.setText("Titulo Titulo Tituo Titulo Titulo");

        javax.swing.GroupLayout dlgDeleteLayout = new javax.swing.GroupLayout(dlgDelete.getContentPane());
        dlgDelete.getContentPane().setLayout(dlgDeleteLayout);
        dlgDeleteLayout.setHorizontalGroup(
            dlgDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgDeleteLayout.createSequentialGroup()
                .addGroup(dlgDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dlgDeleteLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(dlgDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dlgDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblMnsg2D, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(dlgDeleteLayout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(btnCancelDelete)
                                    .addGap(56, 56, 56)
                                    .addComponent(btnConfirmDelete)))
                            .addComponent(lblTitleD, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(dlgDeleteLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(lblMnsg1D)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        dlgDeleteLayout.setVerticalGroup(
            dlgDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgDeleteLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(lblTitleD)
                .addGap(18, 18, 18)
                .addComponent(lblMnsg1D)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMnsg2D)
                .addGap(18, 18, 18)
                .addGroup(dlgDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirmDelete)
                    .addComponent(btnCancelDelete))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        frmSeeDetails.setResizable(false);
        frmSeeDetails.setType(java.awt.Window.Type.UTILITY);

        txtAuthorSD.setEditable(false);

        txtTitleSD.setEditable(false);

        lblEditorialSD.setText("Editorial:");

        lblTitleSD.setText("Título:");

        lblYearPrintSD.setText("Año Impresion:");

        lblAuthorSD.setText("Autor:");

        txtEditorialSD.setEditable(false);

        txtYearPrintSD.setEditable(false);

        lblCodeSD.setText("Código:");

        txtCodeSD.setEditable(false);

        lblCopiesSD.setText("Copias:");

        lblAvailableSD.setText("Disponibles:");

        txtAvailableSD.setEditable(false);

        txtCopiesSD.setEditable(false);

        btnDelete.setText("Eliminar");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnEditRegistry.setText("Editar");
        btnEditRegistry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditRegistryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout frmSeeDetailsLayout = new javax.swing.GroupLayout(frmSeeDetails.getContentPane());
        frmSeeDetails.getContentPane().setLayout(frmSeeDetailsLayout);
        frmSeeDetailsLayout.setHorizontalGroup(
            frmSeeDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmSeeDetailsLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(frmSeeDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frmSeeDetailsLayout.createSequentialGroup()
                        .addGroup(frmSeeDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCopiesSD)
                            .addComponent(lblCodeSD)
                            .addComponent(lblTitleSD)
                            .addComponent(lblAuthorSD)
                            .addComponent(lblYearPrintSD)
                            .addComponent(lblEditorialSD))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(frmSeeDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtYearPrintSD)
                            .addComponent(txtAuthorSD)
                            .addComponent(txtTitleSD)
                            .addComponent(txtEditorialSD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtCodeSD, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(frmSeeDetailsLayout.createSequentialGroup()
                                .addComponent(txtCopiesSD)
                                .addGap(15, 15, 15)
                                .addComponent(lblAvailableSD)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAvailableSD))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmSeeDetailsLayout.createSequentialGroup()
                        .addComponent(btnDelete)
                        .addGap(28, 28, 28)
                        .addComponent(btnEditRegistry)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        frmSeeDetailsLayout.setVerticalGroup(
            frmSeeDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmSeeDetailsLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(frmSeeDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodeSD)
                    .addComponent(txtCodeSD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(frmSeeDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitleSD)
                    .addComponent(txtTitleSD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(frmSeeDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAuthorSD)
                    .addComponent(txtAuthorSD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(frmSeeDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblYearPrintSD)
                    .addComponent(txtYearPrintSD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(frmSeeDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEditorialSD)
                    .addComponent(txtEditorialSD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(frmSeeDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCopiesSD)
                    .addComponent(lblAvailableSD)
                    .addComponent(txtAvailableSD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCopiesSD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(frmSeeDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditRegistry)
                    .addComponent(btnDelete))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        frmUsers.setTitle("Usuarios");
        frmUsers.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                frmUsersComponentHidden(evt);
            }
        });

        lstUsers.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstUsers);

        lblUsersHeader.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUsersHeader.setText("Usuarios de Biblioteca");

        btnNewUser.setText("Nuevo");
        btnNewUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewUserActionPerformed(evt);
            }
        });

        btnSearchUser.setText("Buscar");

        btnSeeUserDetails.setText("Ver Detalles");
        btnSeeUserDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeeUserDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout frmUsersLayout = new javax.swing.GroupLayout(frmUsers.getContentPane());
        frmUsers.getContentPane().setLayout(frmUsersLayout);
        frmUsersLayout.setHorizontalGroup(
            frmUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmUsersLayout.createSequentialGroup()
                .addGroup(frmUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(frmUsersLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSeeUserDetails)
                        .addGap(29, 29, 29)
                        .addComponent(btnSearchUser)
                        .addGap(18, 18, 18)
                        .addComponent(btnNewUser))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, frmUsersLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(frmUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUsersHeader))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        frmUsersLayout.setVerticalGroup(
            frmUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmUsersLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblUsersHeader)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(frmUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNewUser)
                    .addComponent(btnSearchUser)
                    .addComponent(btnSeeUserDetails))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        frmNewUser.setTitle("Nuevo Usuario");
        frmNewUser.setType(java.awt.Window.Type.UTILITY);

        lblAgeN.setText("Edad:");

        lblSchool.setText("Escuela:");

        btnSaveNewUser.setText("Guardar");
        btnSaveNewUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveNewUserActionPerformed(evt);
            }
        });

        btnCancelNewUser.setText("Cancelar");
        btnCancelNewUser.setName(""); // NOI18N
        btnCancelNewUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelNewUserActionPerformed(evt);
            }
        });

        lblHeaderNewUser.setText("Nuevo Usuario");

        lblUserNameN.setText("Nombre:");

        javax.swing.GroupLayout frmNewUserLayout = new javax.swing.GroupLayout(frmNewUser.getContentPane());
        frmNewUser.getContentPane().setLayout(frmNewUserLayout);
        frmNewUserLayout.setHorizontalGroup(
            frmNewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmNewUserLayout.createSequentialGroup()
                .addGroup(frmNewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frmNewUserLayout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(lblHeaderNewUser))
                    .addGroup(frmNewUserLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(frmNewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSaveNewUser)
                            .addGroup(frmNewUserLayout.createSequentialGroup()
                                .addGroup(frmNewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblAgeN)
                                    .addComponent(lblUserNameN)
                                    .addComponent(lblSchool))
                                .addGap(18, 18, 18)
                                .addGroup(frmNewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtUserNameN, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAgeN, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSchoolN, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, frmNewUserLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(btnCancelNewUser)))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        frmNewUserLayout.setVerticalGroup(
            frmNewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmNewUserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeaderNewUser)
                .addGap(18, 18, 18)
                .addGroup(frmNewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserNameN)
                    .addComponent(txtUserNameN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(frmNewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAgeN)
                    .addComponent(txtAgeN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(frmNewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSchool)
                    .addComponent(txtSchoolN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(frmNewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaveNewUser)
                    .addComponent(btnCancelNewUser))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        frmUserDetails.setType(java.awt.Window.Type.UTILITY);

        txtUserNameUD.setEditable(false);

        lblAgeUD.setText("Edad:");

        txtAgeUD.setEditable(false);

        lblSchoolUD.setText("Escuela:");

        txtSchoolUD.setEditable(false);

        lblUserNameUD.setText("Nombre:");

        lblUserIDUD.setText("ID:");

        txtUserIDUD.setEditable(false);

        btnDeleteUser.setText("Eliminar");

        btnEditUser.setText("Editar");

        btnCloseUserDetails.setText("Cerrar");
        btnCloseUserDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseUserDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout frmUserDetailsLayout = new javax.swing.GroupLayout(frmUserDetails.getContentPane());
        frmUserDetails.getContentPane().setLayout(frmUserDetailsLayout);
        frmUserDetailsLayout.setHorizontalGroup(
            frmUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmUserDetailsLayout.createSequentialGroup()
                .addGroup(frmUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(frmUserDetailsLayout.createSequentialGroup()
                        .addGroup(frmUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmUserDetailsLayout.createSequentialGroup()
                                .addComponent(btnEditUser)
                                .addGap(32, 32, 32))
                            .addGroup(frmUserDetailsLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(btnCloseUserDetails)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(btnDeleteUser))
                    .addGroup(frmUserDetailsLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(frmUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblUserIDUD)
                            .addComponent(lblAgeUD)
                            .addComponent(lblUserNameUD)
                            .addComponent(lblSchoolUD))
                        .addGap(18, 18, 18)
                        .addGroup(frmUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUserNameUD, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAgeUD, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSchoolUD, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUserIDUD, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        frmUserDetailsLayout.setVerticalGroup(
            frmUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmUserDetailsLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(frmUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserIDUD)
                    .addComponent(txtUserIDUD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(frmUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserNameUD)
                    .addComponent(txtUserNameUD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(frmUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAgeUD)
                    .addComponent(txtAgeUD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(frmUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSchoolUD)
                    .addComponent(txtSchoolUD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(frmUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditUser)
                    .addComponent(btnCloseUserDetails)
                    .addComponent(btnDeleteUser))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Biblioteca");

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
            tblListBooks.getColumnModel().getColumn(0).setPreferredWidth(50);
            tblListBooks.getColumnModel().getColumn(4).setPreferredWidth(50);
            tblListBooks.getColumnModel().getColumn(5).setPreferredWidth(25);
            tblListBooks.getColumnModel().getColumn(6).setPreferredWidth(35);
        }

        btnNewSearch.setText("Buscar");
        btnNewSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewSearchActionPerformed(evt);
            }
        });

        btnPrint.setText("Imprimir");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        btnSeeDetails.setText("Detalles");
        btnSeeDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeeDetailsActionPerformed(evt);
            }
        });

        btnUsers.setText("Usuarios");
        btnUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnUsers)
                                .addGap(18, 18, 18)
                                .addComponent(btnPrint)
                                .addGap(18, 18, 18)
                                .addComponent(btnSeeDetails)
                                .addGap(18, 18, 18)
                                .addComponent(btnNewSearch)
                                .addGap(18, 18, 18)
                                .addComponent(btnNewBook))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(339, 339, 339)
                        .addComponent(lblHeader)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNewBook)
                    .addComponent(btnNewSearch)
                    .addComponent(btnPrint)
                    .addComponent(btnSeeDetails)
                    .addComponent(btnUsers))
                .addContainerGap(23, Short.MAX_VALUE))
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
            Book book = null;
            DefaultTableModel books = (DefaultTableModel)tblListBooks.getModel();
            
            for(Book aux_book:books_array)
            {
                if(aux_book.getAuthor().equalsIgnoreCase((String)books.getValueAt(row, 2))&&
                   aux_book.getEditorial().equalsIgnoreCase((String)books.getValueAt(row, 3))&&
                   aux_book.getTitle().equalsIgnoreCase((String)books.getValueAt(row, 1))&&
                   aux_book.getYearPrint()==Integer.valueOf((String)books.getValueAt(row, 4))&&
                   aux_book.getCode().equalsIgnoreCase((String)books.getValueAt(row, 0)))
                {
                    book = aux_book;
                    break;
                }
            }

            book = BookControler.editBook(txtTitleE.getText(),
                    txtAuthorE.getText(),
                    Integer.valueOf(txtYearPrintE.getText()),
                    txtEditorialE.getText(), book);
            
            books_array.set(book.getRegistryNumber(), book);
            file.addRecord(book, book.getRegistryNumber());
            
            books.setValueAt(book.getCode(), row, 0);
            books.setValueAt(book.getTitle(), row, 1);
            books.setValueAt(book.getAuthor(), row, 2);
            books.setValueAt(book.getEditorial(), row, 3);
            books.setValueAt(Integer.toString(book.getYearPrint()), row, 4);
            
            tblListBooks.setModel(books);
            
            frmEditRegistry.setVisible(false);
            frmSeeDetails.setVisible(false);
        }
    }//GEN-LAST:event_btnSaveChangesActionPerformed

    private void txtEditorialSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditorialSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEditorialSActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        if(btnRdCode.isSelected() || btnRdTitle.isSelected() ||
            btnRdYear.isSelected() || btnRdAuthor.isSelected() ||
            btnRdEditorial.isSelected())
        {
            if(isDataValid() && areFieldsFull())
            {
                searchResult.clear();
                for(Book book:books_array){searchResult.add(book);}  

                if(btnRdCode.isSelected())
                {
                    ArrayList<Book> search = new ArrayList();
                    String searchedCode = txtCodeS.getText();
                    for(Book book:searchResult)
                    {
                        if(book.getCode().contains(searchedCode))
                            search.add(book);
                    }
                    searchResult = search;
                }

                if(btnRdTitle.isSelected())
                {
                    String searchedTitle = txtTitleS.getText();
                    ArrayList<Book> search = new ArrayList();
                    for(Book book:searchResult)
                    {
                        if(book.getTitle().contains(searchedTitle))
                            search.add(book);
                    }
                    searchResult = search;
                }

                if(btnRdAuthor.isSelected())
                {
                    String searchedAuthor = txtAuthorS.getText();
                    ArrayList<Book> search = new ArrayList();
                    for(Book book:searchResult)
                    {
                        if(book.getAuthor().contains(searchedAuthor))
                            search.add(book);
                    }
                    searchResult = search;
                }

                if(btnRdYear.isSelected())
                {
                    String searchedYear = txtYearPrintS.getText();
                    ArrayList<Book> search = new ArrayList();
                    for(Book book:searchResult)
                    {
                        if(book.getYearPrint() == Integer.valueOf(searchedYear))
                            search.add(book);
                    }
                    searchResult = search;
                }

                if(btnRdEditorial.isSelected())
                {
                    String searchedEditorial = txtEditorialS.getText();
                    ArrayList<Book> search = new ArrayList();
                    for(Book book:searchResult)
                    {
                        if(book.getEditorial().contains(searchedEditorial))
                            search.add(book);
                    }
                    searchResult = search;
                }
                
                if(!searchResult.isEmpty())
                {
                    DefaultTableModel books = (DefaultTableModel)tblListBooks.getModel();
                    updateModel(books,searchResult);
                    showingSearch = true;
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "No se encontraron resultados",
                    "Buscar", JOptionPane.INFORMATION_MESSAGE);
                    DefaultTableModel books = (DefaultTableModel)tblListBooks.getModel();
                    tblListBooks.setModel(books);
                    showingSearch = false;
                }
                frmSearch.setVisible(false);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Seleccione al menos un filtro",
                "Buscar", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnNewSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewSearchActionPerformed
        txtAuthorS.setText("");
        txtCodeS.setText("");
        txtEditorialS.setText("");
        txtTitleS.setText("");
        txtYearPrintS.setText("");
        frmSearch.setVisible(true);
        frmSearch.requestFocus();
    }//GEN-LAST:event_btnNewSearchActionPerformed

    private void btnCancelSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelSearchActionPerformed
        frmSearch.setVisible(false);
    }//GEN-LAST:event_btnCancelSearchActionPerformed

    private void txtYearPrintSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtYearPrintSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtYearPrintSActionPerformed

    private void btnShowAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowAllActionPerformed
        DefaultTableModel books = (DefaultTableModel) tblListBooks.getModel();
        updateModel(books,books_array);
        showingSearch = false;
        frmSearch.setVisible(false);
    }//GEN-LAST:event_btnShowAllActionPerformed

    private void btnConfirmDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmDeleteActionPerformed
        int row = tblListBooks.getSelectedRow();
        int registryNumber = -1;
        DefaultTableModel books = (DefaultTableModel)tblListBooks.getModel();
            
        for(Book aux_book:books_array)
        {
            if(aux_book.getAuthor().equalsIgnoreCase((String)books.getValueAt(row, 2))&&
                aux_book.getEditorial().equalsIgnoreCase((String)books.getValueAt(row, 3))&&
                aux_book.getTitle().equalsIgnoreCase((String)books.getValueAt(row, 1))&&
                aux_book.getYearPrint()==Integer.valueOf((String)books.getValueAt(row, 4))&&
                aux_book.getCode().equalsIgnoreCase((String)books.getValueAt(row, 0)))
            {
                registryNumber = aux_book.getRegistryNumber();
                break;
            }
        }
        
        
            Book book = books_array.get(file.numberOfRecords() - 1);
            book.setRegistryNumber(registryNumber);

            books_array.set(registryNumber, book);
            file.addRecord(book, registryNumber);
        
            books_array.remove(file.numberOfRecords() - 1);
            file.delete();
            
        if(showingSearch)
        {
            if(searchResult.size() == 1)
            {
                updateModel(books,books_array);
                showingSearch = false;
            }

            else
            {
                searchResult.remove(row);
                books.removeRow(row);
            }
        }
        else
            books.removeRow(row);
        
        dlgDelete.setVisible(false);
        frmSeeDetails.setVisible(false);
    }//GEN-LAST:event_btnConfirmDeleteActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int row = tblListBooks.getSelectedRow();
        
        DefaultTableModel books = (DefaultTableModel)tblListBooks.getModel();
        lblTitleD.setText((String)books.getValueAt(row, 1));
        dlgDelete.setVisible(true);
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCancelDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelDeleteActionPerformed
        dlgDelete.setVisible(false);
    }//GEN-LAST:event_btnCancelDeleteActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        try
        {
            if(tblListBooks.print(JTable.PrintMode.NORMAL, null, null))
            {
                JOptionPane.showMessageDialog(this, "Impresión exitosa",
                "Imprimir", JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Impresión cancelada",
                "Imprimir", JOptionPane.ERROR_MESSAGE);
            }
        } catch (PrinterException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error al intentar imprimir",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnPrintActionPerformed

    private void txtCodeSFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodeSFocusGained
        btnRdCode.setSelected(true);
    }//GEN-LAST:event_txtCodeSFocusGained

    private void btnRdCodeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_btnRdCodeStateChanged
        if(btnRdCode.isSelected())
            txtCodeS.requestFocus();
        else
            txtCodeS.setText("");
    }//GEN-LAST:event_btnRdCodeStateChanged

    private void txtTitleSFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTitleSFocusGained
        btnRdTitle.setSelected(true);
    }//GEN-LAST:event_txtTitleSFocusGained

    private void txtAuthorSFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAuthorSFocusGained
        btnRdAuthor.setSelected(true);
    }//GEN-LAST:event_txtAuthorSFocusGained

    private void txtYearPrintSFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtYearPrintSFocusGained
        btnRdYear.setSelected(true);
    }//GEN-LAST:event_txtYearPrintSFocusGained

    private void txtEditorialSFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEditorialSFocusGained
        btnRdEditorial.setSelected(true);
    }//GEN-LAST:event_txtEditorialSFocusGained

    private void btnRdTitleStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_btnRdTitleStateChanged
        if(btnRdTitle.isSelected())
            txtTitleS.requestFocus();
        else
            txtTitleS.setText("");
    }//GEN-LAST:event_btnRdTitleStateChanged

    private void btnRdAuthorStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_btnRdAuthorStateChanged
        if(btnRdAuthor.isSelected())
            txtAuthorS.requestFocus();
        else
            txtAuthorS.setText("");
    }//GEN-LAST:event_btnRdAuthorStateChanged

    private void btnRdYearStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_btnRdYearStateChanged
        if(btnRdYear.isSelected())
            txtYearPrintS.requestFocus();
        else
            txtYearPrintS.setText("");
    }//GEN-LAST:event_btnRdYearStateChanged

    private void btnRdEditorialStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_btnRdEditorialStateChanged
        if(btnRdEditorial.isSelected())
            txtEditorialS.requestFocus();
        else
            txtEditorialS.setText("");
    }//GEN-LAST:event_btnRdEditorialStateChanged

    private void txtCodeSKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodeSKeyPressed
        if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_DOWN ||
                evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER)
            txtTitleS.requestFocus();
    }//GEN-LAST:event_txtCodeSKeyPressed

    private void txtTitleSKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTitleSKeyPressed
    if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_DOWN ||
            evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER)
            txtAuthorS.requestFocus();
        
        if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_UP)
            txtCodeS.requestFocus();
    }//GEN-LAST:event_txtTitleSKeyPressed

    private void txtAuthorSKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAuthorSKeyPressed
        if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_DOWN ||
                evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER)
            txtYearPrintS.requestFocus();
        
        if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_UP)
            txtTitleS.requestFocus();
    }//GEN-LAST:event_txtAuthorSKeyPressed

    private void txtEditorialSKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEditorialSKeyPressed
        if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER)
            btnSearch.doClick();
        
        if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_UP)
            txtYearPrintS.requestFocus();
    }//GEN-LAST:event_txtEditorialSKeyPressed

    private void txtYearPrintSKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtYearPrintSKeyPressed
        if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_DOWN ||
                evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER)
            txtEditorialS.requestFocus();
        
        if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_UP)
            txtAuthorS.requestFocus();
    }//GEN-LAST:event_txtYearPrintSKeyPressed

    private void txtCodeSFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodeSFocusLost
        if(txtCodeS.getText().isEmpty())
            btnRdCode.setSelected(false);
    }//GEN-LAST:event_txtCodeSFocusLost

    private void txtTitleSFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTitleSFocusLost
        if(txtTitleS.getText().isEmpty())
            btnRdTitle.setSelected(false);
    }//GEN-LAST:event_txtTitleSFocusLost

    private void txtAuthorSFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAuthorSFocusLost
        if(txtAuthorS.getText().isEmpty())
            btnRdAuthor.setSelected(false);
    }//GEN-LAST:event_txtAuthorSFocusLost

    private void txtYearPrintSFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtYearPrintSFocusLost
        if(txtYearPrintS.getText().isEmpty())
            btnRdYear.setSelected(false);
    }//GEN-LAST:event_txtYearPrintSFocusLost

    private void txtEditorialSFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEditorialSFocusLost
        if(txtEditorialS.getText().isEmpty())
            btnRdEditorial.setSelected(false);
    }//GEN-LAST:event_txtEditorialSFocusLost

    private void frmSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frmSearchMouseClicked
        frmSearch.requestFocus();
    }//GEN-LAST:event_frmSearchMouseClicked

    private void txtTitleKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTitleKeyPressed
        if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_DOWN ||
                evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER)
            txtAuthor.requestFocus();
    }//GEN-LAST:event_txtTitleKeyPressed

    private void txtAuthorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAuthorKeyPressed
        if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_DOWN ||
                evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER)
            txtYearPrint.requestFocus();
        
        if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_UP)
            txtTitle.requestFocus();
    }//GEN-LAST:event_txtAuthorKeyPressed

    private void txtYearPrintKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtYearPrintKeyPressed
        if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_DOWN ||
                evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER)
            txtEditorial.requestFocus();
        
        if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_UP)
            txtAuthor.requestFocus();
    }//GEN-LAST:event_txtYearPrintKeyPressed

    private void txtEditorialKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEditorialKeyPressed
        if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_DOWN ||
                evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER)
            txtCopies.requestFocus();
        
        if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_UP)
            txtYearPrint.requestFocus();
    }//GEN-LAST:event_txtEditorialKeyPressed

    private void txtCopiesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCopiesKeyPressed
        if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER)
            btnSave.doClick();
    }//GEN-LAST:event_txtCopiesKeyPressed

    private void btnSeeDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeeDetailsActionPerformed
        int row = tblListBooks.getSelectedRow();
        if(row > -1)
        {
            Book book = null;
            DefaultTableModel books = (DefaultTableModel)tblListBooks.getModel();
            
            for(Book aux_book:books_array)
            {
                if(aux_book.getAuthor().equalsIgnoreCase((String)books.getValueAt(row, 2))&&
                   aux_book.getEditorial().equalsIgnoreCase((String)books.getValueAt(row, 3))&&
                   aux_book.getTitle().equalsIgnoreCase((String)books.getValueAt(row, 1))&&
                   aux_book.getYearPrint()==Integer.valueOf((String)books.getValueAt(row, 4))&&
                   aux_book.getCode().equalsIgnoreCase((String)books.getValueAt(row, 0)))
                {
                    book = aux_book;
                    break;
                }
            }
            
            txtCodeSD.setText(book.getCode());
            txtTitleSD.setText(book.getTitle());
            txtAuthorSD.setText(book.getAuthor());
            txtEditorialSD.setText(book.getEditorial());
            txtYearPrintSD.setText(Integer.toString(book.getYearPrint()));
            txtCopiesSD.setText(Integer.toString(book.getCopies()));
            txtAvailableSD.setText(Integer.toString(book.getAvailable()));
            
            frmSeeDetails.setTitle(book.getTitle());
            frmSeeDetails.setVisible(true);
        }
        else
        {
           JOptionPane.showMessageDialog(this, "Seleccione un registro",
                "Ver Detalles", JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_btnSeeDetailsActionPerformed

    private void btnNewUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewUserActionPerformed
        txtUserNameN.setText("");
        txtAgeN.setText("");
        txtSchoolN.setText("");
        frmNewUser.setVisible(true);
        txtUserNameN.requestFocus();
    }//GEN-LAST:event_btnNewUserActionPerformed

    private void btnUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsersActionPerformed
        DefaultListModel users = new DefaultListModel();

        for(LibraryUser user:users_array)
        {
            users.addElement(user);
        }

        lstUsers.setModel(users);
        this.setVisible(false);
        frmUsers.setVisible(true);
    }//GEN-LAST:event_btnUsersActionPerformed

    private void btnSaveNewUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveNewUserActionPerformed
         if(areFieldsFull() && isDataValid())
        {
            DefaultListModel users = (DefaultListModel) lstUsers.getModel();
            
            LibraryUser user = UserControler.createUser(txtUserNameN.getText(),
                Integer.valueOf(txtAgeN.getText()), txtSchoolN.getText(),
                usersFile.numberOfRecords(), usersIDCount);
            
            usersIDCount++;
            counters.writeUsers(usersIDCount);

            users_array.add(user);
            usersFile.addRecord(user, usersFile.numberOfRecords());
            users.addElement(user);
            lstUsers.setModel(users);
            frmNewUser.setVisible(false);
        }
    }//GEN-LAST:event_btnSaveNewUserActionPerformed

    private void frmUsersComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_frmUsersComponentHidden
        this.setVisible(true);
    }//GEN-LAST:event_frmUsersComponentHidden

    private void btnCancelNewUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelNewUserActionPerformed
        frmNewUser.setVisible(false);
    }//GEN-LAST:event_btnCancelNewUserActionPerformed

    private void btnSeeUserDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeeUserDetailsActionPerformed
        int selection = lstUsers.getSelectedIndex();
        if(selection > -1)
        {
            DefaultListModel users = (DefaultListModel) lstUsers.getModel();
            
            LibraryUser user = (LibraryUser) users.get(selection);
            
            txtAgeUD.setText(Integer.toString(user.getAge()));
            txtUserNameUD.setText(user.getUserName());
            txtUserIDUD.setText(user.getLibraryID());
            txtSchoolUD.setText(user.getSchool());
            
            frmUserDetails.setTitle(user.getUserName());
            frmUserDetails.setVisible(true);
        }
        else
        {
            JOptionPane.showMessageDialog(frmUsers, "Seleccione un registro",
                "Ver Detalles", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnSeeUserDetailsActionPerformed

    private void btnCloseUserDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseUserDetailsActionPerformed
        frmUserDetails.setVisible(false);
    }//GEN-LAST:event_btnCloseUserDetailsActionPerformed

    private void btnEditRegistryActionPerformed(java.awt.event.ActionEvent evt)
    {
        int row = tblListBooks.getSelectedRow();

        DefaultTableModel books = (DefaultTableModel)tblListBooks.getModel();
        txtAuthorE.setText((String)books.getValueAt(row, 2));
        txtEditorialE.setText((String)books.getValueAt(row, 3));
        txtTitleE.setText((String)books.getValueAt(row, 1));
        txtYearPrintE.setText((String)books.getValueAt(row, 4));
        tblListBooks.setModel(books);
        frmEditRegistry.setVisible(true);
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
            DefaultTableModel books = (DefaultTableModel)tblListBooks.getModel();
            Book book = BookControler.createBook(txtTitle.getText(), txtAuthor.getText(),
                    Integer.valueOf(txtYearPrint.getText()), txtEditorial.getText(),
                    Integer.valueOf(txtCopies.getText()), file.numberOfRecords());

            books_array.add(book);
            file.addRecord(book, file.numberOfRecords());
            addToTable(book,books);
            tblListBooks.setModel(books);
            frmNewBook.setVisible(false);
        }
    }
    
    private void updateModel(DefaultTableModel model, ArrayList<Book> array)
    {
        model.setRowCount(0);
        for(Book aux_book:array)
            addToTable(aux_book, model);
        tblListBooks.setModel(model);
    }
    
    private boolean isDataValid()
    {
        if(frmNewBook.isVisible())
        {
            try
            {
                int year = Integer.valueOf(txtYearPrint.getText());
                if(year <  1000)
                {
                    txtYearPrint.setText("");
                    JOptionPane.showMessageDialog(frmNewBook, "Años entre 1000 y el actual" , "ERROR", JOptionPane.ERROR_MESSAGE);
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
                int copies = Integer.valueOf(txtCopies.getText());
                if(copies < 0)
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
                if(year <  1000)
                {
                    txtYearPrintE.setText("");
                    JOptionPane.showMessageDialog(frmEditRegistry, "Años entre 1000 y el actual" , "ERROR", JOptionPane.ERROR_MESSAGE);
                    return false;
                }
            } catch ( NumberFormatException e )
            {
                txtYearPrintE.setText("");
                JOptionPane.showMessageDialog(frmEditRegistry, "Año debe ser un valor entero" , "ERROR", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        else if(frmSearch.isVisible() && btnRdYear.isSelected() && !txtYearPrintS.getText().isEmpty())
        {
            try
            {
                int year = Integer.valueOf(txtYearPrintS.getText());
                if(year <  1000)
                {
                    txtYearPrintS.setText("");
                    JOptionPane.showMessageDialog(frmSearch, "Años entre 1000 y el actual" , "ERROR", JOptionPane.ERROR_MESSAGE);
                    return false;
                }
            } catch ( NumberFormatException e )
            {
                txtYearPrintE.setText("");
                JOptionPane.showMessageDialog(frmSearch, "Año debe ser un valor entero" , "ERROR", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        else if(frmNewUser.isVisible())
        {
            try
            {
                int age = Integer.valueOf(txtAgeN.getText());
                if(age < 0)
                {
                    txtAgeN.setText("");
                    JOptionPane.showMessageDialog(frmNewUser, "Edad debe ser positivo", "ERROR", JOptionPane.ERROR_MESSAGE);
                    return false;
                }
            } catch ( NumberFormatException e )
            {
                txtAgeN.setText("");
                JOptionPane.showMessageDialog(frmNewUser, "Edad debe ser un valor entero", "ERROR", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }

        return true;
    }

    private boolean areFieldsFull()
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
        
        else if(frmSearch.isVisible())
        {
            if(txtYearPrintS.getText().isEmpty() && btnRdYear.isSelected() || 
                txtAuthorS.getText().isEmpty() && btnRdAuthor.isSelected() ||
                txtEditorialS.getText().isEmpty() && btnRdEditorial.isSelected() ||
                txtTitleS.getText().isEmpty() && btnRdTitle.isSelected() ||
                txtCodeS.getText().isEmpty() && btnRdCode.isSelected())
            {
                
            }
        }
        else if(frmNewUser.isVisible())
        {
            if(txtUserNameN.getText().isEmpty() ||
                txtAgeN.getText().isEmpty() ||
                txtSchoolN.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(frmSearch, "Debe llenar todos los campos");
                return false;
            }
        }   

        return true;
    }

    private void addToTable(Book book, DefaultTableModel model)
    {
        String[] newBook = {book.getCode(), book.getTitle(), book.getAuthor(),
            book.getEditorial(), Integer.toString(book.getYearPrint()),
            Integer.toString(book.getCopies()), Integer.toString(book.getAvailable())};
        model.addRow(newBook);
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
                if ("Windows".equals(info.getName())) {
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
    private javax.swing.JButton btnCancelDelete;
    private javax.swing.JButton btnCancelNew;
    private javax.swing.JButton btnCancelNewUser;
    private javax.swing.JButton btnCancelSearch;
    private javax.swing.JButton btnCloseUserDetails;
    private javax.swing.JButton btnConfirmDelete;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDeleteUser;
    private javax.swing.JButton btnEditRegistry;
    private javax.swing.JButton btnEditUser;
    private javax.swing.JButton btnNewBook;
    private javax.swing.JButton btnNewSearch;
    private javax.swing.JButton btnNewUser;
    private javax.swing.JButton btnPrint;
    private javax.swing.JRadioButton btnRdAuthor;
    private javax.swing.JRadioButton btnRdCode;
    private javax.swing.JRadioButton btnRdEditorial;
    private javax.swing.JRadioButton btnRdTitle;
    private javax.swing.JRadioButton btnRdYear;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSaveChanges;
    private javax.swing.JButton btnSaveNewUser;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSearchUser;
    private javax.swing.JButton btnSeeDetails;
    private javax.swing.JButton btnSeeUserDetails;
    private javax.swing.JButton btnShowAll;
    private javax.swing.JButton btnUsers;
    private javax.swing.JDialog dlgDelete;
    private javax.swing.JFrame frmEditRegistry;
    private javax.swing.JFrame frmNewBook;
    private javax.swing.JFrame frmNewUser;
    private javax.swing.JFrame frmSearch;
    private javax.swing.JFrame frmSeeDetails;
    private javax.swing.JFrame frmUserDetails;
    private javax.swing.JFrame frmUsers;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAgeN;
    private javax.swing.JLabel lblAgeUD;
    private javax.swing.JLabel lblAuthor;
    private javax.swing.JLabel lblAuthorE;
    private javax.swing.JLabel lblAuthorS;
    private javax.swing.JLabel lblAuthorSD;
    private javax.swing.JLabel lblAvailableSD;
    private javax.swing.JLabel lblCantCopies;
    private javax.swing.JLabel lblCodeS;
    private javax.swing.JLabel lblCodeSD;
    private javax.swing.JLabel lblCopiesSD;
    private javax.swing.JLabel lblEditorial;
    private javax.swing.JLabel lblEditorialE;
    private javax.swing.JLabel lblEditorialS;
    private javax.swing.JLabel lblEditorialSD;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblHeaderNewUser;
    private javax.swing.JLabel lblInstSearch;
    private javax.swing.JLabel lblMnsg1D;
    private javax.swing.JLabel lblMnsg2D;
    private javax.swing.JLabel lblSchool;
    private javax.swing.JLabel lblSchoolUD;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTitleD;
    private javax.swing.JLabel lblTitleE;
    private javax.swing.JLabel lblTitleS;
    private javax.swing.JLabel lblTitleSD;
    private javax.swing.JLabel lblUserIDUD;
    private javax.swing.JLabel lblUserNameN;
    private javax.swing.JLabel lblUserNameUD;
    private javax.swing.JLabel lblUsersHeader;
    private javax.swing.JLabel lblYearPrint;
    private javax.swing.JLabel lblYearPrintE;
    private javax.swing.JLabel lblYearPrintSD;
    private javax.swing.JLabel lblYearS;
    private javax.swing.JList<String> lstUsers;
    private javax.swing.JTable tblListBooks;
    private javax.swing.JTextField txtAgeN;
    private javax.swing.JTextField txtAgeUD;
    private javax.swing.JTextField txtAuthor;
    private javax.swing.JTextField txtAuthorE;
    private javax.swing.JTextField txtAuthorS;
    private javax.swing.JTextField txtAuthorSD;
    private javax.swing.JTextField txtAvailableSD;
    private javax.swing.JTextField txtCodeS;
    private javax.swing.JTextField txtCodeSD;
    private javax.swing.JTextField txtCopies;
    private javax.swing.JTextField txtCopiesSD;
    private javax.swing.JTextField txtEditorial;
    private javax.swing.JTextField txtEditorialE;
    private javax.swing.JTextField txtEditorialS;
    private javax.swing.JTextField txtEditorialSD;
    private javax.swing.JTextField txtSchoolN;
    private javax.swing.JTextField txtSchoolUD;
    private javax.swing.JTextField txtTitle;
    private javax.swing.JTextField txtTitleE;
    private javax.swing.JTextField txtTitleS;
    private javax.swing.JTextField txtTitleSD;
    private javax.swing.JTextField txtUserIDUD;
    private javax.swing.JTextField txtUserNameN;
    private javax.swing.JTextField txtUserNameUD;
    private javax.swing.JTextField txtYearPrint;
    private javax.swing.JTextField txtYearPrintE;
    private javax.swing.JTextField txtYearPrintS;
    private javax.swing.JTextField txtYearPrintSD;
    // End of variables declaration//GEN-END:variables
}
