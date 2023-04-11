<?php
class Solution {

/**
 * @param Integer[] $nums
 * @return Integer[]
 */
    function runningSum($nums) {
    $nums1 = array();
    $sum = 0;
            for($i = 0; $i<count($nums); $i++){
                $sum = $sum + $nums[$i];
                    $nums1[$i] = $sum;
            } 
                return $nums1;
    }
    }