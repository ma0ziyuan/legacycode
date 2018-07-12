package com.migu.legacycode.chapter21.optimized;


public class AddEmployeeCommand extends Command {
    protected byte[] getCommandChar() {
        return new byte[]{0x02};
    }

    public AddEmployeeCommand(String name, String address, String city, String state, int yearlySalary) {
        fields.add(name);
        fields.add(address);
        fields.add(city);
        fields.add(state);
        fields.add(Integer.toString(yearlySalary));
    }
}
