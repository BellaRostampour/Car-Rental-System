
public class VehicleForm extends javax.swing.JFrame {
    

    
    public VehicleForm() {
        initComponents();
        
               
          }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comboCar = new javax.swing.JComboBox();
        btnSpc = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        panelSpecification = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        labelManu = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        labelModel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        labelYear = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        labelKm = new javax.swing.JLabel();
        panelInfo = new javax.swing.JPanel();
        labelInfo2 = new javax.swing.JLabel();
        labelInfo1 = new javax.swing.JLabel();
        labelInfo3 = new javax.swing.JLabel();
        labelServices = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jLabel1.setText("Bella Car Rental System");

        jLabel2.setBackground(new java.awt.Color(255, 204, 204));
        jLabel2.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jLabel2.setText("Select the Vehicle:");

        comboCar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ferrari", "Lamborghini", "Aston Martin", "BMW", "McLaren" }));

        btnSpc.setText("Get Specifications");
        btnSpc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSpcActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jLabel3.setText("Specifications:");

        jLabel9.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jLabel9.setText("More Info:");
        jLabel9.setName(""); // NOI18N

        panelSpecification.setBackground(new java.awt.Color(153, 153, 255));

        jLabel4.setBackground(new java.awt.Color(0, 0, 204));
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("Manufacturer: ");

        jLabel5.setForeground(new java.awt.Color(0, 51, 204));
        jLabel5.setText("Model: ");

        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setText("Make Year:");

        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setText("Total Kilometres Travelled:");

        javax.swing.GroupLayout panelSpecificationLayout = new javax.swing.GroupLayout(panelSpecification);
        panelSpecification.setLayout(panelSpecificationLayout);
        panelSpecificationLayout.setHorizontalGroup(
            panelSpecificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSpecificationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSpecificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSpecificationLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(labelYear, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
                        .addGroup(panelSpecificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelSpecificationLayout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelModel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelSpecificationLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(labelKm, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(89, 89, 89))
                    .addGroup(panelSpecificationLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelManu, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(275, 275, 275))))
        );
        panelSpecificationLayout.setVerticalGroup(
            panelSpecificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSpecificationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSpecificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelManu, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelModel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelSpecificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelKm, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelYear, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        panelInfo.setBackground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout panelInfoLayout = new javax.swing.GroupLayout(panelInfo);
        panelInfo.setLayout(panelInfoLayout);
        panelInfoLayout.setHorizontalGroup(
            panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelInfo2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelInfo1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelInfo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelInfoLayout.createSequentialGroup()
                        .addComponent(labelServices, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 139, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelInfoLayout.setVerticalGroup(
            panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelInfo1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelInfo2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelServices, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelInfo3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelSpecification, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(287, 287, 287)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelInfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(comboCar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSpc)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboCar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSpc))
                .addGap(99, 99, 99)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelSpecification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSpcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSpcActionPerformed
        
        //Create new variables 
        VehicleDetails myCars = new VehicleDetails();
        
        //Create ner variables
        Journey trip = new Journey();
        
        
        //Create new Array for cars list
        
        String[] carList = new String[5];
        carList[0] = "Ferrari";
        carList[1] = "Lamborghini";
        carList[2] = "Aston Martin";
        carList[3] = "BMW";
        carList[4] = "McLaren";

        // Select car from Combobox to get the specifications on labelShow
        
        if(comboCar.getSelectedItem() == "Ferrari"){
            myCars.setManufacturer(carList[0]);
            String carName = myCars.getManufacturer();
            labelManu.setText(carName);
            
            myCars.setModel("458");
            String carModel = myCars.getModel();
            labelModel.setText(carModel);
            
            myCars.setYear(2015);
            int carYear = myCars.getYear();
            labelYear.setText(Integer.toString(carYear));
            
            myCars.setKm(572);
            int carKm = myCars.getKm();
            labelKm.setText(Integer.toString(carKm));
            
            myCars.setServices(carKm / 100);
            int carServices = myCars.getServices();
            labelServices.setText("This vehicle should have undergone "+ Integer.toString(carServices)+" Services.");
            
            myCars.setKm(carKm);
            int travelKm = myCars.getKm();
            trip.setFuelEco(23.3);
            double fuelEcoRate = trip.getFuelEco();
            double fuelEco = 100 / fuelEcoRate;
            trip.setFuelCost(1.18);
            double fuelCostRate = trip.getFuelCost();
            trip.setFuelConsume(travelKm / fuelEco);
            double fuelConsume = trip.getFuelConsume() ;
            double fuelCost = fuelCostRate * fuelConsume;
            labelInfo1.setText(Integer.toString(travelKm)+ " Km travelled requiring " + Math.round(fuelConsume) + " Liters of the fuel at cost of $" + Math.round(fuelCost)+ " .");
            labelInfo2.setText("This vehicle achieved a fuel economy of " + fuelEcoRate + " Litres/100Km.");
            labelInfo3.setText("The average cost of fuel was " + fuelCostRate + " per litre.");
           
            
                               
        }
        else if(comboCar.getSelectedItem() == "Lamborghini"){
            myCars.setManufacturer(carList[1]);
            String carName = myCars.getManufacturer();
            labelManu.setText(carName);
            
            myCars.setModel("Huracan");
            String carModel = myCars.getModel();
            labelModel.setText(carModel);
            
            myCars.setYear(2015);
            int carYear = myCars.getYear();
            labelYear.setText(Integer.toString(carYear));
            
            myCars.setKm(386);
            int carKm = myCars.getKm();
            labelKm.setText(Integer.toString(carKm));
            
            myCars.setServices(carKm / 100);
            int carServices = myCars.getServices();
            labelServices.setText("This vehicle should have undergone "+ Integer.toString(carServices)+" Services.");
            
            myCars.setKm(carKm);
            int travelKm = myCars.getKm();
            trip.setFuelEco(25.8);
            double fuelEcoRate = trip.getFuelEco();
            double fuelEco = 100 / fuelEcoRate;
            trip.setFuelCost(0.95);
            double fuelCostRate = trip.getFuelCost();
            trip.setFuelConsume(travelKm / fuelEco);
            double fuelConsume = trip.getFuelConsume() ;
            double fuelCost = fuelCostRate * fuelConsume;
            labelInfo1.setText(Integer.toString(travelKm)+ " Km travelled requiring " + Math.round(fuelConsume) + " Liters of the fuel at cost of $" + Math.round(fuelCost)+ " .");
            labelInfo2.setText("This vehicle achieved a fuel economy of " + fuelEcoRate + " Litres/100Km.");
            labelInfo3.setText("The average cost of fuel was " + fuelCostRate + " per litre.");
                               
        }
          else if(comboCar.getSelectedItem() == "Aston Martin"){
            myCars.setManufacturer(carList[2]);
            String carName = myCars.getManufacturer();
            labelManu.setText(carName);
            
            myCars.setModel("Vanquish");
            String carModel = myCars.getModel();
            labelModel.setText(carModel);
            
            myCars.setYear(2016);
            int carYear = myCars.getYear();
            labelYear.setText(Integer.toString(carYear));
            
            myCars.setKm(105);
            int carKm = myCars.getKm();
            labelKm.setText(Integer.toString(carKm));
            
            myCars.setServices(carKm / 100);
            int carServices = myCars.getServices();
            labelServices.setText("This vehicle should have undergone "+ Integer.toString(carServices)+" Services.");
            
             myCars.setKm(carKm);
            int travelKm = myCars.getKm();
            trip.setFuelEco(34.0);
            double fuelEcoRate = trip.getFuelEco();
            double fuelEco = 100 / fuelEcoRate;
            trip.setFuelCost(1.23);
            double fuelCostRate = trip.getFuelCost();
            trip.setFuelConsume(travelKm / fuelEco);
            double fuelConsume = trip.getFuelConsume() ;
            double fuelCost = fuelCostRate * fuelConsume;
            labelInfo1.setText(Integer.toString(travelKm)+ " Km travelled requiring " + Math.round(fuelConsume) + " Liters of the fuel at cost of $" + Math.round(fuelCost)+ " .");
            labelInfo2.setText("This vehicle achieved a fuel economy of " + fuelEcoRate + " Litres/100Km.");
            labelInfo3.setText("The average cost of fuel was " + fuelCostRate + " per litre.");
           
                               
        }
          else if(comboCar.getSelectedItem() == "BMW"){
            myCars.setManufacturer(carList[3]);
            String carName = myCars.getManufacturer();
            labelManu.setText(carName);
            
            myCars.setModel("i8");
            String carModel = myCars.getModel();
            labelModel.setText(carModel);
            
            myCars.setYear(2015);
            int carYear = myCars.getYear();
            labelYear.setText(Integer.toString(carYear));
            
            myCars.setKm(422);
            int carKm = myCars.getKm();
            labelKm.setText(Integer.toString(carKm));
            
            myCars.setServices(carKm / 100);
            int carServices = myCars.getServices();
            labelServices.setText("This vehicle should have undergone "+ Integer.toString(carServices)+" Services.");
            
             myCars.setKm(carKm);
            int travelKm = myCars.getKm();
            trip.setFuelEco(13.0);
            double fuelEcoRate = trip.getFuelEco();
            double fuelEco = 100 / fuelEcoRate;
            trip.setFuelCost(0.98);
            double fuelCostRate = trip.getFuelCost();
            trip.setFuelConsume(travelKm / fuelEco);
            double fuelConsume = trip.getFuelConsume() ;
            double fuelCost = fuelCostRate * fuelConsume;
            labelInfo1.setText(Integer.toString(travelKm)+ " Km travelled requiring " + Math.round(fuelConsume) + " Liters of the fuel at cost of $" + Math.round(fuelCost)+ " .");
            labelInfo2.setText("This vehicle achieved a fuel economy of " + fuelEcoRate + " Litres/100Km.");
            labelInfo3.setText("The average cost of fuel was " + fuelCostRate + " per litre.");
           
                               
        }
          else if(comboCar.getSelectedItem() == "McLaren"){
            myCars.setManufacturer(carList[4]);
            String carName = myCars.getManufacturer();
            labelManu.setText(carName);
            
            myCars.setModel("650S");
            String carModel = myCars.getModel();
            labelModel.setText(carModel);
            
            myCars.setYear(2015);
            int carYear = myCars.getYear();
            labelYear.setText(Integer.toString(carYear));
            
            myCars.setKm(179);
            int carKm = myCars.getKm();
            labelKm.setText(Integer.toString(carKm));
            
            myCars.setServices(carKm / 100);
            int carServices = myCars.getServices();
            labelServices.setText("This vehicle should have undergone "+ Integer.toString(carServices)+" Services.");
            
             myCars.setKm(carKm);
            int travelKm = myCars.getKm();
            trip.setFuelEco(21.5);
            double fuelEcoRate = trip.getFuelEco();
            double fuelEco = 100 / fuelEcoRate;
            trip.setFuelCost(1.06);
            double fuelCostRate = trip.getFuelCost();
            trip.setFuelConsume(travelKm / fuelEco);
            double fuelConsume = trip.getFuelConsume() ;
            double fuelCost = fuelCostRate * fuelConsume;
            labelInfo1.setText(Integer.toString(travelKm)+ " Km travelled requiring " + Math.round(fuelConsume) + " Liters of the fuel at cost of $" + Math.round(fuelCost)+ " .");
            labelInfo2.setText("This vehicle achieved a fuel economy of " + fuelEcoRate + " Litres/100Km.");
            labelInfo3.setText("The average cost of fuel was " + fuelCostRate + " per litre.");
           
                               
        }
    }//GEN-LAST:event_btnSpcActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VehicleForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSpc;
    private javax.swing.JComboBox comboCar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel labelInfo1;
    private javax.swing.JLabel labelInfo2;
    private javax.swing.JLabel labelInfo3;
    private javax.swing.JLabel labelKm;
    private javax.swing.JLabel labelManu;
    private javax.swing.JLabel labelModel;
    private javax.swing.JLabel labelServices;
    private javax.swing.JLabel labelYear;
    private javax.swing.JPanel panelInfo;
    private javax.swing.JPanel panelSpecification;
    // End of variables declaration//GEN-END:variables
}
