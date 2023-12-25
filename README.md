
# LeetCode Challenge D10

## Overview

Welcome to my LeetCode solution repository! This project addresses the coding challenge presented by [1710.  Maximum Units on a Truck](https://leetcode.com/problems/maximum-units-on-a-truck/) Below, you'll find details about the problem, my approach to solving it, and the implemented solution.

## Problem Statement

You are assigned to put some amount of boxes onto  **one truck**. You are given a 2D array  `boxTypes`, where  `boxTypes[i] = [numberOfBoxesi, numberOfUnitsPerBoxi]`:

-   `numberOfBoxesi`  is the number of boxes of type  `i`.
-   `numberOfUnitsPerBoxi`  is the number of units in each box of the type  `i`.

You are also given an integer  `truckSize`, which is the  *maximum* number of  *boxes*  that can be put on the truck. You can choose any boxes to put on the truck as long as the number of boxes does not exceed  `truckSize`.

Return  _the  maximum total number of units that can be put on the truck._


**Example**

> **Input:** boxTypes = [[1,3],[2,2],[3,1]], truckSize = 4
> 
> **Output:** 8
> 
> **Explanation:**
> 
> There are:
> - 1 box of the first type that contains 3 units.
> - 2 boxes of the second type that contain 2 units each.
> - 3 boxes of the third type that contain 1 unit each. You can take all the boxes of the first and second types, and one box of the third type. 
The total number of units will be = (1 * 3) + (2 * 2) + (1 * 1) = 8.

**Language Used**
> Java

**Difficulty**

> Easy



## Solution Overview

The algorithm begins by sorting the box types in descending order based on the number of units per box. This ensures that, at each step, boxes with the maximum units are considered first.
    
Then it iterates through the sorted array of box types. For each box type, it checks whether the available truck space allows for loading all the boxes of that type. If so, it loads all boxes of that type and updates the remaining truck space accordingly. If not, it loads only as many boxes as can fit into the remaining space.
    
The algorithm maintains a running total of the maximum units loaded onto the truck. This is calculated by multiplying the number of boxes loaded from the current type by the units per box and adding it to the running total.
    
The final result is the maximum total number of units that can be loaded onto the truck while respecting the truck's capacity.
