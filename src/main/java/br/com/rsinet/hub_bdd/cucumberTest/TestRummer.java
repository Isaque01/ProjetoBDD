package br.com.rsinet.hub_bdd.cucumberTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature"
, glue = { "br.com.rsinet.hub_bdd.stepDefinitions" },
tags = {"@Buscadeprodutos , @Buscadeprodutoerro "})
public class TestRummer {

}
