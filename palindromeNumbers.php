<?php
    class Solution {

    /**
    * @param Integer $x
    * @return Boolean
    */
        function isPalindrome($x) {
    // Integer to Convert String (strval) Function
            $str = strval($x); 
            $str1=strrev($str); 
                if($str==$str1)
                {
                    return true;
                }
                else
                {
                    return false;
                }
        }
}