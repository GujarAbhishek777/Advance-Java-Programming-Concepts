package Grooming_AbhishekGujar.Multithreading;
//******Data Inconsistency*****

//1) It is problem that we face in multithreaded System.
//2)When multiple thread try to access the same resource (Object) at the same time.
//3)To solve the data inconsistency problem we will go for Synchronization.

//****Synchronisation****
//
//Synchronisation is used to avoid data inconsistency occured by interference
// of two thread on the same object.

//Disadvantages of synchronization

//1)Only one thread can access synchronised Block of an object .Therefore , if there are many other.
// Threads who has to execute same Block of the same object they go to wait for lock state.

//2)We generally come across two situations
//  i> Starvation::It describes the situation where a thread is unable to give regular access to the object and is
//                  unable to access any progress this happens when shared resources are made unavailable for very long
//                   long time by greedy threads.(High Priority Threads).This is known as starvation state.
//  ii>Dead Lock:: It describes the situation where two or more threads are unable to execute and blocked forever,
//                  waiting for each other.


public class P10DescriptioOfThreading {
}
