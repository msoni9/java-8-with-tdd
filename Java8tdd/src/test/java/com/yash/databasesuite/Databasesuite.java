package com.yash.databasesuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.yash.assignment.CalculateDateTest;
import com.yash.assignment.CapitalisedFirstAndLastLetterTest;
import com.yash.assignment.MinMaxElementTest;
import com.yash.assignment.NextNumberInTheSeriesTest;
import com.yash.assignment.SpyNumberTest;
import com.yash.assignment.SubListFromArrayListTest;
import com.yash.assignment.VowelsTest;
import com.yash.assignment.WrongNumberInTheSeriesTest;
import com.yash.assignment2.AnagramTest;
import com.yash.assignment2.CountOfcharactersTest;
import com.yash.assignment2.DoubleTonTest;
import com.yash.assignment2.LeadersTest;
import com.yash.assignment2.SecondHighestNumberTest;
import com.yash.assignment2.SingletonTest;
import com.yash.assignment2.SortedHashMapByValueTest;
import com.yash.assignment2.SumOfEvenNumberTest;

@RunWith(Suite.class)
@SuiteClasses({ CalculateDateTest.class, CapitalisedFirstAndLastLetterTest.class, MinMaxElementTest.class,
		NextNumberInTheSeriesTest.class, SpyNumberTest.class, SubListFromArrayListTest.class, VowelsTest.class,
		WrongNumberInTheSeriesTest.class, AnagramTest.class, CountOfcharactersTest.class, DoubleTonTest.class,
		LeadersTest.class, SecondHighestNumberTest.class, SingletonTest.class, SortedHashMapByValueTest.class,
		SumOfEvenNumberTest.class

})

public class Databasesuite {

}
