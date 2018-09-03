#include <iostream>
#include <vector>
#include <cstdio>

using namespace std;

vector<int> graphList[100];

class adjacencyList {
    adjacencyList::adjacencyList() {
             
    }

    adjacencyList::~adjacencyList() {
        delete graphList;
    }
};