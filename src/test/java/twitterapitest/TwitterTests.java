package twitterapitest;

import org.testng.annotations.Test;

import org.testng.Assert;

/**
 * Below are a few sample Twitter
 * API tests.
 */

//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TwitterTests extends TwitterTestSetUp {


    @Test
    public void getRecentTweet() {
        twitter.createTweet();
        tweet = twitter.getTweet();

        Assert.assertTrue(tweet.contains("This tweet was created using rest assured"));
    }

    @Test
    public void createNewTweet () {
        twitter.createTweet();
    }


    @Test
    public void deleteExistingTweet() {
        twitter.deleteTweet();

  }










}
