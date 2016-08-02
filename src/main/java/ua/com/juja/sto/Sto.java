package ua.com.juja.sto;

/**
 * Created by asu06 on 25.05.16.
 */
public class Sto {
    private RepairBox[] repairBoxes;
    private OverPass[] overPasses;
    private Office[] offices;
    private Storage storage;

    public Sto(int countOffices, int countRepairBoxes) {
        repairBoxes = new RepairBox[countRepairBoxes];
        offices = new Office[countOffices];
        for (int i = 0; i < countRepairBoxes; i++) {
            repairBoxes[i] = new RepairBox(i + 1, 2);
        }
        for (int i = 0; i < countOffices; i++) {
            offices[i] = new Office(i + 1);
        }
        this.storage= new Storage();
    }

    public RepairBox getRbox(int index) {
        return repairBoxes[index];
    }

    public Office getOffice(int index) {
        return offices[index];
    }

    public Storage getStorage() {
        return storage;
    }


    public String toString() {
        String result = "I am STO with : \n";
        for (RepairBox repairBox : repairBoxes) {
            result += "\t"+repairBox+"\n";
        }
        for (Office office : offices) {
            result += "\t"+office+"\n";
        }
        result+= "\t"+storage+"\n";
        return result;

    }

    public void chargingStaff ( Workermen [] workermens){
        int wokerIndex = 0;
        while (true) {
            OverPass overPass = findFreeOverpass();
            int capacity = overPass.getCapacity();
            for (int i = 0; i < capacity; i++) {
                if (wokerIndex >= workermens.length) {
                    return;
                }
                overPass.addWorkerMen(workermens[wokerIndex]);
                wokerIndex++;

            }
        }
    }

    private OverPass findFreeOverpass() {
        for (RepairBox repairBox: repairBoxes){
            OverPass oPass =  repairBox.getFreeOverPass ();
            if ( oPass!= null){
                return oPass;
            }
        }
        return null;
    }
}