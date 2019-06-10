package com.azhen.other.creational.simplefactory;

public class BatchUtilsFactory {
    public BatchUtil getUtil(Class c) {
        BatchUtil util = null;
        try {
            util = (BatchUtil) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return util;
    }

    public BatchUtil getUtil(String type) {
        if ("fiftyBatchUtil".equalsIgnoreCase(type)) {
            return new FiftyBatchUtil();
        } else if ("tirtyBatchUtil".equalsIgnoreCase(type)) {
            return new TirtyBatchUtil();
        }

        return null;
    }
}
