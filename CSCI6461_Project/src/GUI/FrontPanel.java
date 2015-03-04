/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Utilities.DataTypeConvertor;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;

/**
 *
 * @author Aether
 */
public class FrontPanel extends JFrame {

    /**
     * Creates new form FrontPanel
     */
    public Boolean changed;
    public Boolean run;
    public Boolean singleStep;
    public Boolean IPL;
    public Boolean setFile;
    public File programFile;
    static JTextField GPR0[];
    static JTextField GPR1[];
    static JTextField GPR2[];
    static JTextField GPR3[];
    static JCheckBox GPRSwitch0[];
    static JCheckBox GPRSwitch1[];
    static JCheckBox GPRSwitch2[];
    static JCheckBox GPRSwitch3[];
    static JTextField X1[];
    static JTextField X2[];
    static JTextField X3[];
    static JCheckBox XSwitch1[];
    static JCheckBox XSwitch2[];
    static JCheckBox XSwitch3[];
    static JTextField PC[];
    static JCheckBox PCSwitch[];
    static JTextField IR[];
    static JCheckBox IRSwitch[];
    static JTextField MAR[];
    static JCheckBox MARSwitch[];
    static JTextField MBR[];
    static JCheckBox MBRSwitch[];
    static JTextField MSR[];
    static JCheckBox MSRSwitch[];
    static JTextField MFR[];
    static JCheckBox MFRSwitch[];
    static JTextField CC[];
    static JCheckBox CCSwitch[];
    static JTextArea Printer;
    static JTextField ConsoleInput;
    
    public String userText;
    public String consoleOutput;
    public boolean userInput;
    public boolean GPR_changed[];
    public boolean XR_changed[];
    public boolean PC_changed;
    public boolean CC_changed;
    public boolean IR_changed;
    public boolean MAR_changed;
    public boolean MBR_changed;
    public boolean MSR_changed;
    public boolean MFR_changed;
    public boolean Carry_changed;
    
    public FrontPanel() {
        
        //Instantiate variables
        //Set flags
        initComponents();
        setVisible(true);
        run = false;
        singleStep = false;
        IPL = false;
        setFile = false;
        userInput = false;
        GPR_changed = new boolean[4];
        XR_changed = new boolean[3];
        consoleOutput = "";
        resetChangedFlags();
        Printer = ConsolePrinterField;
        ConsoleInput = ConsoleInputField;
        GPR0 = new JTextField[]{
            jTextField1,
            jTextField2,
            jTextField3,
            jTextField4,
            jTextField5,
            jTextField6,
            jTextField7,
            jTextField8,
            jTextField9,
            jTextField10,
            jTextField11,
            jTextField12,
            jTextField13,
            jTextField14,
            jTextField15,
            jTextField16
        };
        GPR1 = new JTextField[]{
            R1T1,
            R1T2,
            R1T3,
            R1T4,
            R1T5,
            R1T6,
            R1T7,
            R1T8,
            R1T9,
            R1T10,
            R1T11,
            R1T12,
            R1T13,
            R1T14,
            R1T15,
            R1T16
        };
        GPR2 = new JTextField[]{
            R2T1,
            R2T2,
            R2T3,
            R2T4,
            R2T5,
            R2T6,
            R2T7,
            R2T8,
            R2T9,
            R2T10,
            R2T11,
            R2T12,
            R2T13,
            R2T14,
            R2T15,
            R2T16
        };
        GPR3 = new JTextField[]{
            R3T1,
            R3T2,
            R3T3,
            R3T4,
            R3T5,
            R3T6,
            R3T7,
            R3T8,
            R3T9,
            R3T10,
            R3T11,
            R3T12,
            R3T13,
            R3T14,
            R3T15,
            R3T16
        };
        GPRSwitch0 = new JCheckBox[]{
            jCheckBox1,
            jCheckBox2,
            jCheckBox3,
            jCheckBox4,
            jCheckBox5,
            jCheckBox6,
            jCheckBox7,
            jCheckBox8,
            jCheckBox9,
            jCheckBox10,
            jCheckBox11,
            jCheckBox12,
            jCheckBox13,
            jCheckBox14,
            jCheckBox15,
            jCheckBox16
        };
        GPRSwitch1 = new JCheckBox[]{
            R1C1,
            R1C2,
            R1C3,
            R1C4,
            R1C5,
            R1C6,
            R1C7,
            R1C8,
            R1C9,
            R1C10,
            R1C11,
            R1C12,
            R1C13,
            R1C14,
            R1C15,
            R1C16
        };
        GPRSwitch2 = new JCheckBox[]{
            R2C1,
            R2C2,
            R2C3,
            R2C4,
            R2C5,
            R2C6,
            R2C7,
            R2C8,
            R2C9,
            R2C10,
            R2C11,
            R2C12,
            R2C13,
            R2C14,
            R2C15,
            R2C16
        };
        GPRSwitch3 = new JCheckBox[]{
            R3C1,
            R3C2,
            R3C3,
            R3C4,
            R3C5,
            R3C6,
            R3C7,
            R3C8,
            R3C9,
            R3C10,
            R3C11,
            R3C12,
            R3C13,
            R3C14,
            R3C15,
            R3C16
        };

        X1 = new JTextField[]{
            jTextField65,
            jTextField66,
            jTextField67,
            jTextField68,
            jTextField69,
            jTextField70,
            jTextField71,
            jTextField72,
            jTextField73,
            jTextField74,
            jTextField75,
            jTextField76,
            jTextField186,
            jTextField187,
            jTextField188,
            jTextField189
        };
        X2 = new JTextField[]{
            jTextField77,
            jTextField78,
            jTextField79,
            jTextField80,
            jTextField81,
            jTextField82,
            jTextField83,
            jTextField84,
            jTextField85,
            jTextField86,
            jTextField87,
            jTextField88,
            jTextField190,
            jTextField191,
            jTextField192,
            jTextField193
        };
        X3 = new JTextField[]{
            jTextField89,
            jTextField90,
            jTextField91,
            jTextField92,
            jTextField93,
            jTextField94,
            jTextField95,
            jTextField96,
            jTextField97,
            jTextField98,
            jTextField99,
            jTextField100,
            jTextField194,
            jTextField195,
            jTextField196,
            jTextField197
        };
        XSwitch1 = new JCheckBox[]{
            jCheckBox65,
            jCheckBox66,
            jCheckBox67,
            jCheckBox68,
            jCheckBox69,
            jCheckBox70,
            jCheckBox71,
            jCheckBox72,
            jCheckBox73,
            jCheckBox74,
            jCheckBox75,
            jCheckBox76,
            jCheckBox186,
            jCheckBox187,
            jCheckBox188,
            jCheckBox189
        };
        XSwitch2 = new JCheckBox[]{
            jCheckBox77,
            jCheckBox78,
            jCheckBox79,
            jCheckBox80,
            jCheckBox81,
            jCheckBox82,
            jCheckBox83,
            jCheckBox84,
            jCheckBox85,
            jCheckBox86,
            jCheckBox87,
            jCheckBox88,
            jCheckBox190,
            jCheckBox191,
            jCheckBox192,
            jCheckBox193
        };
        XSwitch3 = new JCheckBox[]{
            jCheckBox89,
            jCheckBox90,
            jCheckBox91,
            jCheckBox92,
            jCheckBox93,
            jCheckBox94,
            jCheckBox95,
            jCheckBox96,
            jCheckBox97,
            jCheckBox98,
            jCheckBox99,
            jCheckBox100,
            jCheckBox194,
            jCheckBox195,
            jCheckBox196,
            jCheckBox197
        };

        PC = new JTextField[]{
            jTextField101,
            jTextField102,
            jTextField103,
            jTextField104,
            jTextField105,
            jTextField106,
            jTextField107,
            jTextField108,
            jTextField109,
            jTextField110,
            jTextField111,
            jTextField112
        };

        PCSwitch = new JCheckBox[]{
            jCheckBox101,
            jCheckBox102,
            jCheckBox103,
            jCheckBox104,
            jCheckBox105,
            jCheckBox106,
            jCheckBox107,
            jCheckBox108,
            jCheckBox109,
            jCheckBox110,
            jCheckBox111,
            jCheckBox112
        };

        IR = new JTextField[]{
            jTextField113,
            jTextField114,
            jTextField115,
            jTextField116,
            jTextField117,
            jTextField118,
            jTextField119,
            jTextField120,
            jTextField121,
            jTextField122,
            jTextField123,
            jTextField124,
            jTextField125,
            jTextField126,
            jTextField127,
            jTextField128
        };

        IRSwitch = new JCheckBox[]{
            jCheckBox113,
            jCheckBox114,
            jCheckBox115,
            jCheckBox116,
            jCheckBox117,
            jCheckBox118,
            jCheckBox119,
            jCheckBox120,
            jCheckBox121,
            jCheckBox122,
            jCheckBox123,
            jCheckBox124,
            jCheckBox125,
            jCheckBox126,
            jCheckBox127,
            jCheckBox128
        };

        MAR = new JTextField[]{
            jTextField129,
            jTextField130,
            jTextField131,
            jTextField132,
            jTextField133,
            jTextField134,
            jTextField135,
            jTextField136,
            jTextField137,
            jTextField138,
            jTextField139,
            jTextField140,
            jTextField141,
            jTextField142,
            jTextField143,
            jTextField144
        };

        MARSwitch = new JCheckBox[]{
            jCheckBox129,
            jCheckBox130,
            jCheckBox131,
            jCheckBox132,
            jCheckBox133,
            jCheckBox134,
            jCheckBox135,
            jCheckBox136,
            jCheckBox137,
            jCheckBox138,
            jCheckBox139,
            jCheckBox140,
            jCheckBox141,
            jCheckBox142,
            jCheckBox143,
            jCheckBox144
        };
        MBR = new JTextField[]{
            jTextField145,
            jTextField146,
            jTextField147,
            jTextField148,
            jTextField149,
            jTextField150,
            jTextField151,
            jTextField152,
            jTextField153,
            jTextField154,
            jTextField155,
            jTextField156,
            jTextField157,
            jTextField158,
            jTextField159,
            jTextField160,};

        MBRSwitch = new JCheckBox[]{
            jCheckBox145,
            jCheckBox146,
            jCheckBox147,
            jCheckBox148,
            jCheckBox149,
            jCheckBox150,
            jCheckBox151,
            jCheckBox152,
            jCheckBox153,
            jCheckBox154,
            jCheckBox155,
            jCheckBox156,
            jCheckBox157,
            jCheckBox158,
            jCheckBox159,
            jCheckBox160,};
        MSR = new JTextField[]{
            jTextField161,
            jTextField162,
            jTextField163,
            jTextField164,
            jTextField165,
            jTextField166,
            jTextField167,
            jTextField168,
            jTextField169,
            jTextField170,
            jTextField171,
            jTextField172,
            jTextField173,
            jTextField174,
            jTextField175,
            jTextField176
        };

        MSRSwitch = new JCheckBox[]{
            jCheckBox161,
            jCheckBox162,
            jCheckBox163,
            jCheckBox164,
            jCheckBox165,
            jCheckBox166,
            jCheckBox167,
            jCheckBox168,
            jCheckBox169,
            jCheckBox170,
            jCheckBox171,
            jCheckBox172,
            jCheckBox173,
            jCheckBox174,
            jCheckBox175,
            jCheckBox176
        };
        MFR = new JTextField[]{
            jTextField177,
            jTextField178,
            jTextField179,
            jTextField180
        };

        MFRSwitch = new JCheckBox[]{
            jCheckBox177,
            jCheckBox178,
            jCheckBox179,
            jCheckBox180
        };

        CC = new JTextField[]{
            jTextField181,
            jTextField182,
            jTextField183,
            jTextField184
        };

        CCSwitch = new JCheckBox[]{
            jCheckBox181,
            jCheckBox182,
            jCheckBox183,
            jCheckBox184
        };
    }

    // setter for printer
    public void updatePrinter(String character) {
        consoleOutput += character;
        Printer.setText(consoleOutput);
    }

    // getter for console input text box
    public String getConsoleInput() {
        return userText;
    }
    
    // reset flags to false
    public void resetChangedFlags() {
        for (int i = 0; i < GPR_changed.length; i++) {
            GPR_changed[i] = false;
        }
        for (int i = 0; i < XR_changed.length; i++) {
            XR_changed[i] = false;
        }
        
        PC_changed = false;
        CC_changed = false;
        IR_changed = false;
        MAR_changed = false;
        MBR_changed = false;
        MSR_changed = false;
        MFR_changed = false;
        Carry_changed = false;
        setFile = false;
        changed = false;
        userInput = false;

    }

    public void clearPrinterAndKeyboard() {
        userText = "";
        consoleOutput = "";
        ConsoleInputField.setText(userText);
        ConsolePrinterField.setText(consoleOutput);
    }
    // getter for GPR register (returns integer value as computed by 
    // bit positions
    public int getGPRegister(int rNum) {
        String stringVal = "";
        int value = 0;
        for (int i = 0; i < 16; i++) {
            if (rNum == 0) {
                stringVal += GPR0[i].getText();
            }
            if (rNum == 1) {
                stringVal += GPR1[i].getText();
            }
            if (rNum == 2) {
                stringVal += GPR2[i].getText();
            }
            if (rNum == 3) {
                stringVal += GPR3[i].getText();
            }
        }
        value = DataTypeConvertor.stringToInt(stringVal);
        return value;
    }

    // setter method for GPR. replaces text boxes with binary values as computed 
    // using intToString. GPR is selected according to value in rNum. 
    public void updateGPRegister(int rNum, int value) {

        String valueString = DataTypeConvertor.intToString(value, 16);
        for (int i = 0; i < 16; i++) {

            if (rNum == 0) {
                if (!GPR0[i].getText().equals(valueString.substring(i, i + 1))) {
                    GPRSwitch0[i].doClick();
                }
            }
            if (rNum == 1) {
                if (!GPR1[i].getText().equals(valueString.substring(i, i + 1))) {
                    GPRSwitch1[i].doClick();
                }
            }
            if (rNum == 2) {
                if (!GPR2[i].getText().equals(valueString.substring(i, i + 1))) {
                    GPRSwitch2[i].doClick();
                }
            }
            if (rNum == 3) {
                if (!GPR3[i].getText().equals(valueString.substring(i, i + 1))) {
                    GPRSwitch3[i].doClick();
                }
            }
        }
    }

    // getter method. converts binary text values into integer before returning
    public int getXRegister(int xNum) {
        String stringVal = "";
        int value = 0;
        for (int i = 0; i < 16; i++) {
            if (xNum == 0) {
                stringVal += X1[i].getText();
            }
            if (xNum == 1) {
                stringVal += X2[i].getText();
            }
            if (xNum == 2) {
                stringVal += X3[i].getText();
            }
        }
        value = DataTypeConvertor.stringToInt(stringVal);
        return value;
    }

    // setter method. replaces text fields of a register with the integer value 
    // converted to a text string
    public void updateXRegister(int xNum, int value) {

        String valueString = DataTypeConvertor.intToString(value, 16);
        for (int i = 0; i < 16; i++) {
            if (xNum == 1) {
                if (!X1[i].getText().equals(valueString.substring(i, i + 1))) {
                    XSwitch1[i].doClick();
                }
            }
            if (xNum == 2) {
                if (!X2[i].getText().equals(valueString.substring(i, i + 1))) {
                    XSwitch2[i].doClick();
                }
            }
            if (xNum == 3) {
                if (!X3[i].getText().equals(valueString.substring(i, i + 1))) {
                    XSwitch3[i].doClick();
                }
            }
        }
    }

    public int getIRRegister() {
        String stringVal = "";
        int value = 0;
        for (int i = 0; i < 16; i++) {
            stringVal += IR[i].getText();
        }
        value = DataTypeConvertor.stringToInt(stringVal);
        return value;
    }

    public void updateIRRegister(int value) {
        String valueString = DataTypeConvertor.intToString(value, 16);
        for (int i = 0; i < 16; i++) {
            if (!IR[i].getText().equals(valueString.substring(i, i + 1))) {
                IRSwitch[i].doClick();
            }
        }
    }

    public int getMARRegister() {
        String stringVal = "";
        int value = 0;
        for (int i = 0; i < 16; i++) {
            stringVal += MAR[i].getText();
        }
        value = DataTypeConvertor.stringToInt(stringVal);
        return value;
    }

    public void updateMARRegister(int value) {
        String valueString = DataTypeConvertor.intToString(value, 16);
        for (int i = 0; i < 16; i++) {
            if (!MAR[i].getText().equals(valueString.substring(i, i + 1))) {
                MARSwitch[i].doClick();
            }
        }
    }

    public int getMBRRegister() {
        String stringVal = "";
        int value = 0;
        for (int i = 0; i < 16; i++) {
            stringVal += MBR[i].getText();
        }
        value = DataTypeConvertor.stringToInt(stringVal);
        return value;
    }

    public void updateMBRRegister(int value) {

        String valueString = DataTypeConvertor.intToString(value, 16);
        for (int i = 0; i < 16; i++) {
            if (!MBR[i].getText().equals(valueString.substring(i, i + 1))) {
                MBRSwitch[i].doClick();
            }
        }
    }

    public int getMSRRegister() {
        String stringVal = "";
        int value = 0;
        for (int i = 0; i < 16; i++) {
            stringVal += MSR[i].getText();
        }
        value = DataTypeConvertor.stringToInt(stringVal);
        return value;
    }

    public void updateMSRRegister(int value) {
        String valueString = DataTypeConvertor.intToString(value, 16);
        for (int i = 0; i < 16; i++) {
            if (!MSR[i].getText().equals(valueString.substring(i, i + 1))) {
                MSRSwitch[i].doClick();
            }
        }
    }

    public int getPCRegister() {
        String stringVal = "";
        int value = 0;
        for (int i = 0; i < 12; i++) {
            stringVal += PC[i].getText();
        }
        value = DataTypeConvertor.stringToInt(stringVal);
        return value;
    }

    public void updatePCRegister(int value) {
        String valueString = DataTypeConvertor.intToString(value, 12);
        for (int i = 0; i < 12; i++) {
            if (!PC[i].getText().equals(valueString.substring(i, i + 1))) {
                PCSwitch[i].doClick();
            }
        }
    }

    public int getMFRRegister() {
        String stringVal = "";
        int value = 0;
        for (int i = 0; i < 4; i++) {
            stringVal += MFR[i].getText();
        }
        value = DataTypeConvertor.stringToInt(stringVal);
        return value;
    }

    public void updateMFRRegister(int value) {
        String valueString = DataTypeConvertor.intToString(value, 4);
        for (int i = 0; i < 4; i++) {
            if (!MFR[i].getText().equals(valueString.substring(i, i + 1))) {
                MFRSwitch[i].doClick();
            }
        }
    }
    
        public int getCarry() {
        String stringVal = "";
        int value = 0;
        for (int i = 0; i < 1; i++) {
            stringVal += CarryT1.getText();
        }
        value = DataTypeConvertor.stringToInt(stringVal);
        return value;
    }

    public void updateCarry(int value) {
        String valueString = DataTypeConvertor.intToString(value, 1);
        for (int i = 0; i < 1; i++) {
            if (!CarryT1.getText().equals(valueString.substring(i, i + 1))) {
                CarryC1.doClick();
            }
        }
    }

    public int getCCRegister() {
        String stringVal = "";
        int value = 0;
        for (int i = 0; i < 4; i++) {
            stringVal += CC[i].getText();
        }
        value = DataTypeConvertor.stringToInt(stringVal);
        return value;
    }

    public void updateCCRegister(int value) {
        String valueString = DataTypeConvertor.intToString(value, 4);
        for (int i = 0; i < 4; i++) {
            if (!CC[i].getText().equals(valueString.substring(i, i + 1))) {
                CCSwitch[i].doClick();
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jTextField8 = new javax.swing.JTextField();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        jCheckBox12 = new javax.swing.JCheckBox();
        jCheckBox13 = new javax.swing.JCheckBox();
        jCheckBox14 = new javax.swing.JCheckBox();
        jCheckBox15 = new javax.swing.JCheckBox();
        jTextField9 = new javax.swing.JTextField();
        jCheckBox16 = new javax.swing.JCheckBox();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        R1C1 = new javax.swing.JCheckBox();
        R1C2 = new javax.swing.JCheckBox();
        R1C3 = new javax.swing.JCheckBox();
        R1C4 = new javax.swing.JCheckBox();
        R1C5 = new javax.swing.JCheckBox();
        R1C6 = new javax.swing.JCheckBox();
        R1C7 = new javax.swing.JCheckBox();
        R1C13 = new javax.swing.JCheckBox();
        R1C12 = new javax.swing.JCheckBox();
        R1C11 = new javax.swing.JCheckBox();
        R1C10 = new javax.swing.JCheckBox();
        R1C9 = new javax.swing.JCheckBox();
        R1T8 = new javax.swing.JTextField();
        R1C8 = new javax.swing.JCheckBox();
        R1T15 = new javax.swing.JTextField();
        R1T14 = new javax.swing.JTextField();
        R1T13 = new javax.swing.JTextField();
        R1T12 = new javax.swing.JTextField();
        R1T11 = new javax.swing.JTextField();
        R1T10 = new javax.swing.JTextField();
        R1T9 = new javax.swing.JTextField();
        R1C16 = new javax.swing.JCheckBox();
        R1T16 = new javax.swing.JTextField();
        R1C15 = new javax.swing.JCheckBox();
        R1C14 = new javax.swing.JCheckBox();
        R1T1 = new javax.swing.JTextField();
        R1T2 = new javax.swing.JTextField();
        R1T3 = new javax.swing.JTextField();
        R1T4 = new javax.swing.JTextField();
        R1T5 = new javax.swing.JTextField();
        R1T6 = new javax.swing.JTextField();
        R1T7 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        R2C10 = new javax.swing.JCheckBox();
        R2C11 = new javax.swing.JCheckBox();
        R2C12 = new javax.swing.JCheckBox();
        R2C13 = new javax.swing.JCheckBox();
        R2C7 = new javax.swing.JCheckBox();
        R2C6 = new javax.swing.JCheckBox();
        R2C5 = new javax.swing.JCheckBox();
        R2C4 = new javax.swing.JCheckBox();
        R2C3 = new javax.swing.JCheckBox();
        R2C2 = new javax.swing.JCheckBox();
        R2C1 = new javax.swing.JCheckBox();
        R2C16 = new javax.swing.JCheckBox();
        R2T9 = new javax.swing.JTextField();
        R2T10 = new javax.swing.JTextField();
        R2T11 = new javax.swing.JTextField();
        R2T12 = new javax.swing.JTextField();
        R2T13 = new javax.swing.JTextField();
        R2T14 = new javax.swing.JTextField();
        R2T15 = new javax.swing.JTextField();
        R2C8 = new javax.swing.JCheckBox();
        R2T8 = new javax.swing.JTextField();
        R2C9 = new javax.swing.JCheckBox();
        R2C14 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        R2T7 = new javax.swing.JTextField();
        R2T6 = new javax.swing.JTextField();
        R2T5 = new javax.swing.JTextField();
        R2T4 = new javax.swing.JTextField();
        R2T3 = new javax.swing.JTextField();
        R2T2 = new javax.swing.JTextField();
        R2T1 = new javax.swing.JTextField();
        R2C15 = new javax.swing.JCheckBox();
        R2T16 = new javax.swing.JTextField();
        R3T9 = new javax.swing.JTextField();
        R3T10 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        R3T14 = new javax.swing.JTextField();
        R3T7 = new javax.swing.JTextField();
        R3C16 = new javax.swing.JCheckBox();
        R3T13 = new javax.swing.JTextField();
        R3C15 = new javax.swing.JCheckBox();
        R3T3 = new javax.swing.JTextField();
        R3T11 = new javax.swing.JTextField();
        R3C1 = new javax.swing.JCheckBox();
        R3C9 = new javax.swing.JCheckBox();
        R3C12 = new javax.swing.JCheckBox();
        R3C13 = new javax.swing.JCheckBox();
        R3C14 = new javax.swing.JCheckBox();
        R3T12 = new javax.swing.JTextField();
        R3T6 = new javax.swing.JTextField();
        R3T5 = new javax.swing.JTextField();
        R3C4 = new javax.swing.JCheckBox();
        R3C10 = new javax.swing.JCheckBox();
        R3C7 = new javax.swing.JCheckBox();
        R3C2 = new javax.swing.JCheckBox();
        R3T15 = new javax.swing.JTextField();
        R3C5 = new javax.swing.JCheckBox();
        R3C8 = new javax.swing.JCheckBox();
        R3T8 = new javax.swing.JTextField();
        R3T2 = new javax.swing.JTextField();
        R3C6 = new javax.swing.JCheckBox();
        R3T16 = new javax.swing.JTextField();
        R3C3 = new javax.swing.JCheckBox();
        R3T1 = new javax.swing.JTextField();
        R3T4 = new javax.swing.JTextField();
        R3C11 = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jCheckBox65 = new javax.swing.JCheckBox();
        jTextField65 = new javax.swing.JTextField();
        jCheckBox66 = new javax.swing.JCheckBox();
        jTextField66 = new javax.swing.JTextField();
        jCheckBox67 = new javax.swing.JCheckBox();
        jTextField67 = new javax.swing.JTextField();
        jCheckBox68 = new javax.swing.JCheckBox();
        jTextField68 = new javax.swing.JTextField();
        jCheckBox69 = new javax.swing.JCheckBox();
        jTextField69 = new javax.swing.JTextField();
        jCheckBox70 = new javax.swing.JCheckBox();
        jTextField70 = new javax.swing.JTextField();
        jCheckBox71 = new javax.swing.JCheckBox();
        jTextField71 = new javax.swing.JTextField();
        jCheckBox72 = new javax.swing.JCheckBox();
        jTextField72 = new javax.swing.JTextField();
        jCheckBox73 = new javax.swing.JCheckBox();
        jTextField73 = new javax.swing.JTextField();
        jCheckBox74 = new javax.swing.JCheckBox();
        jTextField74 = new javax.swing.JTextField();
        jCheckBox75 = new javax.swing.JCheckBox();
        jTextField75 = new javax.swing.JTextField();
        jCheckBox76 = new javax.swing.JCheckBox();
        jTextField76 = new javax.swing.JTextField();
        jCheckBox77 = new javax.swing.JCheckBox();
        jTextField77 = new javax.swing.JTextField();
        jCheckBox78 = new javax.swing.JCheckBox();
        jTextField78 = new javax.swing.JTextField();
        jCheckBox79 = new javax.swing.JCheckBox();
        jTextField79 = new javax.swing.JTextField();
        jCheckBox80 = new javax.swing.JCheckBox();
        jTextField80 = new javax.swing.JTextField();
        jCheckBox81 = new javax.swing.JCheckBox();
        jTextField81 = new javax.swing.JTextField();
        jCheckBox82 = new javax.swing.JCheckBox();
        jTextField82 = new javax.swing.JTextField();
        jCheckBox83 = new javax.swing.JCheckBox();
        jTextField83 = new javax.swing.JTextField();
        jCheckBox84 = new javax.swing.JCheckBox();
        jTextField84 = new javax.swing.JTextField();
        jCheckBox85 = new javax.swing.JCheckBox();
        jTextField85 = new javax.swing.JTextField();
        jCheckBox86 = new javax.swing.JCheckBox();
        jTextField86 = new javax.swing.JTextField();
        jCheckBox87 = new javax.swing.JCheckBox();
        jTextField87 = new javax.swing.JTextField();
        jCheckBox88 = new javax.swing.JCheckBox();
        jTextField88 = new javax.swing.JTextField();
        jCheckBox89 = new javax.swing.JCheckBox();
        jTextField89 = new javax.swing.JTextField();
        jCheckBox90 = new javax.swing.JCheckBox();
        jTextField90 = new javax.swing.JTextField();
        jCheckBox91 = new javax.swing.JCheckBox();
        jTextField91 = new javax.swing.JTextField();
        jCheckBox92 = new javax.swing.JCheckBox();
        jTextField92 = new javax.swing.JTextField();
        jCheckBox93 = new javax.swing.JCheckBox();
        jTextField93 = new javax.swing.JTextField();
        jCheckBox94 = new javax.swing.JCheckBox();
        jTextField94 = new javax.swing.JTextField();
        jCheckBox95 = new javax.swing.JCheckBox();
        jTextField95 = new javax.swing.JTextField();
        jCheckBox96 = new javax.swing.JCheckBox();
        jTextField96 = new javax.swing.JTextField();
        jCheckBox97 = new javax.swing.JCheckBox();
        jTextField97 = new javax.swing.JTextField();
        jCheckBox98 = new javax.swing.JCheckBox();
        jTextField98 = new javax.swing.JTextField();
        jCheckBox99 = new javax.swing.JCheckBox();
        jTextField99 = new javax.swing.JTextField();
        jCheckBox100 = new javax.swing.JCheckBox();
        jTextField100 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jCheckBox101 = new javax.swing.JCheckBox();
        jTextField101 = new javax.swing.JTextField();
        jCheckBox102 = new javax.swing.JCheckBox();
        jTextField102 = new javax.swing.JTextField();
        jCheckBox103 = new javax.swing.JCheckBox();
        jTextField103 = new javax.swing.JTextField();
        jCheckBox104 = new javax.swing.JCheckBox();
        jTextField104 = new javax.swing.JTextField();
        jCheckBox105 = new javax.swing.JCheckBox();
        jTextField105 = new javax.swing.JTextField();
        jCheckBox106 = new javax.swing.JCheckBox();
        jTextField106 = new javax.swing.JTextField();
        jCheckBox107 = new javax.swing.JCheckBox();
        jTextField107 = new javax.swing.JTextField();
        jCheckBox108 = new javax.swing.JCheckBox();
        jTextField108 = new javax.swing.JTextField();
        jCheckBox109 = new javax.swing.JCheckBox();
        jTextField109 = new javax.swing.JTextField();
        jCheckBox110 = new javax.swing.JCheckBox();
        jTextField110 = new javax.swing.JTextField();
        jCheckBox111 = new javax.swing.JCheckBox();
        jTextField111 = new javax.swing.JTextField();
        jCheckBox112 = new javax.swing.JCheckBox();
        jTextField112 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jCheckBox113 = new javax.swing.JCheckBox();
        jTextField113 = new javax.swing.JTextField();
        jCheckBox114 = new javax.swing.JCheckBox();
        jTextField114 = new javax.swing.JTextField();
        jCheckBox115 = new javax.swing.JCheckBox();
        jTextField115 = new javax.swing.JTextField();
        jCheckBox116 = new javax.swing.JCheckBox();
        jTextField116 = new javax.swing.JTextField();
        jCheckBox117 = new javax.swing.JCheckBox();
        jTextField117 = new javax.swing.JTextField();
        jCheckBox118 = new javax.swing.JCheckBox();
        jTextField118 = new javax.swing.JTextField();
        jCheckBox119 = new javax.swing.JCheckBox();
        jTextField119 = new javax.swing.JTextField();
        jCheckBox120 = new javax.swing.JCheckBox();
        jTextField120 = new javax.swing.JTextField();
        jCheckBox121 = new javax.swing.JCheckBox();
        jTextField121 = new javax.swing.JTextField();
        jCheckBox122 = new javax.swing.JCheckBox();
        jTextField122 = new javax.swing.JTextField();
        jCheckBox123 = new javax.swing.JCheckBox();
        jTextField123 = new javax.swing.JTextField();
        jCheckBox124 = new javax.swing.JCheckBox();
        jTextField124 = new javax.swing.JTextField();
        jCheckBox125 = new javax.swing.JCheckBox();
        jTextField125 = new javax.swing.JTextField();
        jCheckBox126 = new javax.swing.JCheckBox();
        jTextField126 = new javax.swing.JTextField();
        jCheckBox127 = new javax.swing.JCheckBox();
        jTextField127 = new javax.swing.JTextField();
        jCheckBox128 = new javax.swing.JCheckBox();
        jTextField128 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jCheckBox129 = new javax.swing.JCheckBox();
        jTextField129 = new javax.swing.JTextField();
        jCheckBox130 = new javax.swing.JCheckBox();
        jTextField130 = new javax.swing.JTextField();
        jCheckBox131 = new javax.swing.JCheckBox();
        jTextField131 = new javax.swing.JTextField();
        jCheckBox132 = new javax.swing.JCheckBox();
        jTextField132 = new javax.swing.JTextField();
        jCheckBox133 = new javax.swing.JCheckBox();
        jTextField133 = new javax.swing.JTextField();
        jCheckBox134 = new javax.swing.JCheckBox();
        jTextField134 = new javax.swing.JTextField();
        jCheckBox135 = new javax.swing.JCheckBox();
        jTextField135 = new javax.swing.JTextField();
        jCheckBox136 = new javax.swing.JCheckBox();
        jTextField136 = new javax.swing.JTextField();
        jCheckBox137 = new javax.swing.JCheckBox();
        jTextField137 = new javax.swing.JTextField();
        jCheckBox138 = new javax.swing.JCheckBox();
        jTextField138 = new javax.swing.JTextField();
        jCheckBox139 = new javax.swing.JCheckBox();
        jTextField139 = new javax.swing.JTextField();
        jCheckBox140 = new javax.swing.JCheckBox();
        jTextField140 = new javax.swing.JTextField();
        jCheckBox141 = new javax.swing.JCheckBox();
        jTextField141 = new javax.swing.JTextField();
        jCheckBox142 = new javax.swing.JCheckBox();
        jTextField142 = new javax.swing.JTextField();
        jCheckBox143 = new javax.swing.JCheckBox();
        jTextField143 = new javax.swing.JTextField();
        jCheckBox144 = new javax.swing.JCheckBox();
        jTextField144 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jCheckBox145 = new javax.swing.JCheckBox();
        jTextField145 = new javax.swing.JTextField();
        jCheckBox146 = new javax.swing.JCheckBox();
        jTextField146 = new javax.swing.JTextField();
        jCheckBox147 = new javax.swing.JCheckBox();
        jTextField147 = new javax.swing.JTextField();
        jCheckBox148 = new javax.swing.JCheckBox();
        jTextField148 = new javax.swing.JTextField();
        jCheckBox149 = new javax.swing.JCheckBox();
        jTextField149 = new javax.swing.JTextField();
        jCheckBox150 = new javax.swing.JCheckBox();
        jTextField150 = new javax.swing.JTextField();
        jCheckBox151 = new javax.swing.JCheckBox();
        jTextField151 = new javax.swing.JTextField();
        jCheckBox152 = new javax.swing.JCheckBox();
        jTextField152 = new javax.swing.JTextField();
        jCheckBox153 = new javax.swing.JCheckBox();
        jTextField153 = new javax.swing.JTextField();
        jCheckBox154 = new javax.swing.JCheckBox();
        jTextField154 = new javax.swing.JTextField();
        jCheckBox155 = new javax.swing.JCheckBox();
        jTextField155 = new javax.swing.JTextField();
        jCheckBox156 = new javax.swing.JCheckBox();
        jTextField156 = new javax.swing.JTextField();
        jCheckBox157 = new javax.swing.JCheckBox();
        jTextField157 = new javax.swing.JTextField();
        jCheckBox158 = new javax.swing.JCheckBox();
        jTextField158 = new javax.swing.JTextField();
        jCheckBox159 = new javax.swing.JCheckBox();
        jTextField159 = new javax.swing.JTextField();
        jCheckBox160 = new javax.swing.JCheckBox();
        jTextField160 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jCheckBox161 = new javax.swing.JCheckBox();
        jTextField161 = new javax.swing.JTextField();
        jCheckBox162 = new javax.swing.JCheckBox();
        jTextField162 = new javax.swing.JTextField();
        jCheckBox163 = new javax.swing.JCheckBox();
        jTextField163 = new javax.swing.JTextField();
        jCheckBox164 = new javax.swing.JCheckBox();
        jTextField164 = new javax.swing.JTextField();
        jCheckBox165 = new javax.swing.JCheckBox();
        jTextField165 = new javax.swing.JTextField();
        jCheckBox166 = new javax.swing.JCheckBox();
        jTextField166 = new javax.swing.JTextField();
        jCheckBox167 = new javax.swing.JCheckBox();
        jTextField167 = new javax.swing.JTextField();
        jCheckBox168 = new javax.swing.JCheckBox();
        jTextField168 = new javax.swing.JTextField();
        jCheckBox169 = new javax.swing.JCheckBox();
        jTextField169 = new javax.swing.JTextField();
        jCheckBox170 = new javax.swing.JCheckBox();
        jTextField170 = new javax.swing.JTextField();
        jCheckBox171 = new javax.swing.JCheckBox();
        jTextField171 = new javax.swing.JTextField();
        jCheckBox172 = new javax.swing.JCheckBox();
        jTextField172 = new javax.swing.JTextField();
        jCheckBox173 = new javax.swing.JCheckBox();
        jTextField173 = new javax.swing.JTextField();
        jCheckBox174 = new javax.swing.JCheckBox();
        jTextField174 = new javax.swing.JTextField();
        jCheckBox175 = new javax.swing.JCheckBox();
        jTextField175 = new javax.swing.JTextField();
        jCheckBox176 = new javax.swing.JCheckBox();
        jTextField176 = new javax.swing.JTextField();
        jCheckBox177 = new javax.swing.JCheckBox();
        jTextField177 = new javax.swing.JTextField();
        jCheckBox178 = new javax.swing.JCheckBox();
        jTextField178 = new javax.swing.JTextField();
        jCheckBox179 = new javax.swing.JCheckBox();
        jTextField179 = new javax.swing.JTextField();
        jCheckBox180 = new javax.swing.JCheckBox();
        jTextField180 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jCheckBox181 = new javax.swing.JCheckBox();
        jTextField181 = new javax.swing.JTextField();
        jCheckBox182 = new javax.swing.JCheckBox();
        jTextField182 = new javax.swing.JTextField();
        jCheckBox183 = new javax.swing.JCheckBox();
        jTextField183 = new javax.swing.JTextField();
        jCheckBox184 = new javax.swing.JCheckBox();
        jTextField184 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ConsolePrinterField = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField186 = new javax.swing.JTextField();
        jCheckBox186 = new javax.swing.JCheckBox();
        jTextField187 = new javax.swing.JTextField();
        jCheckBox187 = new javax.swing.JCheckBox();
        jTextField188 = new javax.swing.JTextField();
        jCheckBox188 = new javax.swing.JCheckBox();
        jTextField189 = new javax.swing.JTextField();
        jCheckBox189 = new javax.swing.JCheckBox();
        jTextField190 = new javax.swing.JTextField();
        jCheckBox190 = new javax.swing.JCheckBox();
        jTextField191 = new javax.swing.JTextField();
        jCheckBox191 = new javax.swing.JCheckBox();
        jTextField192 = new javax.swing.JTextField();
        jCheckBox192 = new javax.swing.JCheckBox();
        jTextField193 = new javax.swing.JTextField();
        jCheckBox193 = new javax.swing.JCheckBox();
        jTextField194 = new javax.swing.JTextField();
        jCheckBox194 = new javax.swing.JCheckBox();
        jTextField195 = new javax.swing.JTextField();
        jCheckBox195 = new javax.swing.JCheckBox();
        jTextField196 = new javax.swing.JTextField();
        jCheckBox196 = new javax.swing.JCheckBox();
        jTextField197 = new javax.swing.JTextField();
        jCheckBox197 = new javax.swing.JCheckBox();
        ConsoleInputField = new javax.swing.JTextField();
        runButton = new javax.swing.JButton();
        haltButton = new javax.swing.JButton();
        iplButton = new javax.swing.JButton();
        singlestepButton = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        CarryC1 = new javax.swing.JCheckBox();
        CarryT1 = new javax.swing.JTextField();
        SelectFileButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setColumns(1);
        jTextField1.setText("0");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setColumns(1);
        jTextField2.setText("0");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.setColumns(1);
        jTextField3.setText("0");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField4.setColumns(1);
        jTextField4.setText("0");
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jTextField5.setColumns(1);
        jTextField5.setText("0");
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jTextField6.setColumns(1);
        jTextField6.setText("0");
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jTextField7.setColumns(1);
        jTextField7.setText("0");
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jLabel1.setText("R0");

        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });

        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });

        jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox7ActionPerformed(evt);
            }
        });

        jCheckBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox8ActionPerformed(evt);
            }
        });

        jTextField8.setColumns(1);
        jTextField8.setText("0");
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        jCheckBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox9ActionPerformed(evt);
            }
        });

        jCheckBox10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox10ActionPerformed(evt);
            }
        });

        jCheckBox11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox11ActionPerformed(evt);
            }
        });

        jCheckBox12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox12ActionPerformed(evt);
            }
        });

        jCheckBox13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox13ActionPerformed(evt);
            }
        });

        jCheckBox14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox14ActionPerformed(evt);
            }
        });

        jCheckBox15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox15ActionPerformed(evt);
            }
        });

        jTextField9.setColumns(1);
        jTextField9.setText("0");
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        jCheckBox16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox16ActionPerformed(evt);
            }
        });

        jTextField10.setColumns(1);
        jTextField10.setText("0");
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });

        jTextField11.setColumns(1);
        jTextField11.setText("0");
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });

        jTextField12.setColumns(1);
        jTextField12.setText("0");
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });

        jTextField13.setColumns(1);
        jTextField13.setText("0");
        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });

        jTextField14.setColumns(1);
        jTextField14.setText("0");
        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });

        jTextField15.setColumns(1);
        jTextField15.setText("0");
        jTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15ActionPerformed(evt);
            }
        });

        jTextField16.setColumns(1);
        jTextField16.setText("0");
        jTextField16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField16ActionPerformed(evt);
            }
        });

        R1C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1C1ActionPerformed(evt);
            }
        });

        R1C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1C2ActionPerformed(evt);
            }
        });

        R1C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1C3ActionPerformed(evt);
            }
        });

        R1C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1C4ActionPerformed(evt);
            }
        });

        R1C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1C5ActionPerformed(evt);
            }
        });

        R1C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1C6ActionPerformed(evt);
            }
        });

        R1C7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1C7ActionPerformed(evt);
            }
        });

        R1C13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1C13ActionPerformed(evt);
            }
        });

        R1C12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1C12ActionPerformed(evt);
            }
        });

        R1C11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1C11ActionPerformed(evt);
            }
        });

        R1C10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1C10ActionPerformed(evt);
            }
        });

        R1C9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1C9ActionPerformed(evt);
            }
        });

        R1T8.setColumns(1);
        R1T8.setText("0");
        R1T8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1T8ActionPerformed(evt);
            }
        });

        R1C8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1C8ActionPerformed(evt);
            }
        });

        R1T15.setColumns(1);
        R1T15.setText("0");
        R1T15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1T15ActionPerformed(evt);
            }
        });

        R1T14.setColumns(1);
        R1T14.setText("0");
        R1T14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1T14ActionPerformed(evt);
            }
        });

        R1T13.setColumns(1);
        R1T13.setText("0");
        R1T13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1T13ActionPerformed(evt);
            }
        });

        R1T12.setColumns(1);
        R1T12.setText("0");
        R1T12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1T12ActionPerformed(evt);
            }
        });

        R1T11.setColumns(1);
        R1T11.setText("0");
        R1T11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1T11ActionPerformed(evt);
            }
        });

        R1T10.setColumns(1);
        R1T10.setText("0");
        R1T10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1T10ActionPerformed(evt);
            }
        });

        R1T9.setColumns(1);
        R1T9.setText("0");
        R1T9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1T9ActionPerformed(evt);
            }
        });

        R1C16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1C16ActionPerformed(evt);
            }
        });

        R1T16.setColumns(1);
        R1T16.setText("0");
        R1T16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1T16ActionPerformed(evt);
            }
        });

        R1C15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1C15ActionPerformed(evt);
            }
        });

        R1C14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1C14ActionPerformed(evt);
            }
        });

        R1T1.setColumns(1);
        R1T1.setText("0");
        R1T1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1T1ActionPerformed(evt);
            }
        });

        R1T2.setColumns(1);
        R1T2.setText("0");
        R1T2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1T2ActionPerformed(evt);
            }
        });

        R1T3.setColumns(1);
        R1T3.setText("0");
        R1T3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1T3ActionPerformed(evt);
            }
        });

        R1T4.setColumns(1);
        R1T4.setText("0");
        R1T4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1T4ActionPerformed(evt);
            }
        });

        R1T5.setColumns(1);
        R1T5.setText("0");
        R1T5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1T5ActionPerformed(evt);
            }
        });

        R1T6.setColumns(1);
        R1T6.setText("0");
        R1T6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1T6ActionPerformed(evt);
            }
        });

        R1T7.setColumns(1);
        R1T7.setText("0");
        R1T7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1T7ActionPerformed(evt);
            }
        });

        jLabel2.setText("R1");

        R2C10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2C10ActionPerformed(evt);
            }
        });

        R2C11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2C11ActionPerformed(evt);
            }
        });

        R2C12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2C12ActionPerformed(evt);
            }
        });

        R2C13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2C13ActionPerformed(evt);
            }
        });

        R2C7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2C7ActionPerformed(evt);
            }
        });

        R2C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2C6ActionPerformed(evt);
            }
        });

        R2C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2C5ActionPerformed(evt);
            }
        });

        R2C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2C4ActionPerformed(evt);
            }
        });

        R2C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2C3ActionPerformed(evt);
            }
        });

        R2C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2C2ActionPerformed(evt);
            }
        });

        R2C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2C1ActionPerformed(evt);
            }
        });

        R2C16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2C16ActionPerformed(evt);
            }
        });

        R2T9.setColumns(1);
        R2T9.setText("0");
        R2T9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2T9ActionPerformed(evt);
            }
        });

        R2T10.setColumns(1);
        R2T10.setText("0");
        R2T10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2T10ActionPerformed(evt);
            }
        });

        R2T11.setColumns(1);
        R2T11.setText("0");
        R2T11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2T11ActionPerformed(evt);
            }
        });

        R2T12.setColumns(1);
        R2T12.setText("0");
        R2T12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2T12ActionPerformed(evt);
            }
        });

        R2T13.setColumns(1);
        R2T13.setText("0");
        R2T13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2T13ActionPerformed(evt);
            }
        });

        R2T14.setColumns(1);
        R2T14.setText("0");
        R2T14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2T14ActionPerformed(evt);
            }
        });

        R2T15.setColumns(1);
        R2T15.setText("0");
        R2T15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2T15ActionPerformed(evt);
            }
        });

        R2C8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2C8ActionPerformed(evt);
            }
        });

        R2T8.setColumns(1);
        R2T8.setText("0");
        R2T8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2T8ActionPerformed(evt);
            }
        });

        R2C9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2C9ActionPerformed(evt);
            }
        });

        R2C14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2C14ActionPerformed(evt);
            }
        });

        jLabel3.setText("R2");

        R2T7.setColumns(1);
        R2T7.setText("0");
        R2T7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2T7ActionPerformed(evt);
            }
        });

        R2T6.setColumns(1);
        R2T6.setText("0");
        R2T6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2T6ActionPerformed(evt);
            }
        });

        R2T5.setColumns(1);
        R2T5.setText("0");
        R2T5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2T5ActionPerformed(evt);
            }
        });

        R2T4.setColumns(1);
        R2T4.setText("0");
        R2T4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2T4ActionPerformed(evt);
            }
        });

        R2T3.setColumns(1);
        R2T3.setText("0");
        R2T3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2T3ActionPerformed(evt);
            }
        });

        R2T2.setColumns(1);
        R2T2.setText("0");
        R2T2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2T2ActionPerformed(evt);
            }
        });

        R2T1.setColumns(1);
        R2T1.setText("0");
        R2T1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2T1ActionPerformed(evt);
            }
        });

        R2C15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2C15ActionPerformed(evt);
            }
        });

        R2T16.setColumns(1);
        R2T16.setText("0");
        R2T16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2T16ActionPerformed(evt);
            }
        });

        R3T9.setColumns(1);
        R3T9.setText("0");
        R3T9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3T9ActionPerformed(evt);
            }
        });

        R3T10.setColumns(1);
        R3T10.setText("0");
        R3T10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3T10ActionPerformed(evt);
            }
        });

        jLabel4.setText("R3");

        R3T14.setColumns(1);
        R3T14.setText("0");
        R3T14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3T14ActionPerformed(evt);
            }
        });

        R3T7.setColumns(1);
        R3T7.setText("0");
        R3T7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3T7ActionPerformed(evt);
            }
        });

        R3C16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3C16ActionPerformed(evt);
            }
        });

        R3T13.setColumns(1);
        R3T13.setText("0");
        R3T13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3T13ActionPerformed(evt);
            }
        });

        R3C15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3C15ActionPerformed(evt);
            }
        });

        R3T3.setColumns(1);
        R3T3.setText("0");
        R3T3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3T3ActionPerformed(evt);
            }
        });

        R3T11.setColumns(1);
        R3T11.setText("0");
        R3T11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3T11ActionPerformed(evt);
            }
        });

        R3C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3C1ActionPerformed(evt);
            }
        });

        R3C9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3C9ActionPerformed(evt);
            }
        });

        R3C12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3C12ActionPerformed(evt);
            }
        });

        R3C13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3C13ActionPerformed(evt);
            }
        });

        R3C14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3C14ActionPerformed(evt);
            }
        });

        R3T12.setColumns(1);
        R3T12.setText("0");
        R3T12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3T12ActionPerformed(evt);
            }
        });

        R3T6.setColumns(1);
        R3T6.setText("0");
        R3T6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3T6ActionPerformed(evt);
            }
        });

        R3T5.setColumns(1);
        R3T5.setText("0");
        R3T5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3T5ActionPerformed(evt);
            }
        });

        R3C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3C4ActionPerformed(evt);
            }
        });

        R3C10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3C10ActionPerformed(evt);
            }
        });

        R3C7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3C7ActionPerformed(evt);
            }
        });

        R3C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3C2ActionPerformed(evt);
            }
        });

        R3T15.setColumns(1);
        R3T15.setText("0");
        R3T15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3T15ActionPerformed(evt);
            }
        });

        R3C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3C5ActionPerformed(evt);
            }
        });

        R3C8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3C8ActionPerformed(evt);
            }
        });

        R3T8.setColumns(1);
        R3T8.setText("0");
        R3T8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3T8ActionPerformed(evt);
            }
        });

        R3T2.setColumns(1);
        R3T2.setText("0");
        R3T2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3T2ActionPerformed(evt);
            }
        });

        R3C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3C6ActionPerformed(evt);
            }
        });

        R3T16.setColumns(1);
        R3T16.setText("0");
        R3T16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3T16ActionPerformed(evt);
            }
        });

        R3C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3C3ActionPerformed(evt);
            }
        });

        R3T1.setColumns(1);
        R3T1.setText("0");
        R3T1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3T1ActionPerformed(evt);
            }
        });

        R3T4.setColumns(1);
        R3T4.setText("0");
        R3T4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3T4ActionPerformed(evt);
            }
        });

        R3C11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3C11ActionPerformed(evt);
            }
        });

        jLabel5.setText("X1");

        jLabel6.setText("X2");

        jLabel7.setText("X3");

        jCheckBox65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox65ActionPerformed(evt);
            }
        });

        jTextField65.setColumns(1);
        jTextField65.setText("0");
        jTextField65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField65ActionPerformed(evt);
            }
        });

        jCheckBox66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox66ActionPerformed(evt);
            }
        });

        jTextField66.setColumns(1);
        jTextField66.setText("0");
        jTextField66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField66ActionPerformed(evt);
            }
        });

        jCheckBox67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox67ActionPerformed(evt);
            }
        });

        jTextField67.setColumns(1);
        jTextField67.setText("0");
        jTextField67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField67ActionPerformed(evt);
            }
        });

        jCheckBox68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox68ActionPerformed(evt);
            }
        });

        jTextField68.setColumns(1);
        jTextField68.setText("0");
        jTextField68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField68ActionPerformed(evt);
            }
        });

        jCheckBox69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox69ActionPerformed(evt);
            }
        });

        jTextField69.setColumns(1);
        jTextField69.setText("0");
        jTextField69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField69ActionPerformed(evt);
            }
        });

        jCheckBox70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox70ActionPerformed(evt);
            }
        });

        jTextField70.setColumns(1);
        jTextField70.setText("0");
        jTextField70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField70ActionPerformed(evt);
            }
        });

        jCheckBox71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox71ActionPerformed(evt);
            }
        });

        jTextField71.setColumns(1);
        jTextField71.setText("0");
        jTextField71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField71ActionPerformed(evt);
            }
        });

        jCheckBox72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox72ActionPerformed(evt);
            }
        });

        jTextField72.setColumns(1);
        jTextField72.setText("0");
        jTextField72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField72ActionPerformed(evt);
            }
        });

        jCheckBox73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox73ActionPerformed(evt);
            }
        });

        jTextField73.setColumns(1);
        jTextField73.setText("0");
        jTextField73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField73ActionPerformed(evt);
            }
        });

        jCheckBox74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox74ActionPerformed(evt);
            }
        });

        jTextField74.setColumns(1);
        jTextField74.setText("0");
        jTextField74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField74ActionPerformed(evt);
            }
        });

        jCheckBox75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox75ActionPerformed(evt);
            }
        });

        jTextField75.setColumns(1);
        jTextField75.setText("0");
        jTextField75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField75ActionPerformed(evt);
            }
        });

        jCheckBox76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox76ActionPerformed(evt);
            }
        });

        jTextField76.setColumns(1);
        jTextField76.setText("0");
        jTextField76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField76ActionPerformed(evt);
            }
        });

        jCheckBox77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox77ActionPerformed(evt);
            }
        });

        jTextField77.setColumns(1);
        jTextField77.setText("0");
        jTextField77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField77ActionPerformed(evt);
            }
        });

        jCheckBox78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox78ActionPerformed(evt);
            }
        });

        jTextField78.setColumns(1);
        jTextField78.setText("0");
        jTextField78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField78ActionPerformed(evt);
            }
        });

        jCheckBox79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox79ActionPerformed(evt);
            }
        });

        jTextField79.setColumns(1);
        jTextField79.setText("0");
        jTextField79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField79ActionPerformed(evt);
            }
        });

        jCheckBox80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox80ActionPerformed(evt);
            }
        });

        jTextField80.setColumns(1);
        jTextField80.setText("0");
        jTextField80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField80ActionPerformed(evt);
            }
        });

        jCheckBox81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox81ActionPerformed(evt);
            }
        });

        jTextField81.setColumns(1);
        jTextField81.setText("0");
        jTextField81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField81ActionPerformed(evt);
            }
        });

        jCheckBox82.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox82ActionPerformed(evt);
            }
        });

        jTextField82.setColumns(1);
        jTextField82.setText("0");
        jTextField82.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField82ActionPerformed(evt);
            }
        });

        jCheckBox83.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox83ActionPerformed(evt);
            }
        });

        jTextField83.setColumns(1);
        jTextField83.setText("0");
        jTextField83.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField83ActionPerformed(evt);
            }
        });

        jCheckBox84.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox84ActionPerformed(evt);
            }
        });

        jTextField84.setColumns(1);
        jTextField84.setText("0");
        jTextField84.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField84ActionPerformed(evt);
            }
        });

        jCheckBox85.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox85ActionPerformed(evt);
            }
        });

        jTextField85.setColumns(1);
        jTextField85.setText("0");
        jTextField85.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField85ActionPerformed(evt);
            }
        });

        jCheckBox86.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox86ActionPerformed(evt);
            }
        });

        jTextField86.setColumns(1);
        jTextField86.setText("0");
        jTextField86.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField86ActionPerformed(evt);
            }
        });

        jCheckBox87.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox87ActionPerformed(evt);
            }
        });

        jTextField87.setColumns(1);
        jTextField87.setText("0");
        jTextField87.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField87ActionPerformed(evt);
            }
        });

        jCheckBox88.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox88ActionPerformed(evt);
            }
        });

        jTextField88.setColumns(1);
        jTextField88.setText("0");
        jTextField88.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField88ActionPerformed(evt);
            }
        });

        jCheckBox89.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox89ActionPerformed(evt);
            }
        });

        jTextField89.setColumns(1);
        jTextField89.setText("0");
        jTextField89.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField89ActionPerformed(evt);
            }
        });

        jCheckBox90.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox90ActionPerformed(evt);
            }
        });

        jTextField90.setColumns(1);
        jTextField90.setText("0");
        jTextField90.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField90ActionPerformed(evt);
            }
        });

        jCheckBox91.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox91ActionPerformed(evt);
            }
        });

        jTextField91.setColumns(1);
        jTextField91.setText("0");
        jTextField91.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField91ActionPerformed(evt);
            }
        });

        jCheckBox92.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox92ActionPerformed(evt);
            }
        });

        jTextField92.setColumns(1);
        jTextField92.setText("0");
        jTextField92.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField92ActionPerformed(evt);
            }
        });

        jCheckBox93.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox93ActionPerformed(evt);
            }
        });

        jTextField93.setColumns(1);
        jTextField93.setText("0");
        jTextField93.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField93ActionPerformed(evt);
            }
        });

        jCheckBox94.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox94ActionPerformed(evt);
            }
        });

        jTextField94.setColumns(1);
        jTextField94.setText("0");
        jTextField94.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField94ActionPerformed(evt);
            }
        });

        jCheckBox95.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox95ActionPerformed(evt);
            }
        });

        jTextField95.setColumns(1);
        jTextField95.setText("0");
        jTextField95.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField95ActionPerformed(evt);
            }
        });

        jCheckBox96.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox96ActionPerformed(evt);
            }
        });

        jTextField96.setColumns(1);
        jTextField96.setText("0");
        jTextField96.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField96ActionPerformed(evt);
            }
        });

        jCheckBox97.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox97ActionPerformed(evt);
            }
        });

        jTextField97.setColumns(1);
        jTextField97.setText("0");
        jTextField97.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField97ActionPerformed(evt);
            }
        });

        jCheckBox98.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox98ActionPerformed(evt);
            }
        });

        jTextField98.setColumns(1);
        jTextField98.setText("0");
        jTextField98.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField98ActionPerformed(evt);
            }
        });

        jCheckBox99.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox99ActionPerformed(evt);
            }
        });

        jTextField99.setColumns(1);
        jTextField99.setText("0");
        jTextField99.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField99ActionPerformed(evt);
            }
        });

        jCheckBox100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox100ActionPerformed(evt);
            }
        });

        jTextField100.setColumns(1);
        jTextField100.setText("0");
        jTextField100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField100ActionPerformed(evt);
            }
        });

        jLabel8.setText("PC");

        jCheckBox101.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox101ActionPerformed(evt);
            }
        });

        jTextField101.setColumns(1);
        jTextField101.setText("0");
        jTextField101.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField101ActionPerformed(evt);
            }
        });

        jCheckBox102.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox102ActionPerformed(evt);
            }
        });

        jTextField102.setColumns(1);
        jTextField102.setText("0");
        jTextField102.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField102ActionPerformed(evt);
            }
        });

        jCheckBox103.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox103ActionPerformed(evt);
            }
        });

        jTextField103.setColumns(1);
        jTextField103.setText("0");
        jTextField103.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField103ActionPerformed(evt);
            }
        });

        jCheckBox104.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox104ActionPerformed(evt);
            }
        });

        jTextField104.setColumns(1);
        jTextField104.setText("0");
        jTextField104.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField104ActionPerformed(evt);
            }
        });

        jCheckBox105.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox105ActionPerformed(evt);
            }
        });

        jTextField105.setColumns(1);
        jTextField105.setText("0");
        jTextField105.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField105ActionPerformed(evt);
            }
        });

        jCheckBox106.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox106ActionPerformed(evt);
            }
        });

        jTextField106.setColumns(1);
        jTextField106.setText("0");
        jTextField106.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField106ActionPerformed(evt);
            }
        });

        jCheckBox107.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox107ActionPerformed(evt);
            }
        });

        jTextField107.setColumns(1);
        jTextField107.setText("0");
        jTextField107.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField107ActionPerformed(evt);
            }
        });

        jCheckBox108.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox108ActionPerformed(evt);
            }
        });

        jTextField108.setColumns(1);
        jTextField108.setText("0");
        jTextField108.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField108ActionPerformed(evt);
            }
        });

        jCheckBox109.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox109ActionPerformed(evt);
            }
        });

        jTextField109.setColumns(1);
        jTextField109.setText("0");
        jTextField109.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField109ActionPerformed(evt);
            }
        });

        jCheckBox110.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox110ActionPerformed(evt);
            }
        });

        jTextField110.setColumns(1);
        jTextField110.setText("0");
        jTextField110.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField110ActionPerformed(evt);
            }
        });

        jCheckBox111.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox111ActionPerformed(evt);
            }
        });

        jTextField111.setColumns(1);
        jTextField111.setText("0");
        jTextField111.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField111ActionPerformed(evt);
            }
        });

        jCheckBox112.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox112ActionPerformed(evt);
            }
        });

        jTextField112.setColumns(1);
        jTextField112.setText("0");
        jTextField112.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField112ActionPerformed(evt);
            }
        });

        jLabel9.setText("IR");

        jCheckBox113.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox113ActionPerformed(evt);
            }
        });

        jTextField113.setColumns(1);
        jTextField113.setText("0");
        jTextField113.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField113ActionPerformed(evt);
            }
        });

        jCheckBox114.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox114ActionPerformed(evt);
            }
        });

        jTextField114.setColumns(1);
        jTextField114.setText("0");
        jTextField114.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField114ActionPerformed(evt);
            }
        });

        jCheckBox115.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox115ActionPerformed(evt);
            }
        });

        jTextField115.setColumns(1);
        jTextField115.setText("0");
        jTextField115.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField115ActionPerformed(evt);
            }
        });

        jCheckBox116.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox116ActionPerformed(evt);
            }
        });

        jTextField116.setColumns(1);
        jTextField116.setText("0");
        jTextField116.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField116ActionPerformed(evt);
            }
        });

        jCheckBox117.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox117ActionPerformed(evt);
            }
        });

        jTextField117.setColumns(1);
        jTextField117.setText("0");
        jTextField117.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField117ActionPerformed(evt);
            }
        });

        jCheckBox118.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox118ActionPerformed(evt);
            }
        });

        jTextField118.setColumns(1);
        jTextField118.setText("0");
        jTextField118.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField118ActionPerformed(evt);
            }
        });

        jCheckBox119.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox119ActionPerformed(evt);
            }
        });

        jTextField119.setColumns(1);
        jTextField119.setText("0");
        jTextField119.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField119ActionPerformed(evt);
            }
        });

        jCheckBox120.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox120ActionPerformed(evt);
            }
        });

        jTextField120.setColumns(1);
        jTextField120.setText("0");
        jTextField120.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField120ActionPerformed(evt);
            }
        });

        jCheckBox121.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox121ActionPerformed(evt);
            }
        });

        jTextField121.setColumns(1);
        jTextField121.setText("0");
        jTextField121.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField121ActionPerformed(evt);
            }
        });

        jCheckBox122.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox122ActionPerformed(evt);
            }
        });

        jTextField122.setColumns(1);
        jTextField122.setText("0");
        jTextField122.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField122ActionPerformed(evt);
            }
        });

        jCheckBox123.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox123ActionPerformed(evt);
            }
        });

        jTextField123.setColumns(1);
        jTextField123.setText("0");
        jTextField123.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField123ActionPerformed(evt);
            }
        });

        jCheckBox124.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox124ActionPerformed(evt);
            }
        });

        jTextField124.setColumns(1);
        jTextField124.setText("0");
        jTextField124.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField124ActionPerformed(evt);
            }
        });

        jCheckBox125.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox125ActionPerformed(evt);
            }
        });

        jTextField125.setColumns(1);
        jTextField125.setText("0");
        jTextField125.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField125ActionPerformed(evt);
            }
        });

        jCheckBox126.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox126ActionPerformed(evt);
            }
        });

        jTextField126.setColumns(1);
        jTextField126.setText("0");
        jTextField126.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField126ActionPerformed(evt);
            }
        });

        jCheckBox127.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox127ActionPerformed(evt);
            }
        });

        jTextField127.setColumns(1);
        jTextField127.setText("0");
        jTextField127.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField127ActionPerformed(evt);
            }
        });

        jCheckBox128.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox128ActionPerformed(evt);
            }
        });

        jTextField128.setColumns(1);
        jTextField128.setText("0");
        jTextField128.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField128ActionPerformed(evt);
            }
        });

        jLabel10.setText("MAR");

        jCheckBox129.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox129ActionPerformed(evt);
            }
        });

        jTextField129.setColumns(1);
        jTextField129.setText("0");
        jTextField129.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField129ActionPerformed(evt);
            }
        });

        jCheckBox130.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox130ActionPerformed(evt);
            }
        });

        jTextField130.setColumns(1);
        jTextField130.setText("0");
        jTextField130.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField130ActionPerformed(evt);
            }
        });

        jCheckBox131.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox131ActionPerformed(evt);
            }
        });

        jTextField131.setColumns(1);
        jTextField131.setText("0");
        jTextField131.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField131ActionPerformed(evt);
            }
        });

        jCheckBox132.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox132ActionPerformed(evt);
            }
        });

        jTextField132.setColumns(1);
        jTextField132.setText("0");
        jTextField132.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField132ActionPerformed(evt);
            }
        });

        jCheckBox133.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox133ActionPerformed(evt);
            }
        });

        jTextField133.setColumns(1);
        jTextField133.setText("0");
        jTextField133.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField133ActionPerformed(evt);
            }
        });

        jCheckBox134.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox134ActionPerformed(evt);
            }
        });

        jTextField134.setColumns(1);
        jTextField134.setText("0");
        jTextField134.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField134ActionPerformed(evt);
            }
        });

        jCheckBox135.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox135ActionPerformed(evt);
            }
        });

        jTextField135.setColumns(1);
        jTextField135.setText("0");
        jTextField135.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField135ActionPerformed(evt);
            }
        });

        jCheckBox136.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox136ActionPerformed(evt);
            }
        });

        jTextField136.setColumns(1);
        jTextField136.setText("0");
        jTextField136.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField136ActionPerformed(evt);
            }
        });

        jCheckBox137.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox137ActionPerformed(evt);
            }
        });

        jTextField137.setColumns(1);
        jTextField137.setText("0");
        jTextField137.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField137ActionPerformed(evt);
            }
        });

        jCheckBox138.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox138ActionPerformed(evt);
            }
        });

        jTextField138.setColumns(1);
        jTextField138.setText("0");
        jTextField138.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField138ActionPerformed(evt);
            }
        });

        jCheckBox139.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox139ActionPerformed(evt);
            }
        });

        jTextField139.setColumns(1);
        jTextField139.setText("0");
        jTextField139.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField139ActionPerformed(evt);
            }
        });

        jCheckBox140.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox140ActionPerformed(evt);
            }
        });

        jTextField140.setColumns(1);
        jTextField140.setText("0");
        jTextField140.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField140ActionPerformed(evt);
            }
        });

        jCheckBox141.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox141ActionPerformed(evt);
            }
        });

        jTextField141.setColumns(1);
        jTextField141.setText("0");
        jTextField141.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField141ActionPerformed(evt);
            }
        });

        jCheckBox142.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox142ActionPerformed(evt);
            }
        });

        jTextField142.setColumns(1);
        jTextField142.setText("0");
        jTextField142.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField142ActionPerformed(evt);
            }
        });

        jCheckBox143.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox143ActionPerformed(evt);
            }
        });

        jTextField143.setColumns(1);
        jTextField143.setText("0");
        jTextField143.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField143ActionPerformed(evt);
            }
        });

        jCheckBox144.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox144ActionPerformed(evt);
            }
        });

        jTextField144.setColumns(1);
        jTextField144.setText("0");
        jTextField144.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField144ActionPerformed(evt);
            }
        });

        jLabel11.setText("MBR");

        jCheckBox145.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox145ActionPerformed(evt);
            }
        });

        jTextField145.setColumns(1);
        jTextField145.setText("0");
        jTextField145.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField145ActionPerformed(evt);
            }
        });

        jCheckBox146.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox146ActionPerformed(evt);
            }
        });

        jTextField146.setColumns(1);
        jTextField146.setText("0");
        jTextField146.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField146ActionPerformed(evt);
            }
        });

        jCheckBox147.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox147ActionPerformed(evt);
            }
        });

        jTextField147.setColumns(1);
        jTextField147.setText("0");
        jTextField147.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField147ActionPerformed(evt);
            }
        });

        jCheckBox148.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox148ActionPerformed(evt);
            }
        });

        jTextField148.setColumns(1);
        jTextField148.setText("0");
        jTextField148.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField148ActionPerformed(evt);
            }
        });

        jCheckBox149.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox149ActionPerformed(evt);
            }
        });

        jTextField149.setColumns(1);
        jTextField149.setText("0");
        jTextField149.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField149ActionPerformed(evt);
            }
        });

        jCheckBox150.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox150ActionPerformed(evt);
            }
        });

        jTextField150.setColumns(1);
        jTextField150.setText("0");
        jTextField150.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField150ActionPerformed(evt);
            }
        });

        jCheckBox151.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox151ActionPerformed(evt);
            }
        });

        jTextField151.setColumns(1);
        jTextField151.setText("0");
        jTextField151.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField151ActionPerformed(evt);
            }
        });

        jCheckBox152.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox152ActionPerformed(evt);
            }
        });

        jTextField152.setColumns(1);
        jTextField152.setText("0");
        jTextField152.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField152ActionPerformed(evt);
            }
        });

        jCheckBox153.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox153ActionPerformed(evt);
            }
        });

        jTextField153.setColumns(1);
        jTextField153.setText("0");
        jTextField153.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField153ActionPerformed(evt);
            }
        });

        jCheckBox154.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox154ActionPerformed(evt);
            }
        });

        jTextField154.setColumns(1);
        jTextField154.setText("0");
        jTextField154.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField154ActionPerformed(evt);
            }
        });

        jCheckBox155.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox155ActionPerformed(evt);
            }
        });

        jTextField155.setColumns(1);
        jTextField155.setText("0");
        jTextField155.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField155ActionPerformed(evt);
            }
        });

        jCheckBox156.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox156ActionPerformed(evt);
            }
        });

        jTextField156.setColumns(1);
        jTextField156.setText("0");
        jTextField156.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField156ActionPerformed(evt);
            }
        });

        jCheckBox157.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox157ActionPerformed(evt);
            }
        });

        jTextField157.setColumns(1);
        jTextField157.setText("0");
        jTextField157.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField157ActionPerformed(evt);
            }
        });

        jCheckBox158.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox158ActionPerformed(evt);
            }
        });

        jTextField158.setColumns(1);
        jTextField158.setText("0");
        jTextField158.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField158ActionPerformed(evt);
            }
        });

        jCheckBox159.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox159ActionPerformed(evt);
            }
        });

        jTextField159.setColumns(1);
        jTextField159.setText("0");
        jTextField159.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField159ActionPerformed(evt);
            }
        });

        jCheckBox160.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox160ActionPerformed(evt);
            }
        });

        jTextField160.setColumns(1);
        jTextField160.setText("0");
        jTextField160.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField160ActionPerformed(evt);
            }
        });

        jLabel12.setText("MSR");

        jCheckBox161.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox161ActionPerformed(evt);
            }
        });

        jTextField161.setColumns(1);
        jTextField161.setText("0");
        jTextField161.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField161ActionPerformed(evt);
            }
        });

        jCheckBox162.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox162ActionPerformed(evt);
            }
        });

        jTextField162.setColumns(1);
        jTextField162.setText("0");
        jTextField162.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField162ActionPerformed(evt);
            }
        });

        jCheckBox163.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox163ActionPerformed(evt);
            }
        });

        jTextField163.setColumns(1);
        jTextField163.setText("0");
        jTextField163.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField163ActionPerformed(evt);
            }
        });

        jCheckBox164.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox164ActionPerformed(evt);
            }
        });

        jTextField164.setColumns(1);
        jTextField164.setText("0");
        jTextField164.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField164ActionPerformed(evt);
            }
        });

        jCheckBox165.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox165ActionPerformed(evt);
            }
        });

        jTextField165.setColumns(1);
        jTextField165.setText("0");
        jTextField165.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField165ActionPerformed(evt);
            }
        });

        jCheckBox166.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox166ActionPerformed(evt);
            }
        });

        jTextField166.setColumns(1);
        jTextField166.setText("0");
        jTextField166.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField166ActionPerformed(evt);
            }
        });

        jCheckBox167.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox167ActionPerformed(evt);
            }
        });

        jTextField167.setColumns(1);
        jTextField167.setText("0");
        jTextField167.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField167ActionPerformed(evt);
            }
        });

        jCheckBox168.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox168ActionPerformed(evt);
            }
        });

        jTextField168.setColumns(1);
        jTextField168.setText("0");
        jTextField168.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField168ActionPerformed(evt);
            }
        });

        jCheckBox169.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox169ActionPerformed(evt);
            }
        });

        jTextField169.setColumns(1);
        jTextField169.setText("0");
        jTextField169.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField169ActionPerformed(evt);
            }
        });

        jCheckBox170.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox170ActionPerformed(evt);
            }
        });

        jTextField170.setColumns(1);
        jTextField170.setText("0");
        jTextField170.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField170ActionPerformed(evt);
            }
        });

        jCheckBox171.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox171ActionPerformed(evt);
            }
        });

        jTextField171.setColumns(1);
        jTextField171.setText("0");
        jTextField171.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField171ActionPerformed(evt);
            }
        });

        jCheckBox172.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox172ActionPerformed(evt);
            }
        });

        jTextField172.setColumns(1);
        jTextField172.setText("0");
        jTextField172.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField172ActionPerformed(evt);
            }
        });

        jCheckBox173.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox173ActionPerformed(evt);
            }
        });

        jTextField173.setColumns(1);
        jTextField173.setText("0");
        jTextField173.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField173ActionPerformed(evt);
            }
        });

        jCheckBox174.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox174ActionPerformed(evt);
            }
        });

        jTextField174.setColumns(1);
        jTextField174.setText("0");
        jTextField174.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField174ActionPerformed(evt);
            }
        });

        jCheckBox175.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox175ActionPerformed(evt);
            }
        });

        jTextField175.setColumns(1);
        jTextField175.setText("0");
        jTextField175.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField175ActionPerformed(evt);
            }
        });

        jCheckBox176.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox176ActionPerformed(evt);
            }
        });

        jTextField176.setColumns(1);
        jTextField176.setText("0");
        jTextField176.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField176ActionPerformed(evt);
            }
        });

        jCheckBox177.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox177ActionPerformed(evt);
            }
        });

        jTextField177.setColumns(1);
        jTextField177.setText("0");
        jTextField177.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField177ActionPerformed(evt);
            }
        });

        jCheckBox178.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox178ActionPerformed(evt);
            }
        });

        jTextField178.setColumns(1);
        jTextField178.setText("0");
        jTextField178.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField178ActionPerformed(evt);
            }
        });

        jCheckBox179.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox179ActionPerformed(evt);
            }
        });

        jTextField179.setColumns(1);
        jTextField179.setText("0");
        jTextField179.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField179ActionPerformed(evt);
            }
        });

        jCheckBox180.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox180ActionPerformed(evt);
            }
        });

        jTextField180.setColumns(1);
        jTextField180.setText("0");
        jTextField180.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField180ActionPerformed(evt);
            }
        });

        jLabel13.setText("MFR");

        jCheckBox181.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox181ActionPerformed(evt);
            }
        });

        jTextField181.setColumns(1);
        jTextField181.setText("0");
        jTextField181.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField181ActionPerformed(evt);
            }
        });

        jCheckBox182.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox182ActionPerformed(evt);
            }
        });

        jTextField182.setColumns(1);
        jTextField182.setText("0");
        jTextField182.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField182ActionPerformed(evt);
            }
        });

        jCheckBox183.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox183ActionPerformed(evt);
            }
        });

        jTextField183.setColumns(1);
        jTextField183.setText("0");
        jTextField183.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField183ActionPerformed(evt);
            }
        });

        jCheckBox184.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox184ActionPerformed(evt);
            }
        });

        jTextField184.setColumns(1);
        jTextField184.setText("0");
        jTextField184.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField184ActionPerformed(evt);
            }
        });

        jLabel14.setText("CC");

        ConsolePrinterField.setColumns(20);
        ConsolePrinterField.setRows(5);
        jScrollPane1.setViewportView(ConsolePrinterField);

        jLabel15.setText("CONSOLE PRINTER");

        jLabel16.setText("CONSOLE INPUT");

        jTextField186.setColumns(1);
        jTextField186.setText("0");
        jTextField186.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField186ActionPerformed(evt);
            }
        });

        jCheckBox186.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox186ActionPerformed(evt);
            }
        });

        jTextField187.setColumns(1);
        jTextField187.setText("0");
        jTextField187.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField187ActionPerformed(evt);
            }
        });

        jCheckBox187.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox187ActionPerformed(evt);
            }
        });

        jTextField188.setColumns(1);
        jTextField188.setText("0");
        jTextField188.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField188ActionPerformed(evt);
            }
        });

        jCheckBox188.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox188ActionPerformed(evt);
            }
        });

        jTextField189.setColumns(1);
        jTextField189.setText("0");
        jTextField189.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField189ActionPerformed(evt);
            }
        });

        jCheckBox189.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox189ActionPerformed(evt);
            }
        });

        jTextField190.setColumns(1);
        jTextField190.setText("0");
        jTextField190.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField190ActionPerformed(evt);
            }
        });

        jCheckBox190.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox190ActionPerformed(evt);
            }
        });

        jTextField191.setColumns(1);
        jTextField191.setText("0");
        jTextField191.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField191ActionPerformed(evt);
            }
        });

        jCheckBox191.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox191ActionPerformed(evt);
            }
        });

        jTextField192.setColumns(1);
        jTextField192.setText("0");
        jTextField192.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField192ActionPerformed(evt);
            }
        });

        jCheckBox192.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox192ActionPerformed(evt);
            }
        });

        jTextField193.setColumns(1);
        jTextField193.setText("0");
        jTextField193.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField193ActionPerformed(evt);
            }
        });

        jCheckBox193.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox193ActionPerformed(evt);
            }
        });

        jTextField194.setColumns(1);
        jTextField194.setText("0");
        jTextField194.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField194ActionPerformed(evt);
            }
        });

        jCheckBox194.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox194ActionPerformed(evt);
            }
        });

        jTextField195.setColumns(1);
        jTextField195.setText("0");
        jTextField195.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField195ActionPerformed(evt);
            }
        });

        jCheckBox195.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox195ActionPerformed(evt);
            }
        });

        jTextField196.setColumns(1);
        jTextField196.setText("0");
        jTextField196.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField196ActionPerformed(evt);
            }
        });

        jCheckBox196.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox196ActionPerformed(evt);
            }
        });

        jTextField197.setColumns(1);
        jTextField197.setText("0");
        jTextField197.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField197ActionPerformed(evt);
            }
        });

        jCheckBox197.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox197ActionPerformed(evt);
            }
        });

        ConsoleInputField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsoleInputFieldActionPerformed(evt);
            }
        });

        runButton.setText("Run");
        runButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runButtonActionPerformed(evt);
            }
        });

        haltButton.setText("Halt");
        haltButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                haltButtonActionPerformed(evt);
            }
        });

        iplButton.setText("IPL");
        iplButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iplButtonActionPerformed(evt);
            }
        });

        singlestepButton.setText("Single Step");
        singlestepButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                singlestepButtonActionPerformed(evt);
            }
        });

        jLabel17.setText("Carry");

        CarryC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CarryC1ActionPerformed(evt);
            }
        });

        CarryT1.setColumns(1);
        CarryT1.setText("0");
        CarryT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CarryT1ActionPerformed(evt);
            }
        });

        SelectFileButton.setText("Add a file to memory");
        SelectFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectFileButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jCheckBox1)
                                .addGap(0, 0, 0)
                                .addComponent(jCheckBox2)
                                .addGap(0, 0, 0)
                                .addComponent(jCheckBox3)
                                .addGap(0, 0, 0)
                                .addComponent(jCheckBox4)
                                .addGap(0, 0, 0)
                                .addComponent(jCheckBox5)
                                .addGap(0, 0, 0)
                                .addComponent(jCheckBox6)
                                .addGap(0, 0, 0)
                                .addComponent(jCheckBox7)
                                .addGap(0, 0, 0)
                                .addComponent(jCheckBox8)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox9)
                                .addGap(0, 0, 0)
                                .addComponent(jCheckBox10)
                                .addGap(0, 0, 0)
                                .addComponent(jCheckBox11)
                                .addGap(0, 0, 0)
                                .addComponent(jCheckBox12)
                                .addGap(0, 0, 0)
                                .addComponent(jCheckBox13)
                                .addGap(0, 0, 0)
                                .addComponent(jCheckBox14)
                                .addGap(0, 0, 0)
                                .addComponent(jCheckBox15)
                                .addGap(0, 0, 0)
                                .addComponent(jCheckBox16))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel2)
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(R1T1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(R1C1))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(R1T2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(R1C2))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(R1T3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(R1C3))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(R1T4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(R1C4))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(R1T5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(R1C5))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(R1T6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(R1C6))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(R1T7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(R1C7))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(R1T8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(R1C8))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(R1T9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(R1C9))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(R1T10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(R1C10))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(R1T11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(R1C11))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(R1T12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(R1C12))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(R1T13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(R1C13))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(R1T14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(R1C14))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(R1T15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(R1C15))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(R1T16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(R1C16)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel3))
                                    .addComponent(jLabel4))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(R2T1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(R2C1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(R3T1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(R2T2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(R2C2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(R3T2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(R2T3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(R2T4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(R2T5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(R2C3)
                                        .addGap(0, 0, 0)
                                        .addComponent(R2C4)
                                        .addGap(0, 0, 0)
                                        .addComponent(R2C5))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(R3T3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(R3T4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(R3T5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(R2T6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(R2C6)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(R3T6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(R2T7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(R2C7)
                                    .addComponent(R3T7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(R2T8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(R2C8)
                                    .addComponent(R3T8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(R2T9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(R2C9)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(R3T9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(R2T10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(R2C10)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(R3T10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(R2T11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(R2T12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(R2T13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(R2C11)
                                        .addGap(0, 0, 0)
                                        .addComponent(R2C12)
                                        .addGap(0, 0, 0)
                                        .addComponent(R2C13))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(R3T11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(R3T12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(R3T13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(R2T14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(R2C14)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(R3T14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addComponent(R2T15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(R2C15))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addComponent(R2T16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(R2C16)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(R3T15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(R3T16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(R3C1)
                                .addGap(0, 0, 0)
                                .addComponent(R3C2)
                                .addGap(0, 0, 0)
                                .addComponent(R3C3)
                                .addGap(0, 0, 0)
                                .addComponent(R3C4)
                                .addGap(0, 0, 0)
                                .addComponent(R3C5)
                                .addGap(0, 0, 0)
                                .addComponent(R3C6)
                                .addGap(0, 0, 0)
                                .addComponent(R3C7)
                                .addGap(0, 0, 0)
                                .addComponent(R3C8)
                                .addGap(18, 18, 18)
                                .addComponent(R3C9)
                                .addGap(0, 0, 0)
                                .addComponent(R3C10)
                                .addGap(0, 0, 0)
                                .addComponent(R3C11)
                                .addGap(0, 0, 0)
                                .addComponent(R3C12)
                                .addGap(0, 0, 0)
                                .addComponent(R3C13)
                                .addGap(0, 0, 0)
                                .addComponent(R3C14)
                                .addGap(0, 0, 0)
                                .addComponent(R3C15)
                                .addGap(0, 0, 0)
                                .addComponent(R3C16))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel9)
                                .addGap(26, 26, 26)
                                .addComponent(jTextField113, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)
                                .addComponent(jTextField114, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jTextField115, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jTextField116, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jTextField117, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jTextField118, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jTextField119, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jTextField120, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(jTextField121, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jTextField122, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jTextField123, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jTextField124, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jTextField125, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jTextField126, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jTextField127, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jTextField128, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jCheckBox113)
                                .addGap(2, 2, 2)
                                .addComponent(jCheckBox114)
                                .addGap(0, 0, 0)
                                .addComponent(jCheckBox115)
                                .addGap(0, 0, 0)
                                .addComponent(jCheckBox116)
                                .addGap(0, 0, 0)
                                .addComponent(jCheckBox117)
                                .addGap(0, 0, 0)
                                .addComponent(jCheckBox118)
                                .addGap(0, 0, 0)
                                .addComponent(jCheckBox119)
                                .addGap(0, 0, 0)
                                .addComponent(jCheckBox120)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox121)
                                .addGap(0, 0, 0)
                                .addComponent(jCheckBox122)
                                .addGap(0, 0, 0)
                                .addComponent(jCheckBox123)
                                .addGap(0, 0, 0)
                                .addComponent(jCheckBox124)
                                .addGap(0, 0, 0)
                                .addComponent(jCheckBox125)
                                .addGap(0, 0, 0)
                                .addComponent(jCheckBox126)
                                .addGap(0, 0, 0)
                                .addComponent(jCheckBox127)
                                .addGap(0, 0, 0)
                                .addComponent(jCheckBox128))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(54, 54, 54)
                                    .addComponent(ConsoleInputField, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addComponent(jLabel1)
                                    .addGap(26, 26, 26)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane1)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(6, 6, 6)
                                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(6, 6, 6)
                                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(6, 6, 6)
                                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(6, 6, 6)
                                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(10, 10, 10)
                                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(6, 6, 6)
                                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(7, 7, 7)
                                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(23, 23, 23)
                                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(6, 6, 6)
                                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(6, 6, 6)
                                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(6, 6, 6)
                                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(6, 6, 6)
                                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(6, 6, 6)
                                            .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(10, 10, 10)
                                            .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(6, 6, 6)
                                            .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel5)
                                                .addComponent(jLabel8))
                                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(2, 2, 2)
                                                        .addComponent(jTextField101, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(jCheckBox101))
                                                .addGap(2, 2, 2)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(2, 2, 2)
                                                        .addComponent(jTextField102, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(jCheckBox102))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(2, 2, 2)
                                                        .addComponent(jTextField103, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(jCheckBox103))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(2, 2, 2)
                                                        .addComponent(jTextField104, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(jCheckBox104))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(2, 2, 2)
                                                        .addComponent(jTextField105, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(jCheckBox105))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(2, 2, 2)
                                                        .addComponent(jTextField106, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(jCheckBox106))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(61, 61, 61)
                                                        .addComponent(jTextField97, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(6, 6, 6)
                                                        .addComponent(jTextField98, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jTextField99, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jTextField100, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(59, 59, 59)
                                                        .addComponent(jCheckBox97)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addGap(40, 40, 40)
                                                                .addComponent(jCheckBox100))
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addGap(20, 20, 20)
                                                                .addComponent(jCheckBox99))
                                                            .addComponent(jCheckBox98)))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addGap(5, 5, 5)
                                                                .addComponent(jTextField107, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(2, 2, 2)
                                                                .addComponent(jTextField108, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jTextField109, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(8, 8, 8)
                                                                .addComponent(jTextField110, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(7, 7, 7)
                                                                .addComponent(jTextField111, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(7, 7, 7)
                                                                .addComponent(jTextField112, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jCheckBox107)
                                                                .addGap(0, 0, 0)
                                                                .addComponent(jCheckBox108)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jCheckBox109)
                                                                .addGap(0, 0, 0)
                                                                .addComponent(jCheckBox110)
                                                                .addGap(0, 0, 0)
                                                                .addComponent(jCheckBox111)
                                                                .addGap(0, 0, 0)
                                                                .addComponent(jCheckBox112)))))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jTextField194, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(7, 7, 7)
                                                        .addComponent(jTextField195, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(7, 7, 7)
                                                        .addComponent(jTextField196, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(7, 7, 7)
                                                        .addComponent(jTextField197, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jCheckBox194)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jCheckBox195)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jCheckBox196)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jCheckBox197))))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jCheckBox77)
                                                .addGap(0, 0, 0)
                                                .addComponent(jCheckBox78)
                                                .addGap(0, 0, 0)
                                                .addComponent(jCheckBox79)
                                                .addGap(0, 0, 0)
                                                .addComponent(jCheckBox80)
                                                .addGap(0, 0, 0)
                                                .addComponent(jCheckBox81)
                                                .addGap(0, 0, 0)
                                                .addComponent(jCheckBox82)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jCheckBox83)
                                                .addGap(0, 0, 0)
                                                .addComponent(jCheckBox84))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jTextField89, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(6, 6, 6)
                                                        .addComponent(jTextField90, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(6, 6, 6)
                                                        .addComponent(jTextField91, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jTextField92, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(6, 6, 6)
                                                        .addComponent(jTextField93, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(6, 6, 6)
                                                        .addComponent(jTextField94, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jTextField95, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jTextField96, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jCheckBox89)
                                                                .addGap(19, 19, 19)
                                                                .addComponent(jCheckBox91))
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addGap(80, 80, 80)
                                                                .addComponent(jCheckBox93))
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addGap(60, 60, 60)
                                                                .addComponent(jCheckBox92))
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addGap(20, 20, 20)
                                                                .addComponent(jCheckBox90)))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jCheckBox94)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jCheckBox95)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jCheckBox96))))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jCheckBox65)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(80, 80, 80)
                                                        .addComponent(jCheckBox70))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(60, 60, 60)
                                                        .addComponent(jCheckBox69))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(40, 40, 40)
                                                        .addComponent(jCheckBox68))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(20, 20, 20)
                                                        .addComponent(jCheckBox67))
                                                    .addComponent(jCheckBox66))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(20, 20, 20)
                                                        .addComponent(jCheckBox72))
                                                    .addComponent(jCheckBox71)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addComponent(jTextField77, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(7, 7, 7)
                                                .addComponent(jTextField78, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(7, 7, 7)
                                                .addComponent(jTextField79, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(7, 7, 7)
                                                .addComponent(jTextField80, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(7, 7, 7)
                                                .addComponent(jTextField81, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(7, 7, 7)
                                                .addComponent(jTextField82, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jTextField83, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(7, 7, 7)
                                                        .addComponent(jTextField84, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(24, 24, 24)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jTextField85, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(7, 7, 7)
                                                                .addComponent(jTextField86, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(7, 7, 7)
                                                                .addComponent(jTextField87, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(7, 7, 7)
                                                                .addComponent(jTextField88, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jCheckBox85)
                                                                .addGap(0, 0, 0)
                                                                .addComponent(jCheckBox86)
                                                                .addGap(0, 0, 0)
                                                                .addComponent(jCheckBox87)
                                                                .addGap(0, 0, 0)
                                                                .addComponent(jCheckBox88)))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jTextField190, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(7, 7, 7)
                                                                .addComponent(jTextField191, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(7, 7, 7)
                                                                .addComponent(jTextField192, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(7, 7, 7)
                                                                .addComponent(jTextField193, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jCheckBox190)
                                                                .addGap(0, 0, 0)
                                                                .addComponent(jCheckBox191)
                                                                .addGap(0, 0, 0)
                                                                .addComponent(jCheckBox192)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jCheckBox193)))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel11)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jTextField145, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(9, 9, 9)
                                                                .addComponent(jTextField146, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(7, 7, 7)
                                                                .addComponent(jTextField147, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(7, 7, 7)
                                                                .addComponent(jTextField148, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(7, 7, 7)
                                                                .addComponent(jTextField149, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(7, 7, 7)
                                                                .addComponent(jTextField150, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(7, 7, 7)
                                                                .addComponent(jTextField151, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(7, 7, 7)
                                                                .addComponent(jTextField152, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(28, 28, 28)
                                                                .addComponent(jTextField153, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(7, 7, 7)
                                                                .addComponent(jTextField154, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(7, 7, 7)
                                                                .addComponent(jTextField155, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(7, 7, 7)
                                                                .addComponent(jTextField156, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(7, 7, 7)
                                                                .addComponent(jTextField157, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(7, 7, 7)
                                                                .addComponent(jTextField158, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(7, 7, 7)
                                                                .addComponent(jTextField159, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(7, 7, 7)
                                                                .addComponent(jTextField160, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addGap(38, 38, 38)
                                                                .addComponent(jCheckBox145)
                                                                .addGap(2, 2, 2)
                                                                .addComponent(jCheckBox146)
                                                                .addGap(0, 0, 0)
                                                                .addComponent(jCheckBox147)
                                                                .addGap(0, 0, 0)
                                                                .addComponent(jCheckBox148)
                                                                .addGap(0, 0, 0)
                                                                .addComponent(jCheckBox149)
                                                                .addGap(0, 0, 0)
                                                                .addComponent(jCheckBox150)
                                                                .addGap(0, 0, 0)
                                                                .addComponent(jCheckBox151)
                                                                .addGap(0, 0, 0)
                                                                .addComponent(jCheckBox152)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jCheckBox153)
                                                                .addGap(0, 0, 0)
                                                                .addComponent(jCheckBox154)
                                                                .addGap(0, 0, 0)
                                                                .addComponent(jCheckBox155)
                                                                .addGap(0, 0, 0)
                                                                .addComponent(jCheckBox156)
                                                                .addGap(0, 0, 0)
                                                                .addComponent(jCheckBox157)
                                                                .addGap(0, 0, 0)
                                                                .addComponent(jCheckBox158)
                                                                .addGap(0, 0, 0)
                                                                .addComponent(jCheckBox159)
                                                                .addGap(0, 0, 0)
                                                                .addComponent(jCheckBox160))))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addGap(53, 53, 53)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addGroup(layout.createSequentialGroup()
                                                                        .addGap(20, 20, 20)
                                                                        .addComponent(jCheckBox74))
                                                                    .addComponent(jCheckBox73))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jCheckBox75)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jCheckBox76))
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jTextField71, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jTextField72, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(24, 24, 24)
                                                                .addComponent(jTextField73, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jTextField74, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jTextField75, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jTextField76, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addGap(3, 3, 3)
                                                                .addComponent(jTextField186, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jTextField187, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jTextField188, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jTextField189, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jCheckBox186)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jCheckBox187)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jCheckBox188)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jCheckBox189)))
                                                        .addGap(35, 35, 35)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel10)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jTextField129, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(9, 9, 9)
                                                                .addComponent(jTextField130, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(7, 7, 7)
                                                                .addComponent(jTextField131, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(7, 7, 7)
                                                                .addComponent(jTextField132, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(7, 7, 7)
                                                                .addComponent(jTextField133, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(7, 7, 7)
                                                                .addComponent(jTextField134, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(7, 7, 7)
                                                                .addComponent(jTextField135, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(7, 7, 7)
                                                                .addComponent(jTextField136, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(34, 34, 34)
                                                                .addComponent(jTextField137, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(7, 7, 7)
                                                                .addComponent(jTextField138, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(7, 7, 7)
                                                                .addComponent(jTextField139, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(7, 7, 7)
                                                                .addComponent(jTextField140, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(7, 7, 7)
                                                                .addComponent(jTextField141, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(7, 7, 7)
                                                                .addComponent(jTextField142, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(7, 7, 7)
                                                                .addComponent(jTextField143, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(7, 7, 7)
                                                                .addComponent(jTextField144, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addGap(38, 38, 38)
                                                                .addComponent(jCheckBox129)
                                                                .addGap(2, 2, 2)
                                                                .addComponent(jCheckBox130)
                                                                .addGap(0, 0, 0)
                                                                .addComponent(jCheckBox131)
                                                                .addGap(0, 0, 0)
                                                                .addComponent(jCheckBox132)
                                                                .addGap(0, 0, 0)
                                                                .addComponent(jCheckBox133)
                                                                .addGap(0, 0, 0)
                                                                .addComponent(jCheckBox134)
                                                                .addGap(0, 0, 0)
                                                                .addComponent(jCheckBox135)
                                                                .addGap(0, 0, 0)
                                                                .addComponent(jCheckBox136)
                                                                .addGap(30, 30, 30)
                                                                .addComponent(jCheckBox137)
                                                                .addGap(0, 0, 0)
                                                                .addComponent(jCheckBox138)
                                                                .addGap(0, 0, 0)
                                                                .addComponent(jCheckBox139)
                                                                .addGap(0, 0, 0)
                                                                .addComponent(jCheckBox140)
                                                                .addGap(0, 0, 0)
                                                                .addComponent(jCheckBox141)
                                                                .addGap(0, 0, 0)
                                                                .addComponent(jCheckBox142)
                                                                .addGap(0, 0, 0)
                                                                .addComponent(jCheckBox143)
                                                                .addGap(0, 0, 0)
                                                                .addComponent(jCheckBox144))))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(jLabel12)
                                                            .addGap(18, 18, 18)
                                                            .addComponent(jTextField161, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGap(9, 9, 9)
                                                            .addComponent(jTextField162, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGap(7, 7, 7)
                                                            .addComponent(jTextField163, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGap(7, 7, 7)
                                                            .addComponent(jTextField164, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGap(7, 7, 7)
                                                            .addComponent(jTextField165, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGap(7, 7, 7)
                                                            .addComponent(jTextField166, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGap(7, 7, 7)
                                                            .addComponent(jTextField167, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGap(7, 7, 7)
                                                            .addComponent(jTextField168, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGap(25, 25, 25)
                                                            .addComponent(jTextField169, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGap(7, 7, 7)
                                                            .addComponent(jTextField170, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGap(7, 7, 7)
                                                            .addComponent(jTextField171, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGap(7, 7, 7)
                                                            .addComponent(jTextField172, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGap(7, 7, 7)
                                                            .addComponent(jTextField173, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGap(7, 7, 7)
                                                            .addComponent(jTextField174, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGap(7, 7, 7)
                                                            .addComponent(jTextField175, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGap(7, 7, 7)
                                                            .addComponent(jTextField176, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(jLabel13)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(jTextField177, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(9, 9, 9)
                                                                        .addComponent(jTextField178, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(7, 7, 7)
                                                                        .addComponent(jTextField179, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(7, 7, 7)
                                                                        .addComponent(jTextField180, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                    .addGroup(layout.createSequentialGroup()
                                                                        .addGap(38, 38, 38)
                                                                        .addComponent(jCheckBox177)
                                                                        .addGap(2, 2, 2)
                                                                        .addComponent(jCheckBox178)
                                                                        .addGap(0, 0, 0)
                                                                        .addComponent(jCheckBox179)
                                                                        .addGap(0, 0, 0)
                                                                        .addComponent(jCheckBox180)))
                                                                .addGroup(layout.createSequentialGroup()
                                                                    .addGap(38, 38, 38)
                                                                    .addComponent(jCheckBox161)
                                                                    .addGap(2, 2, 2)
                                                                    .addComponent(jCheckBox162)
                                                                    .addGap(0, 0, 0)
                                                                    .addComponent(jCheckBox163)
                                                                    .addGap(0, 0, 0)
                                                                    .addComponent(jCheckBox164)))
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                    .addComponent(jCheckBox165)
                                                                    .addGap(0, 0, 0)
                                                                    .addComponent(jCheckBox166)
                                                                    .addGap(0, 0, 0)
                                                                    .addComponent(jCheckBox167)
                                                                    .addGap(0, 0, 0)
                                                                    .addComponent(jCheckBox168)
                                                                    .addGap(18, 18, 18)
                                                                    .addComponent(jCheckBox169)
                                                                    .addGap(0, 0, 0)
                                                                    .addComponent(jCheckBox170)
                                                                    .addGap(0, 0, 0)
                                                                    .addComponent(jCheckBox171)
                                                                    .addGap(0, 0, 0)
                                                                    .addComponent(jCheckBox172)
                                                                    .addGap(0, 0, 0)
                                                                    .addComponent(jCheckBox173)
                                                                    .addGap(0, 0, 0)
                                                                    .addComponent(jCheckBox174)
                                                                    .addGap(0, 0, 0)
                                                                    .addComponent(jCheckBox175)
                                                                    .addGap(0, 0, 0)
                                                                    .addComponent(jCheckBox176))
                                                                .addGroup(layout.createSequentialGroup()
                                                                    .addGap(31, 31, 31)
                                                                    .addComponent(jLabel14)
                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                            .addComponent(jCheckBox181)
                                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                            .addComponent(jCheckBox182)
                                                                            .addGap(0, 0, 0)
                                                                            .addComponent(jCheckBox183)
                                                                            .addGap(0, 0, 0)
                                                                            .addComponent(jCheckBox184))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                            .addComponent(jTextField181, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                            .addComponent(jTextField182, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                            .addGap(7, 7, 7)
                                                                            .addComponent(jTextField183, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                            .addGap(7, 7, 7)
                                                                            .addComponent(jTextField184, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                            .addGap(26, 26, 26)
                                                                            .addComponent(jLabel17)))
                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                            .addGap(1, 1, 1)
                                                                            .addComponent(CarryC1))
                                                                        .addComponent(CarryT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(jTextField65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(6, 6, 6)
                                                .addComponent(jTextField66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(6, 6, 6)
                                                .addComponent(jTextField67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(6, 6, 6)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(SelectFileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jTextField68, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(6, 6, 6)
                                                        .addComponent(jTextField69, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(6, 6, 6)
                                                        .addComponent(jTextField70, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jLabel6))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(singlestepButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(iplButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(haltButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(runButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jLabel15))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(jLabel16)))
                .addGap(139, 139, 139))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(runButton)
                                            .addComponent(SelectFileButton))
                                        .addGap(18, 18, 18)
                                        .addComponent(haltButton)
                                        .addGap(18, 18, 18)
                                        .addComponent(iplButton)
                                        .addGap(18, 18, 18)
                                        .addComponent(singlestepButton))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(jLabel16)
                                        .addGap(4, 4, 4)
                                        .addComponent(ConsoleInputField, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel5)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox1)
                            .addComponent(jCheckBox2)
                            .addComponent(jCheckBox3)
                            .addComponent(jCheckBox4)
                            .addComponent(jCheckBox5)
                            .addComponent(jCheckBox6)
                            .addComponent(jCheckBox7)
                            .addComponent(jCheckBox8)
                            .addComponent(jCheckBox9)
                            .addComponent(jCheckBox10)
                            .addComponent(jCheckBox11)
                            .addComponent(jCheckBox12)
                            .addComponent(jCheckBox13)
                            .addComponent(jCheckBox14)
                            .addComponent(jCheckBox15)
                            .addComponent(jCheckBox16)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(370, 370, 370)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField73, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField72, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField74, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField75, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField76, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField71, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jCheckBox74)
                                        .addComponent(jCheckBox73, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jCheckBox75)
                                        .addComponent(jCheckBox76)
                                        .addGroup(layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jCheckBox72)
                                                .addComponent(jCheckBox71)))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField68, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField69, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField70, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jCheckBox65)
                                        .addComponent(jCheckBox70)
                                        .addComponent(jCheckBox69)
                                        .addComponent(jCheckBox68)
                                        .addComponent(jCheckBox67)
                                        .addComponent(jCheckBox66)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField186, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField187, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField188, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField189, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jCheckBox186)
                                        .addComponent(jCheckBox187)
                                        .addComponent(jCheckBox188)
                                        .addComponent(jCheckBox189))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel10))
                                    .addComponent(jTextField129, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField130, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField131, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField132, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField133, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField134, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField135, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField136, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField137, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField138, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField139, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField140, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField141, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField142, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField143, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField144, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox129)
                                    .addComponent(jCheckBox130)
                                    .addComponent(jCheckBox131)
                                    .addComponent(jCheckBox132)
                                    .addComponent(jCheckBox133)
                                    .addComponent(jCheckBox134)
                                    .addComponent(jCheckBox135)
                                    .addComponent(jCheckBox136)
                                    .addComponent(jCheckBox137)
                                    .addComponent(jCheckBox138)
                                    .addComponent(jCheckBox139)
                                    .addComponent(jCheckBox140)
                                    .addComponent(jCheckBox141)
                                    .addComponent(jCheckBox142)
                                    .addComponent(jCheckBox143)
                                    .addComponent(jCheckBox144))))))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(R1T1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(R1C1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(R1T2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(R1C2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(R1T3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(R1C3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(R1T4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(R1C4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(R1T5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(R1C5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(R1T6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(R1C6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(R1T7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(R1C7))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(R1T8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(R1C8))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(R1T9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(R1C9))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(R1T10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(R1C10))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(R1T11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(R1C11))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(R1T12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(R1C12))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(R1T13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(R1C13))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(R1T14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(R1C14))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(R1T15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(R1C15))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(R1T16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(R1C16))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel11))
                                    .addComponent(jTextField145, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField146, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField147, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField148, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField149, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField150, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField151, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField152, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField153, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField154, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField155, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField156, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField157, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField158, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField159, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField160, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox145)
                                    .addComponent(jCheckBox146)
                                    .addComponent(jCheckBox147)
                                    .addComponent(jCheckBox148)
                                    .addComponent(jCheckBox149)
                                    .addComponent(jCheckBox150)
                                    .addComponent(jCheckBox151)
                                    .addComponent(jCheckBox152)
                                    .addComponent(jCheckBox153)
                                    .addComponent(jCheckBox154)
                                    .addComponent(jCheckBox155)
                                    .addComponent(jCheckBox156)
                                    .addComponent(jCheckBox157)
                                    .addComponent(jCheckBox158)
                                    .addComponent(jCheckBox159)
                                    .addComponent(jCheckBox160)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField190, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField191, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField192, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField193, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox190)
                                    .addComponent(jCheckBox191)
                                    .addComponent(jCheckBox192)
                                    .addComponent(jCheckBox193))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel3)
                                        .addGap(50, 50, 50)
                                        .addComponent(jLabel4))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(R2T1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(5, 5, 5)
                                        .addComponent(R2C1)
                                        .addGap(18, 18, 18)
                                        .addComponent(R3T1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(R2T2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(5, 5, 5)
                                        .addComponent(R2C2)
                                        .addGap(18, 18, 18)
                                        .addComponent(R3T2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(R2T3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(R2T4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(R2T5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(5, 5, 5)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(R2C3)
                                            .addComponent(R2C4)
                                            .addComponent(R2C5))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(R3T3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(R3T4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(R3T5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(R2T6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(5, 5, 5)
                                        .addComponent(R2C6)
                                        .addGap(18, 18, 18)
                                        .addComponent(R3T6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(R2T7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(5, 5, 5)
                                        .addComponent(R2C7)
                                        .addGap(18, 18, 18)
                                        .addComponent(R3T7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(R2T8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(5, 5, 5)
                                        .addComponent(R2C8)
                                        .addGap(18, 18, 18)
                                        .addComponent(R3T8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(R2T9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(5, 5, 5)
                                        .addComponent(R2C9)
                                        .addGap(18, 18, 18)
                                        .addComponent(R3T9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(R2T10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(5, 5, 5)
                                        .addComponent(R2C10)
                                        .addGap(18, 18, 18)
                                        .addComponent(R3T10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(R2T11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(R2T12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(R2T13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(5, 5, 5)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(R2C11)
                                            .addComponent(R2C12)
                                            .addComponent(R2C13))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(R3T11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(R3T12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(R3T13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(R2T14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(5, 5, 5)
                                        .addComponent(R2C14)
                                        .addGap(18, 18, 18)
                                        .addComponent(R3T14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(R2T15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(5, 5, 5)
                                        .addComponent(R2C15)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(R3T15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(R3T16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(R3C1)
                                    .addComponent(R3C2)
                                    .addComponent(R3C3)
                                    .addComponent(R3C4)
                                    .addComponent(R3C5)
                                    .addComponent(R3C6)
                                    .addComponent(R3C7)
                                    .addComponent(R3C8)
                                    .addComponent(R3C9)
                                    .addComponent(R3C10)
                                    .addComponent(R3C11)
                                    .addComponent(R3C12)
                                    .addComponent(R3C13)
                                    .addComponent(R3C14)
                                    .addComponent(R3C15)
                                    .addComponent(R3C16))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel9))
                                    .addComponent(jTextField113, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField114, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField115, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField116, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField117, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField118, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField119, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField120, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField121, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField122, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField123, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField124, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField125, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField126, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField127, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField128, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox113)
                                    .addComponent(jCheckBox114)
                                    .addComponent(jCheckBox115)
                                    .addComponent(jCheckBox116)
                                    .addComponent(jCheckBox117)
                                    .addComponent(jCheckBox118)
                                    .addComponent(jCheckBox119)
                                    .addComponent(jCheckBox120)
                                    .addComponent(jCheckBox121)
                                    .addComponent(jCheckBox122)
                                    .addComponent(jCheckBox123)
                                    .addComponent(jCheckBox124)
                                    .addComponent(jCheckBox125)
                                    .addComponent(jCheckBox126)
                                    .addComponent(jCheckBox127)
                                    .addComponent(jCheckBox128)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(R2T16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(5, 5, 5)
                                        .addComponent(R2C16))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jTextField89, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel7))
                                            .addComponent(jTextField90, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField91, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField92, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField93, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jTextField94, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField96, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField95, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCheckBox89)
                                            .addComponent(jCheckBox91)
                                            .addComponent(jCheckBox93)
                                            .addComponent(jCheckBox92)
                                            .addComponent(jCheckBox90)
                                            .addComponent(jCheckBox94)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addComponent(jLabel12))
                                            .addComponent(jTextField161, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField162, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField163, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField164, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField165, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField166, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField167, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField168, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField169, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField170, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField171, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField172, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField173, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField174, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField175, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField176, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(5, 5, 5)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCheckBox161)
                                            .addComponent(jCheckBox162)
                                            .addComponent(jCheckBox163)
                                            .addComponent(jCheckBox164)
                                            .addComponent(jCheckBox165)
                                            .addComponent(jCheckBox166)
                                            .addComponent(jCheckBox167)
                                            .addComponent(jCheckBox168)
                                            .addComponent(jCheckBox169)
                                            .addComponent(jCheckBox170)
                                            .addComponent(jCheckBox171)
                                            .addComponent(jCheckBox172)
                                            .addComponent(jCheckBox173)
                                            .addComponent(jCheckBox174)
                                            .addComponent(jCheckBox175)
                                            .addComponent(jCheckBox176)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField97, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField98, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField99, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField100, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField194, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField195, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField196, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField197, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCheckBox194)
                                            .addComponent(jCheckBox195)
                                            .addComponent(jCheckBox196)
                                            .addComponent(jCheckBox197)
                                            .addComponent(jCheckBox100)
                                            .addComponent(jCheckBox97)
                                            .addComponent(jCheckBox99)
                                            .addComponent(jCheckBox98)
                                            .addComponent(jCheckBox96)
                                            .addComponent(jCheckBox95))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField101, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(5, 5, 5)
                                        .addComponent(jCheckBox101))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField102, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(5, 5, 5)
                                        .addComponent(jCheckBox102))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField103, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(5, 5, 5)
                                        .addComponent(jCheckBox103))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField104, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(5, 5, 5)
                                        .addComponent(jCheckBox104))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField105, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(5, 5, 5)
                                        .addComponent(jCheckBox105))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField106, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(5, 5, 5)
                                        .addComponent(jCheckBox106))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addComponent(jLabel13))
                                            .addComponent(jTextField177, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField178, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField179, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField180, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(5, 5, 5)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCheckBox177)
                                            .addComponent(jCheckBox178)
                                            .addComponent(jCheckBox179)
                                            .addComponent(jCheckBox180)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addComponent(jLabel14))
                                            .addComponent(jTextField181, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField182, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField183, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jTextField184, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel17)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCheckBox181)
                                            .addComponent(jCheckBox182)
                                            .addComponent(jCheckBox183)
                                            .addComponent(jCheckBox184)))
                                    .addComponent(jLabel8)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField107, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField108, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jTextField110, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField109, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jTextField111, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField112, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jCheckBox110)
                                            .addComponent(jCheckBox111)
                                            .addComponent(jCheckBox112)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jCheckBox107)
                                                .addComponent(jCheckBox108)
                                                .addComponent(jCheckBox109, javax.swing.GroupLayout.Alignment.TRAILING))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(CarryT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(CarryC1))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField77, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6))
                            .addComponent(jTextField78, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField79, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField80, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField81, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField82, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField83, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField84, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField85, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField86, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField87, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField88, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox77)
                            .addComponent(jCheckBox78)
                            .addComponent(jCheckBox79)
                            .addComponent(jCheckBox80)
                            .addComponent(jCheckBox81)
                            .addComponent(jCheckBox82)
                            .addComponent(jCheckBox83)
                            .addComponent(jCheckBox84)
                            .addComponent(jCheckBox85)
                            .addComponent(jCheckBox86)
                            .addComponent(jCheckBox87)
                            .addComponent(jCheckBox88)))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        GPR_changed[0] = true;
        changed = true;
        if (jCheckBox1.isSelected()) {
            jTextField1.setText("1");
        } else {
            jTextField1.setText("0");
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
        GPR_changed[0] = true;
        changed = true;
        if (jCheckBox2.isSelected()) {
            jTextField2.setText("1");
        } else {
            jTextField2.setText("0");
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
        GPR_changed[0] = true;
        changed = true;
        if (jCheckBox3.isSelected()) {
            jTextField3.setText("1");
        } else {
            jTextField3.setText("0");
        }
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        // TODO add your handling code here:
        GPR_changed[0] = true;
        changed = true;
        if (jCheckBox4.isSelected()) {
            jTextField4.setText("1");
        } else {
            jTextField4.setText("0");
        }
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
        // TODO add your handling code here:
        GPR_changed[0] = true;
        changed = true;
        if (jCheckBox5.isSelected()) {
            jTextField5.setText("1");
        } else {
            jTextField5.setText("0");
        }
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
        // TODO add your handling code here:
        GPR_changed[0] = true;
        changed = true;
        if (jCheckBox6.isSelected()) {
            jTextField6.setText("1");
        } else {
            jTextField6.setText("0");
        }
    }//GEN-LAST:event_jCheckBox6ActionPerformed

    private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox7ActionPerformed
        // TODO add your handling code here:
        GPR_changed[0] = true;
        changed = true;
        if (jCheckBox7.isSelected()) {
            jTextField7.setText("1");
        } else {
            jTextField7.setText("0");
        }
    }//GEN-LAST:event_jCheckBox7ActionPerformed

    private void jCheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox8ActionPerformed
        // TODO add your handling code here:
        GPR_changed[0] = true;
        changed = true;
        if (jCheckBox8.isSelected()) {
            jTextField8.setText("1");
        } else {
            jTextField8.setText("0");
        }
    }//GEN-LAST:event_jCheckBox8ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jCheckBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox9ActionPerformed
        // TODO add your handling code here:
        GPR_changed[0] = true;
        changed = true;
        if (jCheckBox9.isSelected()) {
            jTextField9.setText("1");
        } else {
            jTextField9.setText("0");
        }
    }//GEN-LAST:event_jCheckBox9ActionPerformed

    private void jCheckBox10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox10ActionPerformed
        // TODO add your handling code here:
        GPR_changed[0] = true;
        changed = true;
        if (jCheckBox10.isSelected()) {
            jTextField10.setText("1");
        } else {
            jTextField10.setText("0");
        }
    }//GEN-LAST:event_jCheckBox10ActionPerformed

    private void jCheckBox11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox11ActionPerformed
        // TODO add your handling code here:
        GPR_changed[0] = true;
        changed = true;
        if (jCheckBox11.isSelected()) {
            jTextField11.setText("1");
        } else {
            jTextField11.setText("0");
        }
    }//GEN-LAST:event_jCheckBox11ActionPerformed

    private void jCheckBox12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox12ActionPerformed
        // TODO add your handling code here:
        GPR_changed[0] = true;
        changed = true;
        if (jCheckBox12.isSelected()) {
            jTextField12.setText("1");
        } else {
            jTextField12.setText("0");
        }
    }//GEN-LAST:event_jCheckBox12ActionPerformed

    private void jCheckBox13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox13ActionPerformed
        // TODO add your handling code here:
        GPR_changed[0] = true;
        changed = true;
        if (jCheckBox13.isSelected()) {
            jTextField13.setText("1");
        } else {
            jTextField13.setText("0");
        }
    }//GEN-LAST:event_jCheckBox13ActionPerformed

    private void jCheckBox14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox14ActionPerformed
        // TODO add your handling code here:
        GPR_changed[0] = true;
        changed = true;
        if (jCheckBox14.isSelected()) {
            jTextField14.setText("1");
        } else {
            jTextField14.setText("0");
        }
    }//GEN-LAST:event_jCheckBox14ActionPerformed

    private void jCheckBox15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox15ActionPerformed
        // TODO add your handling code here:
        GPR_changed[0] = true;
        changed = true;
        if (jCheckBox15.isSelected()) {
            jTextField15.setText("1");
        } else {
            jTextField15.setText("0");
        }
    }//GEN-LAST:event_jCheckBox15ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jCheckBox16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox16ActionPerformed
        // TODO add your handling code here:
        GPR_changed[0] = true;
        changed = true;
        if (jCheckBox16.isSelected()) {
            jTextField16.setText("1");
        } else {
            jTextField16.setText("0");
        }
    }//GEN-LAST:event_jCheckBox16ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField15ActionPerformed

    private void jTextField16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField16ActionPerformed

    private void R1C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1C1ActionPerformed
        GPR_changed[1] = true;
        changed = true;
        if (R1C1.isSelected()) {
            R1T1.setText("1");
        } else {
            R1T1.setText("0");
        }
    }//GEN-LAST:event_R1C1ActionPerformed

    private void R1C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1C2ActionPerformed
        GPR_changed[1] = true;
        changed = true;
        if (R1C2.isSelected()) {
            R1T2.setText("1");
        } else {
            R1T2.setText("0");
        }
    }//GEN-LAST:event_R1C2ActionPerformed

    private void R1C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1C3ActionPerformed
        GPR_changed[1] = true;
        changed = true;
        if (R1C3.isSelected()) {
            R1T3.setText("1");
        } else {
            R1T3.setText("0");
        }
    }//GEN-LAST:event_R1C3ActionPerformed

    private void R1C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1C4ActionPerformed
        GPR_changed[1] = true;
        changed = true;
        if (R1C4.isSelected()) {
            R1T4.setText("1");
        } else {
            R1T4.setText("0");
        }
    }//GEN-LAST:event_R1C4ActionPerformed

    private void R1C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1C5ActionPerformed
        GPR_changed[1] = true;
        changed = true;
        if (R1C5.isSelected()) {
            R1T5.setText("1");
        } else {
            R1T5.setText("0");
        }
    }//GEN-LAST:event_R1C5ActionPerformed

    private void R1C6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1C6ActionPerformed
        GPR_changed[1] = true;
        changed = true;
        if (R1C6.isSelected()) {
            R1T6.setText("1");
        } else {
            R1T6.setText("0");
        }
    }//GEN-LAST:event_R1C6ActionPerformed

    private void R1C7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1C7ActionPerformed
        GPR_changed[1] = true;
        changed = true;
        if (R1C7.isSelected()) {
            R1T7.setText("1");
        } else {
            R1T7.setText("0");
        }
    }//GEN-LAST:event_R1C7ActionPerformed

    private void R1C13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1C13ActionPerformed
        GPR_changed[1] = true;
        changed = true;
        if (R1C13.isSelected()) {
            R1T13.setText("1");
        } else {
            R1T13.setText("0");
        }
    }//GEN-LAST:event_R1C13ActionPerformed

    private void R1C12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1C12ActionPerformed
        GPR_changed[1] = true;
        changed = true;
        if (R1C12.isSelected()) {
            R1T12.setText("1");
        } else {
            R1T12.setText("0");
        }
    }//GEN-LAST:event_R1C12ActionPerformed

    private void R1C11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1C11ActionPerformed
        GPR_changed[1] = true;
        changed = true;
        if (R1C11.isSelected()) {
            R1T11.setText("1");
        } else {
            R1T11.setText("0");
        }
    }//GEN-LAST:event_R1C11ActionPerformed

    private void R1C10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1C10ActionPerformed
        // TODO add your handling code here:
        GPR_changed[1] = true;
        changed = true;
        if (R1C10.isSelected()) {
            R1T10.setText("1");
        } else {
            R1T10.setText("0");
        }
    }//GEN-LAST:event_R1C10ActionPerformed

    private void R1C9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1C9ActionPerformed
        // TODO add your handling code here:
        GPR_changed[1] = true;
        changed = true;
        if (R1C9.isSelected()) {
            R1T9.setText("1");
        } else {
            R1T9.setText("0");
        }
    }//GEN-LAST:event_R1C9ActionPerformed

    private void R1T8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1T8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R1T8ActionPerformed

    private void R1C8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1C8ActionPerformed
        GPR_changed[1] = true;
        changed = true;
        if (R1C8.isSelected()) {
            R1T8.setText("1");
        } else {
            R1T8.setText("0");
        }
    }//GEN-LAST:event_R1C8ActionPerformed

    private void R1T15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1T15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R1T15ActionPerformed

    private void R1T14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1T14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R1T14ActionPerformed

    private void R1T13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1T13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R1T13ActionPerformed

    private void R1T12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1T12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R1T12ActionPerformed

    private void R1T11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1T11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R1T11ActionPerformed

    private void R1T10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1T10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R1T10ActionPerformed

    private void R1T9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1T9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R1T9ActionPerformed

    private void R1C16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1C16ActionPerformed
        GPR_changed[1] = true;
        changed = true;
        if (R1C16.isSelected()) {
            R1T16.setText("1");
        } else {
            R1T16.setText("0");
        }
    }//GEN-LAST:event_R1C16ActionPerformed

    private void R1T16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1T16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R1T16ActionPerformed

    private void R1C15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1C15ActionPerformed
        GPR_changed[1] = true;
        changed = true;
        if (R1C15.isSelected()) {
            R1T15.setText("1");
        } else {
            R1T15.setText("0");
        }
    }//GEN-LAST:event_R1C15ActionPerformed

    private void R1C14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1C14ActionPerformed
        GPR_changed[1] = true;
        changed = true;
        if (R1C14.isSelected()) {
            R1T14.setText("1");
        } else {
            R1T14.setText("0");
        }
    }//GEN-LAST:event_R1C14ActionPerformed

    private void R1T1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1T1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R1T1ActionPerformed

    private void R1T2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1T2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R1T2ActionPerformed

    private void R1T3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1T3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R1T3ActionPerformed

    private void R1T4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1T4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R1T4ActionPerformed

    private void R1T5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1T5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R1T5ActionPerformed

    private void R1T6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1T6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R1T6ActionPerformed

    private void R1T7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1T7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R1T7ActionPerformed

    private void R2C10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2C10ActionPerformed
        GPR_changed[2] = true;
        changed = true;
        if (R2C10.isSelected()) {
            R2T10.setText("1");
        } else {
            R2T10.setText("0");
        }
    }//GEN-LAST:event_R2C10ActionPerformed

    private void R2C11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2C11ActionPerformed
        GPR_changed[2] = true;
        changed = true;
        if (R2C11.isSelected()) {
            R2T11.setText("1");
        } else {
            R2T11.setText("0");
        }
    }//GEN-LAST:event_R2C11ActionPerformed

    private void R2C12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2C12ActionPerformed
        GPR_changed[2] = true;
        changed = true;
        if (R2C12.isSelected()) {
            R2T12.setText("1");
        } else {
            R2T12.setText("0");
        }
    }//GEN-LAST:event_R2C12ActionPerformed

    private void R2C13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2C13ActionPerformed
        GPR_changed[2] = true;
        changed = true;
        if (R2C13.isSelected()) {
            R2T13.setText("1");
        } else {
            R2T13.setText("0");
        }
    }//GEN-LAST:event_R2C13ActionPerformed

    private void R2C7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2C7ActionPerformed
        GPR_changed[2] = true;
        changed = true;
        if (R2C7.isSelected()) {
            R2T7.setText("1");
        } else {
            R2T7.setText("0");
        }
    }//GEN-LAST:event_R2C7ActionPerformed

    private void R2C6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2C6ActionPerformed
        GPR_changed[2] = true;
        changed = true;
        if (R2C6.isSelected()) {
            R2T6.setText("1");
        } else {
            R2T6.setText("0");
        }
    }//GEN-LAST:event_R2C6ActionPerformed

    private void R2C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2C5ActionPerformed
        GPR_changed[2] = true;
        changed = true;
        if (R2C5.isSelected()) {
            R2T5.setText("1");
        } else {
            R2T5.setText("0");
        }
    }//GEN-LAST:event_R2C5ActionPerformed

    private void R2C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2C4ActionPerformed
        GPR_changed[2] = true;
        changed = true;
        if (R2C4.isSelected()) {
            R2T4.setText("1");
        } else {
            R2T4.setText("0");
        }
    }//GEN-LAST:event_R2C4ActionPerformed

    private void R2C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2C3ActionPerformed
        GPR_changed[2] = true;
        changed = true;
        if (R2C3.isSelected()) {
            R2T3.setText("1");
        } else {
            R2T3.setText("0");
        }
    }//GEN-LAST:event_R2C3ActionPerformed

    private void R2C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2C2ActionPerformed
        GPR_changed[2] = true;
        changed = true;
        if (R2C2.isSelected()) {
            R2T2.setText("1");
        } else {
            R2T2.setText("0");
        }
    }//GEN-LAST:event_R2C2ActionPerformed

    private void R2C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2C1ActionPerformed
        GPR_changed[2] = true;
        changed = true;
        if (R2C1.isSelected()) {
            R2T1.setText("1");
        } else {
            R2T1.setText("0");
        }
    }//GEN-LAST:event_R2C1ActionPerformed

    private void R2C16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2C16ActionPerformed
        GPR_changed[2] = true;
        changed = true;
        if (R2C16.isSelected()) {
            R2T16.setText("1");
        } else {
            R2T16.setText("0");
        }
    }//GEN-LAST:event_R2C16ActionPerformed

    private void R2T9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2T9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R2T9ActionPerformed

    private void R2T10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2T10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R2T10ActionPerformed

    private void R2T11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2T11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R2T11ActionPerformed

    private void R2T12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2T12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R2T12ActionPerformed

    private void R2T13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2T13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R2T13ActionPerformed

    private void R2T14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2T14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R2T14ActionPerformed

    private void R2T15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2T15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R2T15ActionPerformed

    private void R2C8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2C8ActionPerformed
        GPR_changed[2] = true;
        changed = true;
        if (R2C8.isSelected()) {
            R2T8.setText("1");
        } else {
            R2T8.setText("0");
        }
    }//GEN-LAST:event_R2C8ActionPerformed

    private void R2T8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2T8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R2T8ActionPerformed

    private void R2C9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2C9ActionPerformed
        GPR_changed[2] = true;
        changed = true;
        if (R2C9.isSelected()) {
            R2T9.setText("1");
        } else {
            R2T9.setText("0");
        }
    }//GEN-LAST:event_R2C9ActionPerformed

    private void R2C14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2C14ActionPerformed
        GPR_changed[2] = true;
        changed = true;
        if (R2C14.isSelected()) {
            R2T14.setText("1");
        } else {
            R2T14.setText("0");
        }
    }//GEN-LAST:event_R2C14ActionPerformed

    private void R2T7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2T7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R2T7ActionPerformed

    private void R2T6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2T6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R2T6ActionPerformed

    private void R2T5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2T5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R2T5ActionPerformed

    private void R2T4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2T4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R2T4ActionPerformed

    private void R2T3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2T3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R2T3ActionPerformed

    private void R2T2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2T2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R2T2ActionPerformed

    private void R2T1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2T1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R2T1ActionPerformed

    private void R2C15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2C15ActionPerformed
        GPR_changed[2] = true;
        changed = true;
        if (R2C15.isSelected()) {
            R2T15.setText("1");
        } else {
            R2T15.setText("0");
        }
    }//GEN-LAST:event_R2C15ActionPerformed

    private void R2T16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2T16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R2T16ActionPerformed

    private void R3T9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3T9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R3T9ActionPerformed

    private void R3T10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3T10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R3T10ActionPerformed

    private void R3T14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3T14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R3T14ActionPerformed

    private void R3T7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3T7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R3T7ActionPerformed

    private void R3C16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3C16ActionPerformed
        GPR_changed[3] = true;
        changed = true;
        if (R3C16.isSelected()) {
            R3T16.setText("1");
        } else {
            R3T16.setText("0");
        }
    }//GEN-LAST:event_R3C16ActionPerformed

    private void R3T13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3T13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R3T13ActionPerformed

    private void R3C15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3C15ActionPerformed
        GPR_changed[3] = true;
        changed = true;
        if (R3C15.isSelected()) {
            R3T15.setText("1");
        } else {
            R3T15.setText("0");
        }
    }//GEN-LAST:event_R3C15ActionPerformed

    private void R3T3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3T3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R3T3ActionPerformed

    private void R3T11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3T11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R3T11ActionPerformed

    private void R3C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3C1ActionPerformed
        GPR_changed[3] = true;
        changed = true;
        if (R3C1.isSelected()) {
            R3T1.setText("1");
        } else {
            R3T1.setText("0");
        }
    }//GEN-LAST:event_R3C1ActionPerformed

    private void R3C9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3C9ActionPerformed
        GPR_changed[3] = true;
        changed = true;
        if (R3C9.isSelected()) {
            R3T9.setText("1");
        } else {
            R3T9.setText("0");
        }
    }//GEN-LAST:event_R3C9ActionPerformed

    private void R3C12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3C12ActionPerformed
        GPR_changed[3] = true;
        changed = true;
        if (R3C12.isSelected()) {
            R3T12.setText("1");
        } else {
            R3T12.setText("0");
        }
    }//GEN-LAST:event_R3C12ActionPerformed

    private void R3C13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3C13ActionPerformed
        GPR_changed[3] = true;
        changed = true;
        if (R3C13.isSelected()) {
            R3T13.setText("1");
        } else {
            R3T13.setText("0");
        }
    }//GEN-LAST:event_R3C13ActionPerformed

    private void R3C14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3C14ActionPerformed
        GPR_changed[3] = true;
        changed = true;
        if (R3C14.isSelected()) {
            R3T14.setText("1");
        } else {
            R3T14.setText("0");
        }
    }//GEN-LAST:event_R3C14ActionPerformed

    private void R3T12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3T12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R3T12ActionPerformed

    private void R3T6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3T6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R3T6ActionPerformed

    private void R3T5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3T5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R3T5ActionPerformed

    private void R3C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3C4ActionPerformed
        GPR_changed[3] = true;
        changed = true;
        if (R3C4.isSelected()) {
            R3T4.setText("1");
        } else {
            R3T4.setText("0");
        }
    }//GEN-LAST:event_R3C4ActionPerformed

    private void R3C10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3C10ActionPerformed
        GPR_changed[3] = true;
        changed = true;
        if (R3C10.isSelected()) {
            R3T10.setText("1");
        } else {
            R3T10.setText("0");
        }
    }//GEN-LAST:event_R3C10ActionPerformed

    private void R3C7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3C7ActionPerformed
        GPR_changed[3] = true;
        changed = true;
        if (R3C7.isSelected()) {
            R3T7.setText("1");
        } else {
            R3T7.setText("0");
        }
    }//GEN-LAST:event_R3C7ActionPerformed

    private void R3C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3C2ActionPerformed
        GPR_changed[3] = true;
        changed = true;
        if (R3C2.isSelected()) {
            R3T2.setText("1");
        } else {
            R3T2.setText("0");
        }
    }//GEN-LAST:event_R3C2ActionPerformed

    private void R3T15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3T15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R3T15ActionPerformed

    private void R3C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3C5ActionPerformed
        GPR_changed[3] = true;
        changed = true;
        if (R3C5.isSelected()) {
            R3T5.setText("1");
        } else {
            R3T5.setText("0");
        }
    }//GEN-LAST:event_R3C5ActionPerformed

    private void R3C8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3C8ActionPerformed
        GPR_changed[3] = true;
        changed = true;
        if (R3C8.isSelected()) {
            R3T8.setText("1");
        } else {
            R3T8.setText("0");
        }
    }//GEN-LAST:event_R3C8ActionPerformed

    private void R3T8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3T8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R3T8ActionPerformed

    private void R3T2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3T2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R3T2ActionPerformed

    private void R3C6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3C6ActionPerformed
        GPR_changed[3] = true;
        changed = true;
        if (R3C6.isSelected()) {
            R3T6.setText("1");
        } else {
            R3T6.setText("0");
        }
    }//GEN-LAST:event_R3C6ActionPerformed

    private void R3T16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3T16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R3T16ActionPerformed

    private void R3C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3C3ActionPerformed
        GPR_changed[3] = true;
        changed = true;
        if (R3C3.isSelected()) {
            R3T3.setText("1");
        } else {
            R3T3.setText("0");
        }
    }//GEN-LAST:event_R3C3ActionPerformed

    private void R3T1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3T1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R3T1ActionPerformed

    private void R3T4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3T4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R3T4ActionPerformed

    private void R3C11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3C11ActionPerformed
        GPR_changed[3] = true;
        changed = true;
        if (R3C11.isSelected()) {
            R3T11.setText("1");
        } else {
            R3T11.setText("0");
        }
    }//GEN-LAST:event_R3C11ActionPerformed

    private void jCheckBox65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox65ActionPerformed
        XR_changed[0] = true;
        changed = true;
        if (jCheckBox65.isSelected()) {
            jTextField65.setText("1");
        } else {
            jTextField65.setText("0");
        }
    }//GEN-LAST:event_jCheckBox65ActionPerformed

    private void jTextField65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField65ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField65ActionPerformed

    private void jCheckBox66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox66ActionPerformed
        XR_changed[0] = true;
        changed = true;
        if (jCheckBox66.isSelected()) {
            jTextField66.setText("1");
        } else {
            jTextField66.setText("0");
        }
    }//GEN-LAST:event_jCheckBox66ActionPerformed

    private void jTextField66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField66ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField66ActionPerformed

    private void jCheckBox67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox67ActionPerformed
        XR_changed[0] = true;
        changed = true;
        if (jCheckBox67.isSelected()) {
            jTextField67.setText("1");
        } else {
            jTextField67.setText("0");
        }
    }//GEN-LAST:event_jCheckBox67ActionPerformed

    private void jTextField67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField67ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField67ActionPerformed

    private void jCheckBox68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox68ActionPerformed
        XR_changed[0] = true;
        changed = true;
        if (jCheckBox68.isSelected()) {
            jTextField68.setText("1");
        } else {
            jTextField68.setText("0");
        }
    }//GEN-LAST:event_jCheckBox68ActionPerformed

    private void jTextField68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField68ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField68ActionPerformed

    private void jCheckBox69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox69ActionPerformed
        XR_changed[0] = true;
        changed = true;
        if (jCheckBox69.isSelected()) {
            jTextField69.setText("1");
        } else {
            jTextField69.setText("0");
        }
    }//GEN-LAST:event_jCheckBox69ActionPerformed

    private void jTextField69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField69ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField69ActionPerformed

    private void jCheckBox70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox70ActionPerformed
        XR_changed[0] = true;
        changed = true;
        if (jCheckBox70.isSelected()) {
            jTextField70.setText("1");
        } else {
            jTextField70.setText("0");
        }
    }//GEN-LAST:event_jCheckBox70ActionPerformed

    private void jTextField70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField70ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField70ActionPerformed

    private void jCheckBox71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox71ActionPerformed
        XR_changed[0] = true;
        changed = true;
        if (jCheckBox71.isSelected()) {
            jTextField71.setText("1");
        } else {
            jTextField71.setText("0");
        }
    }//GEN-LAST:event_jCheckBox71ActionPerformed

    private void jTextField71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField71ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField71ActionPerformed

    private void jCheckBox72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox72ActionPerformed
        XR_changed[0] = true;
        changed = true;
        if (jCheckBox72.isSelected()) {
            jTextField72.setText("1");
        } else {
            jTextField72.setText("0");
        }
    }//GEN-LAST:event_jCheckBox72ActionPerformed

    private void jTextField72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField72ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField72ActionPerformed

    private void jCheckBox73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox73ActionPerformed
        XR_changed[0] = true;
        changed = true;
        if (jCheckBox73.isSelected()) {
            jTextField73.setText("1");
        } else {
            jTextField73.setText("0");
        }
    }//GEN-LAST:event_jCheckBox73ActionPerformed

    private void jTextField73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField73ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField73ActionPerformed

    private void jCheckBox74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox74ActionPerformed
        XR_changed[0] = true;
        changed = true;
        if (jCheckBox74.isSelected()) {
            jTextField74.setText("1");
        } else {
            jTextField74.setText("0");
        }
    }//GEN-LAST:event_jCheckBox74ActionPerformed

    private void jTextField74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField74ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField74ActionPerformed

    private void jCheckBox75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox75ActionPerformed
        XR_changed[0] = true;
        changed = true;
        if (jCheckBox75.isSelected()) {
            jTextField75.setText("1");
        } else {
            jTextField75.setText("0");
        }
    }//GEN-LAST:event_jCheckBox75ActionPerformed

    private void jTextField75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField75ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField75ActionPerformed

    private void jCheckBox76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox76ActionPerformed
        XR_changed[0] = true;
        changed = true;
        if (jCheckBox76.isSelected()) {
            jTextField76.setText("1");
        } else {
            jTextField76.setText("0");
        }
    }//GEN-LAST:event_jCheckBox76ActionPerformed

    private void jTextField76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField76ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField76ActionPerformed

    private void jCheckBox77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox77ActionPerformed
        XR_changed[1] = true;
        changed = true;
        if (jCheckBox77.isSelected()) {
            jTextField77.setText("1");
        } else {
            jTextField77.setText("0");
        }
    }//GEN-LAST:event_jCheckBox77ActionPerformed

    private void jTextField77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField77ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField77ActionPerformed

    private void jCheckBox78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox78ActionPerformed
        XR_changed[1] = true;
        changed = true;
        if (jCheckBox78.isSelected()) {
            jTextField78.setText("1");
        } else {
            jTextField78.setText("0");
        }
    }//GEN-LAST:event_jCheckBox78ActionPerformed

    private void jTextField78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField78ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField78ActionPerformed

    private void jCheckBox79ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox79ActionPerformed
        XR_changed[1] = true;
        changed = true;
        if (jCheckBox79.isSelected()) {
            jTextField79.setText("1");
        } else {
            jTextField79.setText("0");
        }
    }//GEN-LAST:event_jCheckBox79ActionPerformed

    private void jTextField79ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField79ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField79ActionPerformed

    private void jCheckBox80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox80ActionPerformed
        XR_changed[1] = true;
        changed = true;
        if (jCheckBox80.isSelected()) {
            jTextField80.setText("1");
        } else {
            jTextField80.setText("0");
        }
    }//GEN-LAST:event_jCheckBox80ActionPerformed

    private void jTextField80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField80ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField80ActionPerformed

    private void jCheckBox81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox81ActionPerformed
        XR_changed[1] = true;
        changed = true;
        if (jCheckBox81.isSelected()) {
            jTextField81.setText("1");
        } else {
            jTextField81.setText("0");
        }
    }//GEN-LAST:event_jCheckBox81ActionPerformed

    private void jTextField81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField81ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField81ActionPerformed

    private void jCheckBox82ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox82ActionPerformed
        XR_changed[1] = true;
        changed = true;
        if (jCheckBox82.isSelected()) {
            jTextField82.setText("1");
        } else {
            jTextField82.setText("0");
        }
    }//GEN-LAST:event_jCheckBox82ActionPerformed

    private void jTextField82ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField82ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField82ActionPerformed

    private void jCheckBox83ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox83ActionPerformed
        XR_changed[1] = true;
        changed = true;
        if (jCheckBox83.isSelected()) {
            jTextField83.setText("1");
        } else {
            jTextField83.setText("0");
        }
    }//GEN-LAST:event_jCheckBox83ActionPerformed

    private void jTextField83ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField83ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField83ActionPerformed

    private void jCheckBox84ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox84ActionPerformed
        XR_changed[1] = true;
        changed = true;
        if (jCheckBox84.isSelected()) {
            jTextField84.setText("1");
        } else {
            jTextField84.setText("0");
        }
    }//GEN-LAST:event_jCheckBox84ActionPerformed

    private void jTextField84ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField84ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField84ActionPerformed

    private void jCheckBox85ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox85ActionPerformed
        XR_changed[1] = true;
        changed = true;
        if (jCheckBox85.isSelected()) {
            jTextField85.setText("1");
        } else {
            jTextField85.setText("0");
        }
    }//GEN-LAST:event_jCheckBox85ActionPerformed

    private void jTextField85ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField85ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField85ActionPerformed

    private void jCheckBox86ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox86ActionPerformed
        XR_changed[1] = true;
        changed = true;
        if (jCheckBox86.isSelected()) {
            jTextField86.setText("1");
        } else {
            jTextField86.setText("0");
        }
    }//GEN-LAST:event_jCheckBox86ActionPerformed

    private void jTextField86ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField86ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField86ActionPerformed

    private void jCheckBox87ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox87ActionPerformed
        XR_changed[1] = true;
        changed = true;
        if (jCheckBox87.isSelected()) {
            jTextField87.setText("1");
        } else {
            jTextField87.setText("0");
        }
    }//GEN-LAST:event_jCheckBox87ActionPerformed

    private void jTextField87ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField87ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField87ActionPerformed

    private void jCheckBox88ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox88ActionPerformed
        XR_changed[1] = true;
        changed = true;
        if (jCheckBox88.isSelected()) {
            jTextField88.setText("1");
        } else {
            jTextField88.setText("0");
        }
    }//GEN-LAST:event_jCheckBox88ActionPerformed

    private void jTextField88ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField88ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField88ActionPerformed

    private void jCheckBox89ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox89ActionPerformed
        XR_changed[2] = true;
        changed = true;
        if (jCheckBox89.isSelected()) {
            jTextField89.setText("1");
        } else {
            jTextField89.setText("0");
        }
    }//GEN-LAST:event_jCheckBox89ActionPerformed

    private void jTextField89ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField89ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField89ActionPerformed

    private void jCheckBox90ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox90ActionPerformed
        XR_changed[2] = true;
        changed = true;
        if (jCheckBox90.isSelected()) {
            jTextField90.setText("1");
        } else {
            jTextField90.setText("0");
        }
    }//GEN-LAST:event_jCheckBox90ActionPerformed

    private void jTextField90ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField90ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField90ActionPerformed

    private void jCheckBox91ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox91ActionPerformed
        XR_changed[2] = true;
        changed = true;
        if (jCheckBox91.isSelected()) {
            jTextField91.setText("1");
        } else {
            jTextField91.setText("0");
        }
    }//GEN-LAST:event_jCheckBox91ActionPerformed

    private void jTextField91ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField91ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField91ActionPerformed

    private void jCheckBox92ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox92ActionPerformed
        XR_changed[2] = true;
        changed = true;
        if (jCheckBox92.isSelected()) {
            jTextField92.setText("1");
        } else {
            jTextField92.setText("0");
        }
    }//GEN-LAST:event_jCheckBox92ActionPerformed

    private void jTextField92ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField92ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField92ActionPerformed

    private void jCheckBox93ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox93ActionPerformed
        XR_changed[2] = true;
        changed = true;
        if (jCheckBox93.isSelected()) {
            jTextField93.setText("1");
        } else {
            jTextField93.setText("0");
        }
    }//GEN-LAST:event_jCheckBox93ActionPerformed

    private void jTextField93ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField93ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField93ActionPerformed

    private void jCheckBox94ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox94ActionPerformed
        XR_changed[2] = true;
        changed = true;
        if (jCheckBox94.isSelected()) {
            jTextField94.setText("1");
        } else {
            jTextField94.setText("0");
        }
    }//GEN-LAST:event_jCheckBox94ActionPerformed

    private void jTextField94ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField94ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField94ActionPerformed

    private void jCheckBox95ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox95ActionPerformed
        XR_changed[2] = true;
        changed = true;
        if (jCheckBox95.isSelected()) {
            jTextField95.setText("1");
        } else {
            jTextField95.setText("0");
        }
    }//GEN-LAST:event_jCheckBox95ActionPerformed

    private void jTextField95ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField95ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField95ActionPerformed

    private void jCheckBox96ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox96ActionPerformed
        XR_changed[2] = true;
        changed = true;
        if (jCheckBox96.isSelected()) {
            jTextField96.setText("1");
        } else {
            jTextField96.setText("0");
        }
    }//GEN-LAST:event_jCheckBox96ActionPerformed

    private void jTextField96ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField96ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField96ActionPerformed

    private void jCheckBox97ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox97ActionPerformed
        XR_changed[2] = true;
        changed = true;
        if (jCheckBox97.isSelected()) {
            jTextField97.setText("1");
        } else {
            jTextField97.setText("0");
        }
    }//GEN-LAST:event_jCheckBox97ActionPerformed

    private void jTextField97ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField97ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField97ActionPerformed

    private void jCheckBox98ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox98ActionPerformed
        XR_changed[2] = true;
        changed = true;
        if (jCheckBox98.isSelected()) {
            jTextField98.setText("1");
        } else {
            jTextField98.setText("0");
        }
    }//GEN-LAST:event_jCheckBox98ActionPerformed

    private void jTextField98ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField98ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField98ActionPerformed

    private void jCheckBox99ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox99ActionPerformed
        XR_changed[2] = true;
        changed = true;
        if (jCheckBox99.isSelected()) {
            jTextField99.setText("1");
        } else {
            jTextField99.setText("0");
        }
    }//GEN-LAST:event_jCheckBox99ActionPerformed

    private void jTextField99ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField99ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField99ActionPerformed

    private void jCheckBox100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox100ActionPerformed
        XR_changed[2] = true;
        changed = true;
        if (jCheckBox100.isSelected()) {
            jTextField100.setText("1");
        } else {
            jTextField100.setText("0");
        }
    }//GEN-LAST:event_jCheckBox100ActionPerformed

    private void jTextField100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField100ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField100ActionPerformed

    private void jCheckBox101ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox101ActionPerformed
        PC_changed = true;
        changed = true;
        if (jCheckBox101.isSelected()) {
            jTextField101.setText("1");
        } else {
            jTextField101.setText("0");
        }
    }//GEN-LAST:event_jCheckBox101ActionPerformed

    private void jTextField101ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField101ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField101ActionPerformed

    private void jCheckBox102ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox102ActionPerformed
        PC_changed = true;
        changed = true;
        if (jCheckBox102.isSelected()) {
            jTextField102.setText("1");
        } else {
            jTextField102.setText("0");
        }
    }//GEN-LAST:event_jCheckBox102ActionPerformed

    private void jTextField102ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField102ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField102ActionPerformed

    private void jCheckBox103ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox103ActionPerformed
        PC_changed = true;
        changed = true;
        if (jCheckBox103.isSelected()) {
            jTextField103.setText("1");
        } else {
            jTextField103.setText("0");
        }
    }//GEN-LAST:event_jCheckBox103ActionPerformed

    private void jTextField103ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField103ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField103ActionPerformed

    private void jCheckBox104ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox104ActionPerformed
        PC_changed = true;
        changed = true;
        if (jCheckBox104.isSelected()) {
            jTextField104.setText("1");
        } else {
            jTextField104.setText("0");
        }
    }//GEN-LAST:event_jCheckBox104ActionPerformed

    private void jTextField104ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField104ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField104ActionPerformed

    private void jCheckBox105ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox105ActionPerformed
        PC_changed = true;
        changed = true;
        if (jCheckBox105.isSelected()) {
            jTextField105.setText("1");
        } else {
            jTextField105.setText("0");
        }
    }//GEN-LAST:event_jCheckBox105ActionPerformed

    private void jTextField105ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField105ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField105ActionPerformed

    private void jCheckBox106ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox106ActionPerformed
        PC_changed = true;
        changed = true;
        if (jCheckBox106.isSelected()) {
            jTextField106.setText("1");
        } else {
            jTextField106.setText("0");
        }
    }//GEN-LAST:event_jCheckBox106ActionPerformed

    private void jTextField106ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField106ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField106ActionPerformed

    private void jCheckBox107ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox107ActionPerformed
        PC_changed = true;
        changed = true;
        if (jCheckBox107.isSelected()) {
            jTextField107.setText("1");
        } else {
            jTextField107.setText("0");
        }
    }//GEN-LAST:event_jCheckBox107ActionPerformed

    private void jTextField107ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField107ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField107ActionPerformed

    private void jCheckBox108ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox108ActionPerformed
        PC_changed = true;
        changed = true;
        if (jCheckBox108.isSelected()) {
            jTextField108.setText("1");
        } else {
            jTextField108.setText("0");
        }
    }//GEN-LAST:event_jCheckBox108ActionPerformed

    private void jTextField108ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField108ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField108ActionPerformed

    private void jCheckBox109ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox109ActionPerformed
        PC_changed = true;
        changed = true;
        if (jCheckBox109.isSelected()) {
            jTextField109.setText("1");
        } else {
            jTextField109.setText("0");
        }
    }//GEN-LAST:event_jCheckBox109ActionPerformed

    private void jTextField109ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField109ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField109ActionPerformed

    private void jCheckBox110ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox110ActionPerformed
        PC_changed = true;
        changed = true;
        if (jCheckBox110.isSelected()) {
            jTextField110.setText("1");
        } else {
            jTextField110.setText("0");
        }
    }//GEN-LAST:event_jCheckBox110ActionPerformed

    private void jTextField110ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField110ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField110ActionPerformed

    private void jCheckBox111ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox111ActionPerformed
        PC_changed = true;
        changed = true;
        if (jCheckBox111.isSelected()) {
            jTextField111.setText("1");
        } else {
            jTextField111.setText("0");
        }
    }//GEN-LAST:event_jCheckBox111ActionPerformed

    private void jTextField111ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField111ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField111ActionPerformed

    private void jCheckBox112ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox112ActionPerformed
        PC_changed = true;
        changed = true;
        if (jCheckBox112.isSelected()) {
            jTextField112.setText("1");
        } else {
            jTextField112.setText("0");
        }
    }//GEN-LAST:event_jCheckBox112ActionPerformed

    private void jTextField112ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField112ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField112ActionPerformed

    private void jCheckBox113ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox113ActionPerformed
        IR_changed = true;
        changed = true;
        if (jCheckBox113.isSelected()) {
            jTextField113.setText("1");
        } else {
            jTextField113.setText("0");
        }
    }//GEN-LAST:event_jCheckBox113ActionPerformed

    private void jTextField113ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField113ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField113ActionPerformed

    private void jCheckBox114ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox114ActionPerformed
        IR_changed = true;
        changed = true;
        if (jCheckBox114.isSelected()) {
            jTextField114.setText("1");
        } else {
            jTextField114.setText("0");
        }
    }//GEN-LAST:event_jCheckBox114ActionPerformed

    private void jTextField114ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField114ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField114ActionPerformed

    private void jCheckBox115ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox115ActionPerformed
        IR_changed = true;
        changed = true;
        if (jCheckBox115.isSelected()) {
            jTextField115.setText("1");
        } else {
            jTextField115.setText("0");
        }
    }//GEN-LAST:event_jCheckBox115ActionPerformed

    private void jTextField115ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField115ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField115ActionPerformed

    private void jCheckBox116ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox116ActionPerformed
        IR_changed = true;
        changed = true;
        if (jCheckBox116.isSelected()) {
            jTextField116.setText("1");
        } else {
            jTextField116.setText("0");
        }
    }//GEN-LAST:event_jCheckBox116ActionPerformed

    private void jTextField116ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField116ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField116ActionPerformed

    private void jCheckBox117ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox117ActionPerformed
        IR_changed = true;
        changed = true;
        if (jCheckBox117.isSelected()) {
            jTextField117.setText("1");
        } else {
            jTextField117.setText("0");
        }
    }//GEN-LAST:event_jCheckBox117ActionPerformed

    private void jTextField117ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField117ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField117ActionPerformed

    private void jCheckBox118ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox118ActionPerformed
        IR_changed = true;
        changed = true;
        if (jCheckBox118.isSelected()) {
            jTextField118.setText("1");
        } else {
            jTextField118.setText("0");
        }
    }//GEN-LAST:event_jCheckBox118ActionPerformed

    private void jTextField118ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField118ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField118ActionPerformed

    private void jCheckBox119ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox119ActionPerformed
        IR_changed = true;
        changed = true;
        if (jCheckBox119.isSelected()) {
            jTextField119.setText("1");
        } else {
            jTextField119.setText("0");
        }
    }//GEN-LAST:event_jCheckBox119ActionPerformed

    private void jTextField119ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField119ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField119ActionPerformed

    private void jCheckBox120ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox120ActionPerformed
        IR_changed = true;
        changed = true;
        if (jCheckBox120.isSelected()) {
            jTextField120.setText("1");
        } else {
            jTextField120.setText("0");
        }
    }//GEN-LAST:event_jCheckBox120ActionPerformed

    private void jTextField120ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField120ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField120ActionPerformed

    private void jCheckBox121ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox121ActionPerformed
        IR_changed = true;
        changed = true;
        if (jCheckBox121.isSelected()) {
            jTextField121.setText("1");
        } else {
            jTextField121.setText("0");
        }
    }//GEN-LAST:event_jCheckBox121ActionPerformed

    private void jTextField121ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField121ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField121ActionPerformed

    private void jCheckBox122ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox122ActionPerformed
        IR_changed = true;
        changed = true;
        if (jCheckBox122.isSelected()) {
            jTextField122.setText("1");
        } else {
            jTextField122.setText("0");
        }
    }//GEN-LAST:event_jCheckBox122ActionPerformed

    private void jTextField122ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField122ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField122ActionPerformed

    private void jCheckBox123ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox123ActionPerformed
        IR_changed = true;
        changed = true;
        if (jCheckBox123.isSelected()) {
            jTextField123.setText("1");
        } else {
            jTextField123.setText("0");
        }
    }//GEN-LAST:event_jCheckBox123ActionPerformed

    private void jTextField123ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField123ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField123ActionPerformed

    private void jCheckBox124ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox124ActionPerformed
        IR_changed = true;
        changed = true;
        if (jCheckBox124.isSelected()) {
            jTextField124.setText("1");
        } else {
            jTextField124.setText("0");
        }
    }//GEN-LAST:event_jCheckBox124ActionPerformed

    private void jTextField124ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField124ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField124ActionPerformed

    private void jCheckBox125ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox125ActionPerformed
        IR_changed = true;
        changed = true;
        if (jCheckBox125.isSelected()) {
            jTextField125.setText("1");
        } else {
            jTextField125.setText("0");
        }
    }//GEN-LAST:event_jCheckBox125ActionPerformed

    private void jTextField125ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField125ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField125ActionPerformed

    private void jCheckBox126ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox126ActionPerformed
        IR_changed = true;
        changed = true;
        if (jCheckBox126.isSelected()) {
            jTextField126.setText("1");
        } else {
            jTextField126.setText("0");
        }
    }//GEN-LAST:event_jCheckBox126ActionPerformed

    private void jTextField126ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField126ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField126ActionPerformed

    private void jCheckBox127ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox127ActionPerformed
        IR_changed = true;
        changed = true;
        if (jCheckBox127.isSelected()) {
            jTextField127.setText("1");
        } else {
            jTextField127.setText("0");
        }
    }//GEN-LAST:event_jCheckBox127ActionPerformed

    private void jTextField127ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField127ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField127ActionPerformed

    private void jCheckBox128ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox128ActionPerformed
        IR_changed = true;
        changed = true;
        if (jCheckBox128.isSelected()) {
            jTextField128.setText("1");
        } else {
            jTextField128.setText("0");
        }
    }//GEN-LAST:event_jCheckBox128ActionPerformed

    private void jTextField128ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField128ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField128ActionPerformed

    private void jCheckBox129ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox129ActionPerformed
        MAR_changed = true;
        changed = true;
        if (jCheckBox129.isSelected()) {
            jTextField129.setText("1");
        } else {
            jTextField129.setText("0");
        }
    }//GEN-LAST:event_jCheckBox129ActionPerformed

    private void jTextField129ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField129ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField129ActionPerformed

    private void jCheckBox130ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox130ActionPerformed
        MAR_changed = true;
        changed = true;
        if (jCheckBox130.isSelected()) {
            jTextField130.setText("1");
        } else {
            jTextField130.setText("0");
        }
    }//GEN-LAST:event_jCheckBox130ActionPerformed

    private void jTextField130ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField130ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField130ActionPerformed

    private void jCheckBox131ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox131ActionPerformed
        MAR_changed = true;
        changed = true;
        if (jCheckBox131.isSelected()) {
            jTextField131.setText("1");
        } else {
            jTextField131.setText("0");
        }
    }//GEN-LAST:event_jCheckBox131ActionPerformed

    private void jTextField131ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField131ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField131ActionPerformed

    private void jCheckBox132ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox132ActionPerformed
        MAR_changed = true;
        changed = true;
        if (jCheckBox132.isSelected()) {
            jTextField132.setText("1");
        } else {
            jTextField132.setText("0");
        }
    }//GEN-LAST:event_jCheckBox132ActionPerformed

    private void jTextField132ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField132ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField132ActionPerformed

    private void jCheckBox133ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox133ActionPerformed
        MAR_changed = true;
        changed = true;
        if (jCheckBox133.isSelected()) {
            jTextField133.setText("1");
        } else {
            jTextField133.setText("0");
        }
    }//GEN-LAST:event_jCheckBox133ActionPerformed

    private void jTextField133ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField133ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField133ActionPerformed

    private void jCheckBox134ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox134ActionPerformed
        MAR_changed = true;
        changed = true;
        if (jCheckBox134.isSelected()) {
            jTextField134.setText("1");
        } else {
            jTextField134.setText("0");
        }
    }//GEN-LAST:event_jCheckBox134ActionPerformed

    private void jTextField134ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField134ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField134ActionPerformed

    private void jCheckBox135ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox135ActionPerformed
        MAR_changed = true;
        changed = true;
        if (jCheckBox135.isSelected()) {
            jTextField135.setText("1");
        } else {
            jTextField135.setText("0");
        }
    }//GEN-LAST:event_jCheckBox135ActionPerformed

    private void jTextField135ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField135ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField135ActionPerformed

    private void jCheckBox136ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox136ActionPerformed
        MAR_changed = true;
        changed = true;
        if (jCheckBox136.isSelected()) {
            jTextField136.setText("1");
        } else {
            jTextField136.setText("0");
        }
    }//GEN-LAST:event_jCheckBox136ActionPerformed

    private void jTextField136ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField136ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField136ActionPerformed

    private void jCheckBox137ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox137ActionPerformed
        MAR_changed = true;
        changed = true;
        if (jCheckBox137.isSelected()) {
            jTextField137.setText("1");
        } else {
            jTextField137.setText("0");
        }
    }//GEN-LAST:event_jCheckBox137ActionPerformed

    private void jTextField137ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField137ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField137ActionPerformed

    private void jCheckBox138ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox138ActionPerformed
        MAR_changed = true;
        changed = true;
        if (jCheckBox138.isSelected()) {
            jTextField138.setText("1");
        } else {
            jTextField138.setText("0");
        }
    }//GEN-LAST:event_jCheckBox138ActionPerformed

    private void jTextField138ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField138ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField138ActionPerformed

    private void jCheckBox139ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox139ActionPerformed
        MAR_changed = true;
        changed = true;
        if (jCheckBox139.isSelected()) {
            jTextField139.setText("1");
        } else {
            jTextField139.setText("0");
        }
    }//GEN-LAST:event_jCheckBox139ActionPerformed

    private void jTextField139ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField139ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField139ActionPerformed

    private void jCheckBox140ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox140ActionPerformed
        MAR_changed = true;
        changed = true;
        if (jCheckBox140.isSelected()) {
            jTextField140.setText("1");
        } else {
            jTextField140.setText("0");
        }
    }//GEN-LAST:event_jCheckBox140ActionPerformed

    private void jTextField140ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField140ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField140ActionPerformed

    private void jCheckBox141ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox141ActionPerformed
        MAR_changed = true;
        changed = true;
        if (jCheckBox141.isSelected()) {
            jTextField141.setText("1");
        } else {
            jTextField141.setText("0");
        }
    }//GEN-LAST:event_jCheckBox141ActionPerformed

    private void jTextField141ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField141ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField141ActionPerformed

    private void jCheckBox142ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox142ActionPerformed
        MAR_changed = true;
        changed = true;
        if (jCheckBox142.isSelected()) {
            jTextField142.setText("1");
        } else {
            jTextField142.setText("0");
        }
    }//GEN-LAST:event_jCheckBox142ActionPerformed

    private void jTextField142ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField142ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField142ActionPerformed

    private void jCheckBox143ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox143ActionPerformed
        MAR_changed = true;
        changed = true;
        if (jCheckBox143.isSelected()) {
            jTextField143.setText("1");
        } else {
            jTextField143.setText("0");
        }
    }//GEN-LAST:event_jCheckBox143ActionPerformed

    private void jTextField143ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField143ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField143ActionPerformed

    private void jCheckBox144ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox144ActionPerformed
        MAR_changed = true;
        changed = true;
        if (jCheckBox144.isSelected()) {
            jTextField144.setText("1");
        } else {
            jTextField144.setText("0");
        }
    }//GEN-LAST:event_jCheckBox144ActionPerformed

    private void jTextField144ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField144ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField144ActionPerformed

    private void jCheckBox145ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox145ActionPerformed
        MBR_changed = true;
        changed = true;
        if (jCheckBox145.isSelected()) {
            jTextField145.setText("1");
        } else {
            jTextField145.setText("0");
        }
    }//GEN-LAST:event_jCheckBox145ActionPerformed

    private void jTextField145ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField145ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField145ActionPerformed

    private void jCheckBox146ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox146ActionPerformed
        MBR_changed = true;
        changed = true;
        if (jCheckBox146.isSelected()) {
            jTextField146.setText("1");
        } else {
            jTextField146.setText("0");
        }
    }//GEN-LAST:event_jCheckBox146ActionPerformed

    private void jTextField146ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField146ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField146ActionPerformed

    private void jCheckBox147ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox147ActionPerformed
        MBR_changed = true;
        changed = true;
        if (jCheckBox147.isSelected()) {
            jTextField147.setText("1");
        } else {
            jTextField147.setText("0");
        }
    }//GEN-LAST:event_jCheckBox147ActionPerformed

    private void jTextField147ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField147ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField147ActionPerformed

    private void jCheckBox148ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox148ActionPerformed
        MBR_changed = true;
        changed = true;
        if (jCheckBox148.isSelected()) {
            jTextField148.setText("1");
        } else {
            jTextField148.setText("0");
        }
    }//GEN-LAST:event_jCheckBox148ActionPerformed

    private void jTextField148ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField148ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField148ActionPerformed

    private void jCheckBox149ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox149ActionPerformed
        MBR_changed = true;
        changed = true;
        if (jCheckBox149.isSelected()) {
            jTextField149.setText("1");
        } else {
            jTextField149.setText("0");
        }
    }//GEN-LAST:event_jCheckBox149ActionPerformed

    private void jTextField149ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField149ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField149ActionPerformed

    private void jCheckBox150ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox150ActionPerformed
        MBR_changed = true;
        changed = true;
        if (jCheckBox150.isSelected()) {
            jTextField150.setText("1");
        } else {
            jTextField150.setText("0");
        }
    }//GEN-LAST:event_jCheckBox150ActionPerformed

    private void jTextField150ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField150ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField150ActionPerformed

    private void jCheckBox151ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox151ActionPerformed
        MBR_changed = true;
        changed = true;
        if (jCheckBox151.isSelected()) {
            jTextField151.setText("1");
        } else {
            jTextField151.setText("0");
        }
    }//GEN-LAST:event_jCheckBox151ActionPerformed

    private void jTextField151ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField151ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField151ActionPerformed

    private void jCheckBox152ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox152ActionPerformed
        MBR_changed = true;
        changed = true;
        if (jCheckBox152.isSelected()) {
            jTextField152.setText("1");
        } else {
            jTextField152.setText("0");
        }
    }//GEN-LAST:event_jCheckBox152ActionPerformed

    private void jTextField152ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField152ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField152ActionPerformed

    private void jCheckBox153ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox153ActionPerformed
        MBR_changed = true;
        changed = true;
        if (jCheckBox153.isSelected()) {
            jTextField153.setText("1");
        } else {
            jTextField153.setText("0");
        }
    }//GEN-LAST:event_jCheckBox153ActionPerformed

    private void jTextField153ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField153ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField153ActionPerformed

    private void jCheckBox154ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox154ActionPerformed
        MBR_changed = true;
        changed = true;
        if (jCheckBox154.isSelected()) {
            jTextField154.setText("1");
        } else {
            jTextField154.setText("0");
        }
    }//GEN-LAST:event_jCheckBox154ActionPerformed

    private void jTextField154ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField154ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField154ActionPerformed

    private void jCheckBox155ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox155ActionPerformed
        MBR_changed = true;
        changed = true;
        if (jCheckBox155.isSelected()) {
            jTextField155.setText("1");
        } else {
            jTextField155.setText("0");
        }
    }//GEN-LAST:event_jCheckBox155ActionPerformed

    private void jTextField155ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField155ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField155ActionPerformed

    private void jCheckBox156ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox156ActionPerformed
        MBR_changed = true;
        changed = true;
        if (jCheckBox156.isSelected()) {
            jTextField156.setText("1");
        } else {
            jTextField156.setText("0");
        }
    }//GEN-LAST:event_jCheckBox156ActionPerformed

    private void jTextField156ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField156ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField156ActionPerformed

    private void jCheckBox157ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox157ActionPerformed
        MBR_changed = true;
        changed = true;
        if (jCheckBox157.isSelected()) {
            jTextField157.setText("1");
        } else {
            jTextField157.setText("0");
        }
    }//GEN-LAST:event_jCheckBox157ActionPerformed

    private void jTextField157ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField157ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField157ActionPerformed

    private void jCheckBox158ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox158ActionPerformed
        MBR_changed = true;
        changed = true;
        if (jCheckBox158.isSelected()) {
            jTextField158.setText("1");
        } else {
            jTextField158.setText("0");
        }
    }//GEN-LAST:event_jCheckBox158ActionPerformed

    private void jTextField158ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField158ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField158ActionPerformed

    private void jCheckBox159ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox159ActionPerformed
        MBR_changed = true;
        changed = true;
        if (jCheckBox159.isSelected()) {
            jTextField159.setText("1");
        } else {
            jTextField159.setText("0");
        }
    }//GEN-LAST:event_jCheckBox159ActionPerformed

    private void jTextField159ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField159ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField159ActionPerformed

    private void jCheckBox160ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox160ActionPerformed
        MBR_changed = true;
        changed = true;
        if (jCheckBox160.isSelected()) {
            jTextField160.setText("1");
        } else {
            jTextField160.setText("0");
        }
    }//GEN-LAST:event_jCheckBox160ActionPerformed

    private void jTextField160ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField160ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField160ActionPerformed

    private void jCheckBox161ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox161ActionPerformed
        MSR_changed = true;
        changed = true;
        if (jCheckBox161.isSelected()) {
            jTextField161.setText("1");
        } else {
            jTextField161.setText("0");
        }
    }//GEN-LAST:event_jCheckBox161ActionPerformed

    private void jTextField161ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField161ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField161ActionPerformed

    private void jCheckBox162ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox162ActionPerformed
        MSR_changed = true;
        changed = true;
        if (jCheckBox162.isSelected()) {
            jTextField162.setText("1");
        } else {
            jTextField162.setText("0");
        }
    }//GEN-LAST:event_jCheckBox162ActionPerformed

    private void jTextField162ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField162ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField162ActionPerformed

    private void jCheckBox163ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox163ActionPerformed
        MSR_changed = true;
        changed = true;
        if (jCheckBox163.isSelected()) {
            jTextField163.setText("1");
        } else {
            jTextField163.setText("0");
        }
    }//GEN-LAST:event_jCheckBox163ActionPerformed

    private void jTextField163ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField163ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField163ActionPerformed

    private void jCheckBox164ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox164ActionPerformed
        MSR_changed = true;
        changed = true;
        if (jCheckBox164.isSelected()) {
            jTextField164.setText("1");
        } else {
            jTextField164.setText("0");
        }
    }//GEN-LAST:event_jCheckBox164ActionPerformed

    private void jTextField164ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField164ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField164ActionPerformed

    private void jCheckBox165ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox165ActionPerformed
        MSR_changed = true;
        changed = true;
        if (jCheckBox165.isSelected()) {
            jTextField165.setText("1");
        } else {
            jTextField165.setText("0");
        }
    }//GEN-LAST:event_jCheckBox165ActionPerformed

    private void jTextField165ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField165ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField165ActionPerformed

    private void jCheckBox166ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox166ActionPerformed
        MSR_changed = true;
        changed = true;
        if (jCheckBox166.isSelected()) {
            jTextField166.setText("1");
        } else {
            jTextField166.setText("0");
        }
    }//GEN-LAST:event_jCheckBox166ActionPerformed

    private void jTextField166ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField166ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField166ActionPerformed

    private void jCheckBox167ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox167ActionPerformed
        MSR_changed = true;
        changed = true;
        if (jCheckBox167.isSelected()) {
            jTextField167.setText("1");
        } else {
            jTextField167.setText("0");
        }
    }//GEN-LAST:event_jCheckBox167ActionPerformed

    private void jTextField167ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField167ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField167ActionPerformed

    private void jCheckBox168ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox168ActionPerformed
        MSR_changed = true;
        changed = true;
        if (jCheckBox168.isSelected()) {
            jTextField168.setText("1");
        } else {
            jTextField168.setText("0");
        }
    }//GEN-LAST:event_jCheckBox168ActionPerformed

    private void jTextField168ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField168ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField168ActionPerformed

    private void jCheckBox169ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox169ActionPerformed
        MSR_changed = true;
        changed = true;
        if (jCheckBox169.isSelected()) {
            jTextField169.setText("1");
        } else {
            jTextField169.setText("0");
        }
    }//GEN-LAST:event_jCheckBox169ActionPerformed

    private void jTextField169ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField169ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField169ActionPerformed

    private void jCheckBox170ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox170ActionPerformed
        MSR_changed = true;
        changed = true;
        if (jCheckBox170.isSelected()) {
            jTextField170.setText("1");
        } else {
            jTextField170.setText("0");
        }
    }//GEN-LAST:event_jCheckBox170ActionPerformed

    private void jTextField170ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField170ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField170ActionPerformed

    private void jCheckBox171ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox171ActionPerformed
        MSR_changed = true;
        changed = true;
        if (jCheckBox171.isSelected()) {
            jTextField171.setText("1");
        } else {
            jTextField171.setText("0");
        }
    }//GEN-LAST:event_jCheckBox171ActionPerformed

    private void jTextField171ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField171ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField171ActionPerformed

    private void jCheckBox172ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox172ActionPerformed
        MSR_changed = true;
        changed = true;
        if (jCheckBox172.isSelected()) {
            jTextField172.setText("1");
        } else {
            jTextField172.setText("0");
        }
    }//GEN-LAST:event_jCheckBox172ActionPerformed

    private void jTextField172ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField172ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField172ActionPerformed

    private void jCheckBox173ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox173ActionPerformed
        MSR_changed = true;
        changed = true;
        if (jCheckBox173.isSelected()) {
            jTextField173.setText("1");
        } else {
            jTextField173.setText("0");
        }
    }//GEN-LAST:event_jCheckBox173ActionPerformed

    private void jTextField173ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField173ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField173ActionPerformed

    private void jCheckBox174ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox174ActionPerformed
        MSR_changed = true;
        changed = true;
        if (jCheckBox174.isSelected()) {
            jTextField174.setText("1");
        } else {
            jTextField174.setText("0");
        }
    }//GEN-LAST:event_jCheckBox174ActionPerformed

    private void jTextField174ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField174ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField174ActionPerformed

    private void jCheckBox175ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox175ActionPerformed
        MSR_changed = true;
        changed = true;
        if (jCheckBox175.isSelected()) {
            jTextField175.setText("1");
        } else {
            jTextField175.setText("0");
        }
    }//GEN-LAST:event_jCheckBox175ActionPerformed

    private void jTextField175ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField175ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField175ActionPerformed

    private void jCheckBox176ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox176ActionPerformed
        MSR_changed = true;
        changed = true;
        if (jCheckBox176.isSelected()) {
            jTextField176.setText("1");
        } else {
            jTextField176.setText("0");
        }
    }//GEN-LAST:event_jCheckBox176ActionPerformed

    private void jTextField176ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField176ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField176ActionPerformed

    private void jCheckBox177ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox177ActionPerformed
        MFR_changed = true;
        changed = true;
        if (jCheckBox177.isSelected()) {
            jTextField177.setText("1");
        } else {
            jTextField177.setText("0");
        }
    }//GEN-LAST:event_jCheckBox177ActionPerformed

    private void jTextField177ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField177ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField177ActionPerformed

    private void jCheckBox178ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox178ActionPerformed
        MFR_changed = true;
        changed = true;
        if (jCheckBox178.isSelected()) {
            jTextField178.setText("1");
        } else {
            jTextField178.setText("0");
        }
    }//GEN-LAST:event_jCheckBox178ActionPerformed

    private void jTextField178ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField178ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField178ActionPerformed

    private void jCheckBox179ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox179ActionPerformed
        MFR_changed = true;
        changed = true;
        if (jCheckBox179.isSelected()) {
            jTextField179.setText("1");
        } else {
            jTextField179.setText("0");
        }
    }//GEN-LAST:event_jCheckBox179ActionPerformed

    private void jTextField179ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField179ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField179ActionPerformed

    private void jCheckBox180ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox180ActionPerformed
        MFR_changed = true;
        changed = true;
        if (jCheckBox180.isSelected()) {
            jTextField180.setText("1");
        } else {
            jTextField180.setText("0");
        }
    }//GEN-LAST:event_jCheckBox180ActionPerformed

    private void jTextField180ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField180ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField180ActionPerformed

    private void jCheckBox181ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox181ActionPerformed
        CC_changed = true;
        changed = true;
        if (jCheckBox181.isSelected()) {
            jTextField181.setText("1");
        } else {
            jTextField181.setText("0");
        }
    }//GEN-LAST:event_jCheckBox181ActionPerformed

    private void jTextField181ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField181ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField181ActionPerformed

    private void jCheckBox182ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox182ActionPerformed
        CC_changed = true;
        changed = true;
        if (jCheckBox182.isSelected()) {
            jTextField182.setText("1");
        } else {
            jTextField182.setText("0");
        }
    }//GEN-LAST:event_jCheckBox182ActionPerformed

    private void jTextField182ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField182ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField182ActionPerformed

    private void jCheckBox183ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox183ActionPerformed
        CC_changed = true;
        changed = true;
        if (jCheckBox183.isSelected()) {
            jTextField183.setText("1");
        } else {
            jTextField183.setText("0");
        }
    }//GEN-LAST:event_jCheckBox183ActionPerformed

    private void jTextField183ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField183ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField183ActionPerformed

    private void jCheckBox184ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox184ActionPerformed
        CC_changed = true;
        changed = true;
        if (jCheckBox184.isSelected()) {
            jTextField184.setText("1");
        } else {
            jTextField184.setText("0");
        }
    }//GEN-LAST:event_jCheckBox184ActionPerformed

    private void jTextField184ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField184ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField184ActionPerformed

    private void jTextField186ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField186ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField186ActionPerformed

    private void jCheckBox186ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox186ActionPerformed
        XR_changed[0] = true;
        changed = true;
        if (jCheckBox186.isSelected()) {
            jTextField186.setText("1");
        } else {
            jTextField186.setText("0");
        }
    }//GEN-LAST:event_jCheckBox186ActionPerformed

    private void jTextField187ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField187ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField187ActionPerformed

    private void jCheckBox187ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox187ActionPerformed
        XR_changed[0] = true;
        changed = true;
        if (jCheckBox187.isSelected()) {
            jTextField187.setText("1");
        } else {
            jTextField187.setText("0");
        }
    }//GEN-LAST:event_jCheckBox187ActionPerformed

    private void jTextField188ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField188ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField188ActionPerformed

    private void jCheckBox188ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox188ActionPerformed
        XR_changed[0] = true;
        changed = true;
        if (jCheckBox188.isSelected()) {
            jTextField188.setText("1");
        } else {
            jTextField188.setText("0");
        }
    }//GEN-LAST:event_jCheckBox188ActionPerformed

    private void jTextField189ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField189ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField189ActionPerformed

    private void jCheckBox189ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox189ActionPerformed
        XR_changed[0] = true;
        changed = true;
        if (jCheckBox189.isSelected()) {
            jTextField189.setText("1");
        } else {
            jTextField189.setText("0");
        }
    }//GEN-LAST:event_jCheckBox189ActionPerformed

    private void jTextField190ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField190ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField190ActionPerformed

    private void jCheckBox190ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox190ActionPerformed
        XR_changed[1] = true;
        changed = true;
        if (jCheckBox190.isSelected()) {
            jTextField190.setText("1");
        } else {
            jTextField190.setText("0");
        }
    }//GEN-LAST:event_jCheckBox190ActionPerformed

    private void jTextField191ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField191ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField191ActionPerformed

    private void jCheckBox191ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox191ActionPerformed
        XR_changed[1] = true;
        changed = true;
        if (jCheckBox191.isSelected()) {
            jTextField191.setText("1");
        } else {
            jTextField191.setText("0");
        }
    }//GEN-LAST:event_jCheckBox191ActionPerformed

    private void jTextField192ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField192ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField192ActionPerformed

    private void jCheckBox192ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox192ActionPerformed
        XR_changed[1] = true;
        changed = true;
        if (jCheckBox192.isSelected()) {
            jTextField192.setText("1");
        } else {
            jTextField192.setText("0");
        }
    }//GEN-LAST:event_jCheckBox192ActionPerformed

    private void jTextField193ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField193ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField193ActionPerformed

    private void jCheckBox193ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox193ActionPerformed
        XR_changed[1] = true;
        changed = true;
        if (jCheckBox193.isSelected()) {
            jTextField193.setText("1");
        } else {
            jTextField193.setText("0");
        }
    }//GEN-LAST:event_jCheckBox193ActionPerformed

    private void jTextField194ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField194ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField194ActionPerformed

    private void jCheckBox194ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox194ActionPerformed
        XR_changed[2] = true;
        changed = true;
        if (jCheckBox194.isSelected()) {
            jTextField194.setText("1");
        } else {
            jTextField194.setText("0");
        }
    }//GEN-LAST:event_jCheckBox194ActionPerformed

    private void jTextField195ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField195ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField195ActionPerformed

    private void jCheckBox195ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox195ActionPerformed
        XR_changed[2] = true;
        changed = true;
        if (jCheckBox195.isSelected()) {
            jTextField195.setText("1");
        } else {
            jTextField195.setText("0");
        }
    }//GEN-LAST:event_jCheckBox195ActionPerformed

    private void jTextField196ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField196ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField196ActionPerformed

    private void jCheckBox196ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox196ActionPerformed
        XR_changed[2] = true;
        changed = true;
        if (jCheckBox196.isSelected()) {
            jTextField196.setText("1");
        } else {
            jTextField196.setText("0");
        }
    }//GEN-LAST:event_jCheckBox196ActionPerformed

    private void jTextField197ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField197ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField197ActionPerformed

    private void jCheckBox197ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox197ActionPerformed
        XR_changed[2] = true;
        changed = true;
        if (jCheckBox197.isSelected()) {
            jTextField197.setText("1");
        } else {
            jTextField197.setText("0");
        }
    }//GEN-LAST:event_jCheckBox197ActionPerformed

    private void ConsoleInputFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsoleInputFieldActionPerformed
        // TODO add your handling code here:
        userText = ConsoleInputField.getText();
        userInput = true;
        
    }//GEN-LAST:event_ConsoleInputFieldActionPerformed

    private void runButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runButtonActionPerformed
        // TODO add your handling code here:
        run = true;
    }//GEN-LAST:event_runButtonActionPerformed

    private void haltButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_haltButtonActionPerformed
        // TODO add your handling code here:
        run = false;
    }//GEN-LAST:event_haltButtonActionPerformed

    private void iplButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iplButtonActionPerformed
        // TODO add your handling code here:
        IPL = true;
    }//GEN-LAST:event_iplButtonActionPerformed

    private void singlestepButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_singlestepButtonActionPerformed
        // TODO add your handling code here:
        singleStep = true;
    }//GEN-LAST:event_singlestepButtonActionPerformed

    private void CarryC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CarryC1ActionPerformed
        Carry_changed = true;
        changed = true;
        if (CarryC1.isSelected()) {
            CarryT1.setText("1");
        } else {
            CarryT1.setText("0");
        }
    }//GEN-LAST:event_CarryC1ActionPerformed

    private void CarryT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CarryT1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CarryT1ActionPerformed

    private void SelectFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectFileButtonActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
            "TXT Files", "txt");
        chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(null);
        if(returnVal == JFileChooser.APPROVE_OPTION) {
            setFile = true;
            programFile = chooser.getSelectedFile();
//           System.out.println("You chose to open this file: " +
//                chooser.getSelectedFile().getName());
        }
        
    }//GEN-LAST:event_SelectFileButtonActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(FrontPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FrontPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FrontPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FrontPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FrontPanel(system).setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CarryC1;
    private javax.swing.JTextField CarryT1;
    private javax.swing.JTextField ConsoleInputField;
    private javax.swing.JTextArea ConsolePrinterField;
    private javax.swing.JCheckBox R1C1;
    private javax.swing.JCheckBox R1C10;
    private javax.swing.JCheckBox R1C11;
    private javax.swing.JCheckBox R1C12;
    private javax.swing.JCheckBox R1C13;
    private javax.swing.JCheckBox R1C14;
    private javax.swing.JCheckBox R1C15;
    private javax.swing.JCheckBox R1C16;
    private javax.swing.JCheckBox R1C2;
    private javax.swing.JCheckBox R1C3;
    private javax.swing.JCheckBox R1C4;
    private javax.swing.JCheckBox R1C5;
    private javax.swing.JCheckBox R1C6;
    private javax.swing.JCheckBox R1C7;
    private javax.swing.JCheckBox R1C8;
    private javax.swing.JCheckBox R1C9;
    private javax.swing.JTextField R1T1;
    private javax.swing.JTextField R1T10;
    private javax.swing.JTextField R1T11;
    private javax.swing.JTextField R1T12;
    private javax.swing.JTextField R1T13;
    private javax.swing.JTextField R1T14;
    private javax.swing.JTextField R1T15;
    private javax.swing.JTextField R1T16;
    private javax.swing.JTextField R1T2;
    private javax.swing.JTextField R1T3;
    private javax.swing.JTextField R1T4;
    private javax.swing.JTextField R1T5;
    private javax.swing.JTextField R1T6;
    private javax.swing.JTextField R1T7;
    private javax.swing.JTextField R1T8;
    private javax.swing.JTextField R1T9;
    private javax.swing.JCheckBox R2C1;
    private javax.swing.JCheckBox R2C10;
    private javax.swing.JCheckBox R2C11;
    private javax.swing.JCheckBox R2C12;
    private javax.swing.JCheckBox R2C13;
    private javax.swing.JCheckBox R2C14;
    private javax.swing.JCheckBox R2C15;
    private javax.swing.JCheckBox R2C16;
    private javax.swing.JCheckBox R2C2;
    private javax.swing.JCheckBox R2C3;
    private javax.swing.JCheckBox R2C4;
    private javax.swing.JCheckBox R2C5;
    private javax.swing.JCheckBox R2C6;
    private javax.swing.JCheckBox R2C7;
    private javax.swing.JCheckBox R2C8;
    private javax.swing.JCheckBox R2C9;
    private javax.swing.JTextField R2T1;
    private javax.swing.JTextField R2T10;
    private javax.swing.JTextField R2T11;
    private javax.swing.JTextField R2T12;
    private javax.swing.JTextField R2T13;
    private javax.swing.JTextField R2T14;
    private javax.swing.JTextField R2T15;
    private javax.swing.JTextField R2T16;
    private javax.swing.JTextField R2T2;
    private javax.swing.JTextField R2T3;
    private javax.swing.JTextField R2T4;
    private javax.swing.JTextField R2T5;
    private javax.swing.JTextField R2T6;
    private javax.swing.JTextField R2T7;
    private javax.swing.JTextField R2T8;
    private javax.swing.JTextField R2T9;
    private javax.swing.JCheckBox R3C1;
    private javax.swing.JCheckBox R3C10;
    private javax.swing.JCheckBox R3C11;
    private javax.swing.JCheckBox R3C12;
    private javax.swing.JCheckBox R3C13;
    private javax.swing.JCheckBox R3C14;
    private javax.swing.JCheckBox R3C15;
    private javax.swing.JCheckBox R3C16;
    private javax.swing.JCheckBox R3C2;
    private javax.swing.JCheckBox R3C3;
    private javax.swing.JCheckBox R3C4;
    private javax.swing.JCheckBox R3C5;
    private javax.swing.JCheckBox R3C6;
    private javax.swing.JCheckBox R3C7;
    private javax.swing.JCheckBox R3C8;
    private javax.swing.JCheckBox R3C9;
    private javax.swing.JTextField R3T1;
    private javax.swing.JTextField R3T10;
    private javax.swing.JTextField R3T11;
    private javax.swing.JTextField R3T12;
    private javax.swing.JTextField R3T13;
    private javax.swing.JTextField R3T14;
    private javax.swing.JTextField R3T15;
    private javax.swing.JTextField R3T16;
    private javax.swing.JTextField R3T2;
    private javax.swing.JTextField R3T3;
    private javax.swing.JTextField R3T4;
    private javax.swing.JTextField R3T5;
    private javax.swing.JTextField R3T6;
    private javax.swing.JTextField R3T7;
    private javax.swing.JTextField R3T8;
    private javax.swing.JTextField R3T9;
    private javax.swing.JButton SelectFileButton;
    private javax.swing.JButton haltButton;
    private javax.swing.JButton iplButton;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox100;
    private javax.swing.JCheckBox jCheckBox101;
    private javax.swing.JCheckBox jCheckBox102;
    private javax.swing.JCheckBox jCheckBox103;
    private javax.swing.JCheckBox jCheckBox104;
    private javax.swing.JCheckBox jCheckBox105;
    private javax.swing.JCheckBox jCheckBox106;
    private javax.swing.JCheckBox jCheckBox107;
    private javax.swing.JCheckBox jCheckBox108;
    private javax.swing.JCheckBox jCheckBox109;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox110;
    private javax.swing.JCheckBox jCheckBox111;
    private javax.swing.JCheckBox jCheckBox112;
    private javax.swing.JCheckBox jCheckBox113;
    private javax.swing.JCheckBox jCheckBox114;
    private javax.swing.JCheckBox jCheckBox115;
    private javax.swing.JCheckBox jCheckBox116;
    private javax.swing.JCheckBox jCheckBox117;
    private javax.swing.JCheckBox jCheckBox118;
    private javax.swing.JCheckBox jCheckBox119;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox120;
    private javax.swing.JCheckBox jCheckBox121;
    private javax.swing.JCheckBox jCheckBox122;
    private javax.swing.JCheckBox jCheckBox123;
    private javax.swing.JCheckBox jCheckBox124;
    private javax.swing.JCheckBox jCheckBox125;
    private javax.swing.JCheckBox jCheckBox126;
    private javax.swing.JCheckBox jCheckBox127;
    private javax.swing.JCheckBox jCheckBox128;
    private javax.swing.JCheckBox jCheckBox129;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox130;
    private javax.swing.JCheckBox jCheckBox131;
    private javax.swing.JCheckBox jCheckBox132;
    private javax.swing.JCheckBox jCheckBox133;
    private javax.swing.JCheckBox jCheckBox134;
    private javax.swing.JCheckBox jCheckBox135;
    private javax.swing.JCheckBox jCheckBox136;
    private javax.swing.JCheckBox jCheckBox137;
    private javax.swing.JCheckBox jCheckBox138;
    private javax.swing.JCheckBox jCheckBox139;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox140;
    private javax.swing.JCheckBox jCheckBox141;
    private javax.swing.JCheckBox jCheckBox142;
    private javax.swing.JCheckBox jCheckBox143;
    private javax.swing.JCheckBox jCheckBox144;
    private javax.swing.JCheckBox jCheckBox145;
    private javax.swing.JCheckBox jCheckBox146;
    private javax.swing.JCheckBox jCheckBox147;
    private javax.swing.JCheckBox jCheckBox148;
    private javax.swing.JCheckBox jCheckBox149;
    private javax.swing.JCheckBox jCheckBox15;
    private javax.swing.JCheckBox jCheckBox150;
    private javax.swing.JCheckBox jCheckBox151;
    private javax.swing.JCheckBox jCheckBox152;
    private javax.swing.JCheckBox jCheckBox153;
    private javax.swing.JCheckBox jCheckBox154;
    private javax.swing.JCheckBox jCheckBox155;
    private javax.swing.JCheckBox jCheckBox156;
    private javax.swing.JCheckBox jCheckBox157;
    private javax.swing.JCheckBox jCheckBox158;
    private javax.swing.JCheckBox jCheckBox159;
    private javax.swing.JCheckBox jCheckBox16;
    private javax.swing.JCheckBox jCheckBox160;
    private javax.swing.JCheckBox jCheckBox161;
    private javax.swing.JCheckBox jCheckBox162;
    private javax.swing.JCheckBox jCheckBox163;
    private javax.swing.JCheckBox jCheckBox164;
    private javax.swing.JCheckBox jCheckBox165;
    private javax.swing.JCheckBox jCheckBox166;
    private javax.swing.JCheckBox jCheckBox167;
    private javax.swing.JCheckBox jCheckBox168;
    private javax.swing.JCheckBox jCheckBox169;
    private javax.swing.JCheckBox jCheckBox170;
    private javax.swing.JCheckBox jCheckBox171;
    private javax.swing.JCheckBox jCheckBox172;
    private javax.swing.JCheckBox jCheckBox173;
    private javax.swing.JCheckBox jCheckBox174;
    private javax.swing.JCheckBox jCheckBox175;
    private javax.swing.JCheckBox jCheckBox176;
    private javax.swing.JCheckBox jCheckBox177;
    private javax.swing.JCheckBox jCheckBox178;
    private javax.swing.JCheckBox jCheckBox179;
    private javax.swing.JCheckBox jCheckBox180;
    private javax.swing.JCheckBox jCheckBox181;
    private javax.swing.JCheckBox jCheckBox182;
    private javax.swing.JCheckBox jCheckBox183;
    private javax.swing.JCheckBox jCheckBox184;
    private javax.swing.JCheckBox jCheckBox186;
    private javax.swing.JCheckBox jCheckBox187;
    private javax.swing.JCheckBox jCheckBox188;
    private javax.swing.JCheckBox jCheckBox189;
    private javax.swing.JCheckBox jCheckBox190;
    private javax.swing.JCheckBox jCheckBox191;
    private javax.swing.JCheckBox jCheckBox192;
    private javax.swing.JCheckBox jCheckBox193;
    private javax.swing.JCheckBox jCheckBox194;
    private javax.swing.JCheckBox jCheckBox195;
    private javax.swing.JCheckBox jCheckBox196;
    private javax.swing.JCheckBox jCheckBox197;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox65;
    private javax.swing.JCheckBox jCheckBox66;
    private javax.swing.JCheckBox jCheckBox67;
    private javax.swing.JCheckBox jCheckBox68;
    private javax.swing.JCheckBox jCheckBox69;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox70;
    private javax.swing.JCheckBox jCheckBox71;
    private javax.swing.JCheckBox jCheckBox72;
    private javax.swing.JCheckBox jCheckBox73;
    private javax.swing.JCheckBox jCheckBox74;
    private javax.swing.JCheckBox jCheckBox75;
    private javax.swing.JCheckBox jCheckBox76;
    private javax.swing.JCheckBox jCheckBox77;
    private javax.swing.JCheckBox jCheckBox78;
    private javax.swing.JCheckBox jCheckBox79;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox80;
    private javax.swing.JCheckBox jCheckBox81;
    private javax.swing.JCheckBox jCheckBox82;
    private javax.swing.JCheckBox jCheckBox83;
    private javax.swing.JCheckBox jCheckBox84;
    private javax.swing.JCheckBox jCheckBox85;
    private javax.swing.JCheckBox jCheckBox86;
    private javax.swing.JCheckBox jCheckBox87;
    private javax.swing.JCheckBox jCheckBox88;
    private javax.swing.JCheckBox jCheckBox89;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JCheckBox jCheckBox90;
    private javax.swing.JCheckBox jCheckBox91;
    private javax.swing.JCheckBox jCheckBox92;
    private javax.swing.JCheckBox jCheckBox93;
    private javax.swing.JCheckBox jCheckBox94;
    private javax.swing.JCheckBox jCheckBox95;
    private javax.swing.JCheckBox jCheckBox96;
    private javax.swing.JCheckBox jCheckBox97;
    private javax.swing.JCheckBox jCheckBox98;
    private javax.swing.JCheckBox jCheckBox99;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField100;
    private javax.swing.JTextField jTextField101;
    private javax.swing.JTextField jTextField102;
    private javax.swing.JTextField jTextField103;
    private javax.swing.JTextField jTextField104;
    private javax.swing.JTextField jTextField105;
    private javax.swing.JTextField jTextField106;
    private javax.swing.JTextField jTextField107;
    private javax.swing.JTextField jTextField108;
    private javax.swing.JTextField jTextField109;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField110;
    private javax.swing.JTextField jTextField111;
    private javax.swing.JTextField jTextField112;
    private javax.swing.JTextField jTextField113;
    private javax.swing.JTextField jTextField114;
    private javax.swing.JTextField jTextField115;
    private javax.swing.JTextField jTextField116;
    private javax.swing.JTextField jTextField117;
    private javax.swing.JTextField jTextField118;
    private javax.swing.JTextField jTextField119;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField120;
    private javax.swing.JTextField jTextField121;
    private javax.swing.JTextField jTextField122;
    private javax.swing.JTextField jTextField123;
    private javax.swing.JTextField jTextField124;
    private javax.swing.JTextField jTextField125;
    private javax.swing.JTextField jTextField126;
    private javax.swing.JTextField jTextField127;
    private javax.swing.JTextField jTextField128;
    private javax.swing.JTextField jTextField129;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField130;
    private javax.swing.JTextField jTextField131;
    private javax.swing.JTextField jTextField132;
    private javax.swing.JTextField jTextField133;
    private javax.swing.JTextField jTextField134;
    private javax.swing.JTextField jTextField135;
    private javax.swing.JTextField jTextField136;
    private javax.swing.JTextField jTextField137;
    private javax.swing.JTextField jTextField138;
    private javax.swing.JTextField jTextField139;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField140;
    private javax.swing.JTextField jTextField141;
    private javax.swing.JTextField jTextField142;
    private javax.swing.JTextField jTextField143;
    private javax.swing.JTextField jTextField144;
    private javax.swing.JTextField jTextField145;
    private javax.swing.JTextField jTextField146;
    private javax.swing.JTextField jTextField147;
    private javax.swing.JTextField jTextField148;
    private javax.swing.JTextField jTextField149;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField150;
    private javax.swing.JTextField jTextField151;
    private javax.swing.JTextField jTextField152;
    private javax.swing.JTextField jTextField153;
    private javax.swing.JTextField jTextField154;
    private javax.swing.JTextField jTextField155;
    private javax.swing.JTextField jTextField156;
    private javax.swing.JTextField jTextField157;
    private javax.swing.JTextField jTextField158;
    private javax.swing.JTextField jTextField159;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField160;
    private javax.swing.JTextField jTextField161;
    private javax.swing.JTextField jTextField162;
    private javax.swing.JTextField jTextField163;
    private javax.swing.JTextField jTextField164;
    private javax.swing.JTextField jTextField165;
    private javax.swing.JTextField jTextField166;
    private javax.swing.JTextField jTextField167;
    private javax.swing.JTextField jTextField168;
    private javax.swing.JTextField jTextField169;
    private javax.swing.JTextField jTextField170;
    private javax.swing.JTextField jTextField171;
    private javax.swing.JTextField jTextField172;
    private javax.swing.JTextField jTextField173;
    private javax.swing.JTextField jTextField174;
    private javax.swing.JTextField jTextField175;
    private javax.swing.JTextField jTextField176;
    private javax.swing.JTextField jTextField177;
    private javax.swing.JTextField jTextField178;
    private javax.swing.JTextField jTextField179;
    private javax.swing.JTextField jTextField180;
    private javax.swing.JTextField jTextField181;
    private javax.swing.JTextField jTextField182;
    private javax.swing.JTextField jTextField183;
    private javax.swing.JTextField jTextField184;
    private javax.swing.JTextField jTextField186;
    private javax.swing.JTextField jTextField187;
    private javax.swing.JTextField jTextField188;
    private javax.swing.JTextField jTextField189;
    private javax.swing.JTextField jTextField190;
    private javax.swing.JTextField jTextField191;
    private javax.swing.JTextField jTextField192;
    private javax.swing.JTextField jTextField193;
    private javax.swing.JTextField jTextField194;
    private javax.swing.JTextField jTextField195;
    private javax.swing.JTextField jTextField196;
    private javax.swing.JTextField jTextField197;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField65;
    private javax.swing.JTextField jTextField66;
    private javax.swing.JTextField jTextField67;
    private javax.swing.JTextField jTextField68;
    private javax.swing.JTextField jTextField69;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField70;
    private javax.swing.JTextField jTextField71;
    private javax.swing.JTextField jTextField72;
    private javax.swing.JTextField jTextField73;
    private javax.swing.JTextField jTextField74;
    private javax.swing.JTextField jTextField75;
    private javax.swing.JTextField jTextField76;
    private javax.swing.JTextField jTextField77;
    private javax.swing.JTextField jTextField78;
    private javax.swing.JTextField jTextField79;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField80;
    private javax.swing.JTextField jTextField81;
    private javax.swing.JTextField jTextField82;
    private javax.swing.JTextField jTextField83;
    private javax.swing.JTextField jTextField84;
    private javax.swing.JTextField jTextField85;
    private javax.swing.JTextField jTextField86;
    private javax.swing.JTextField jTextField87;
    private javax.swing.JTextField jTextField88;
    private javax.swing.JTextField jTextField89;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField jTextField90;
    private javax.swing.JTextField jTextField91;
    private javax.swing.JTextField jTextField92;
    private javax.swing.JTextField jTextField93;
    private javax.swing.JTextField jTextField94;
    private javax.swing.JTextField jTextField95;
    private javax.swing.JTextField jTextField96;
    private javax.swing.JTextField jTextField97;
    private javax.swing.JTextField jTextField98;
    private javax.swing.JTextField jTextField99;
    private javax.swing.JButton runButton;
    private javax.swing.JButton singlestepButton;
    // End of variables declaration//GEN-END:variables
}
