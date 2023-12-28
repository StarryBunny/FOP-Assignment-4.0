/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login;

import javax.swing.*;

public class RegistrationForm extends JFrame {

    public RegistrationForm() {
        initComponents();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
    }

    private void initComponents() {
        String xmlCode = """
                         <?xml version="1.0" encoding="UTF-8" ?>
                         
                         <Form version="1.3" maxVersion="1.9" type="org.netbeans.modules.form.forminfo.JFrameFormInfo">
                           <Properties>
                             <Property name="defaultCloseOperation" type="int" value="3"/>
                           </Properties>
                           <SyntheticProperties>
                             <SyntheticProperty name="formSize" type="java.awt.Dimension" value="-84,-19,0,5,115,114,0,18,106,97,118,97,46,97,119,116,46,68,105,109,101,110,115,105,111,110,65,-114,-39,-41,-84,95,68,20,2,0,2,73,0,6,104,101,105,103,104,116,73,0,5,119,105,100,116,104,120,112,0,0,1,116,0,0,1,-96"/>
                             <SyntheticProperty name="formSizePolicy" type="int" value="0"/>
                             <SyntheticProperty name="generateSize" type="boolean" value="true"/>
                             <SyntheticProperty name="generateCenter" type="boolean" value="true"/>
                           </SyntheticProperties>
                           <AuxValues>
                             <AuxValue name="FormSettings_autoResourcing" type="java.lang.Integer" value="0"/>
                             <AuxValue name="FormSettings_autoSetComponentName" type="java.lang.Boolean" value="false"/>
                             <AuxValue name="FormSettings_generateFQN" type="java.lang.Boolean" value="true"/>
                             <AuxValue name="FormSettings_generateMnemonicsCode" type="java.lang.Boolean" value="false"/>
                             <AuxValue name="FormSettings_i18nAutoMode" type="java.lang.Boolean" value="false"/>
                             <AuxValue name="FormSettings_layoutCodeTarget" type="java.lang.Integer" value="1"/>
                             <AuxValue name="FormSettings_listenerGenerationStyle" type="java.lang.Integer" value="0"/>
                             <AuxValue name="FormSettings_variablesLocal" type="java.lang.Boolean" value="false"/>
                             <AuxValue name="FormSettings_variablesModifier" type="java.lang.Integer" value="2"/>
                           </AuxValues>
                         
                           <Layout>
                             <DimensionLayout dim="0">
                               <Group type="103" groupAlignment="0" attributes="0">
                                   <Component id="jPanel1" alignment="0" max="32767" attributes="0"/>
                                   <Group type="102" alignment="0" attributes="0">
                                       <EmptySpace min="-2" pref="35" max="-2" attributes="0"/>
                                       <Group type="103" groupAlignment="0" attributes="0">
                                           <Component id="jLabel2" alignment="0" min="-2" max="-2" attributes="0"/>
                                           <Component id="jLabel3" alignment="0" min="-2" max="-2" attributes="0"/>
                                           <Component id="jLabel4" alignment="0" min="-2" max="-2" attributes="0"/>
                                           <Component id="jLabel5" alignment="0" min="-2" max="-2" attributes="0"/>
                                       </Group>
                                       <EmptySpace pref="45" max="32767" attributes="0"/>
                                       <Group type="103" groupAlignment="0" max="-2" attributes="0">
                                           <Component id="txID" max="32767" attributes="0"/>
                                           <Component id="txUsername" max="32767" attributes="0"/>
                                           <Component id="txPassword" max="32767" attributes="0"/>
                                           <Component id="txConPassword" min="-2" pref="194" max="-2" attributes="0"/>
                                       </Group>
                                       <EmptySpace min="-2" pref="39" max="-2" attributes="0"/>
                                   </Group>
                                   <Group type="102" alignment="0" attributes="0">
                                       <EmptySpace min="-2" pref="115" max="-2" attributes="0"/>
                                       <Component id="jButton1" min="-2" max="-2" attributes="0"/>
                                       <EmptySpace type="separate" max="-2" attributes="0"/>
                                       <Component id="jButton2" min="-2" pref="73" max="-2" attributes="0"/>
                                       <EmptySpace max="32767" attributes="0"/>
                                   </Group>
                               </Group>
                             </DimensionLayout>
                             <DimensionLayout dim="1">
                               <Group type="103" groupAlignment="0" attributes="0">
                                   <Group type="102" alignment="0" attributes="0">
                                       <Component id="jPanel1" min="-2" max="-2" attributes="0"/>
                                       <EmptySpace min="-2" pref="30" max="-2" attributes="0"/>
                                       <Group type="103" groupAlignment="3" attributes="0">
                                           <Component id="jLabel2" alignment="3" min="-2" max="-2" attributes="0"/>
                                           <Component id="txID" alignment="3" min="-2" max="-2" attributes="0"/>
                                       </Group>
                                       <EmptySpace min="-2" pref="13" max="-2" attributes="0"/>
                                       <Group type="103" groupAlignment="3" attributes="0">
                                           <Component id="jLabel3" alignment="3" min="-2" max="-2" attributes="0"/>
                                           <Component id="txUsername" alignment="3" min="-2" max="-2" attributes="0"/>
                                       </Group>
                                       <EmptySpace min="-2" pref="15" max="-2" attributes="0"/>
                                       <Group type="103" groupAlignment="3" attributes="0">
                                           <Component id="jLabel4" alignment="3" min="-2" max="-2" attributes="0"/>
                                           <Component id="txPassword" alignment="3" min="-2" max="-2" attributes="0"/>
                                       </Group>
                                       <EmptySpace type="separate" max="-2" attributes="0"/>
                                       <Group type="103" groupAlignment="3" attributes="0">
                                           <Component id="jLabel5" alignment="3" min="-2" max="-2" attributes="0"/>
                                           <Component id="txConPassword" alignment="3" min="-2" max="-2" attributes="0"/>
                                       </Group>
                                       <EmptySpace min="-2" pref="27" max="-2" attributes="0"/>
                                       <Group type="103" groupAlignment="3" attributes="0">
                                           <Component id="jButton1" alignment="3" min="-2" pref="39" max="-2" attributes="0"/>
                                           <Component id="jButton2" alignment="3" min="-2" pref="39" max="-2" attributes="0"/>
                                       </Group>
                                       <EmptySpace min="0" pref="48" max="32767" attributes="0"/>
                                   </Group>
                               </Group>
                             </DimensionLayout>
                           </Layout>
                           <SubComponents>
                             <Container class="javax.swing.JPanel" name="jPanel1">
                               <Properties>
                                 <Property name="background" type="java.awt.Color" editor="org.netbeans.beaninfo.editors.ColorEditor">
                                   <Color blue="ff" green="99" red="99" type="rgb"/>
                                 </Property>
                               </Properties>
                         
                               <Layout>
                                 <DimensionLayout dim="0">
                                   <Group type="103" groupAlignment="0" attributes="0">
                                       <Group type="102" alignment="0" attributes="0">
                                           <EmptySpace min="-2" pref="152" max="-2" attributes="0"/>
                                           <Component id="jLabel1" min="-2" max="-2" attributes="0"/>
                                           <EmptySpace max="32767" attributes="0"/>
                                       </Group>
                                   </Group>
                                 </DimensionLayout>
                                 <DimensionLayout dim="1">
                                   <Group type="103" groupAlignment="0" attributes="0">
                                       <Group type="102" alignment="0" attributes="0">
                                           <EmptySpace min="-2" pref="20" max="-2" attributes="0"/>
                                           <Component id="jLabel1" min="-2" max="-2" attributes="0"/>
                                           <EmptySpace pref="21" max="32767" attributes="0"/>
                                       </Group>
                                   </Group>
                                 </DimensionLayout>
                               </Layout>
                               <SubComponents>
                                 <Component class="javax.swing.JLabel" name="jLabel1">
                                   <Properties>
                                     <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
                                       <Font name="Tahoma" size="18" style="1"/>
                                     </Property>
                                     <Property name="text" type="java.lang.String" value="REGISTER"/>
                                   </Properties>
                                 </Component>
                               </SubComponents>
                             </Container>
                             <Component class="javax.swing.JLabel" name="jLabel2">
                               <Properties>
                                 <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
                                   <Font name="Tahoma" size="12" style="1"/>
                                 </Property>
                                 <Property name="text" type="java.lang.String" value="ID"/>
                               </Properties>
                             </Component>
                             <Component class="javax.swing.JLabel" name="jLabel3">
                               <Properties>
                                 <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
                                   <Font name="Tahoma" size="12" style="1"/>
                                 </Property>
                                 <Property name="text" type="java.lang.String" value="Username"/>
                               </Properties>
                             </Component>
                             <Component class="javax.swing.JLabel" name="jLabel4">
                               <Properties>
                                 <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
                                   <Font name="Tahoma" size="12" style="1"/>
                                 </Property>
                                 <Property name="text" type="java.lang.String" value="Password"/>
                               </Properties>
                             </Component>
                             <Component class="javax.swing.JLabel" name="jLabel5">
                               <Properties>
                                 <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
                                   <Font name="Tahoma" size="12" style="1"/>
                                 </Property>
                                 <Property name="text" type="java.lang.String" value="Con.Password"/>
                               </Properties>
                             </Component>
                             <Component class="javax.swing.JTextField" name="txID">
                             </Component>
                             <Component class="javax.swing.JTextField" name="txUsername">
                             </Component>
                             <Component class="javax.swing.JPasswordField" name="txPassword">
                             </Component>
                             <Component class="javax.swing.JPasswordField" name="txConPassword">
                             </Component>
                             <Component class="javax.swing.JButton" name="jButton1">
                               <Properties>
                                 <Property name="text" type="java.lang.String" value="Register"/>
                               </Properties>
                               <Events>
                                 <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="jButton1ActionPerformed"/>
                               </Events>
                             </Component>
                             <Component class="javax.swing.JButton" name="jButton2">
                               <Properties>
                                 <Property name="text" type="java.lang.String" value="Batal"/>
                               </Properties>
                               <Events>
                                 <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="jButton2ActionPerformed"/>
                               </Events>
                             </Component>
                           </SubComponents>
                         </Form>""";
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            RegistrationForm form = new RegistrationForm();
            form.setVisible(true); // Setting visibility here
        });
    }
}

    

