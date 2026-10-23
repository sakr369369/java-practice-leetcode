package com.test;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class ClaimBatchProcessor {

    private final List<String> pendingClaims = new CopyOnWriteArrayList<>();




    public void addClaims(List<String> claims) {


        pendingClaims.addAll(claims);
    }

    public void processBatch() {
        for (String claimId : pendingClaims) {
            if (claimId.startsWith("ERR")) {
                pendingClaims.remove(claimId); // problem line
            } else {
                System.out.println("Processed: " + claimId);
            }
        }
    }

    public static void main(String[] args) {
        ClaimBatchProcessor proc = new ClaimBatchProcessor();
        proc.addClaims(Arrays.asList("C1", "ERR2", "C3", "ERR4", "C5"));
        proc.processBatch();
        System.out.println("Remaining: " + proc.pendingClaims);
    }
}