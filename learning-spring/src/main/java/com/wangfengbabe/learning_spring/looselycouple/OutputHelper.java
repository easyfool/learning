package com.wangfengbabe.learning_spring.looselycouple;

/**
 * Created by wangfeng on 20/02/2017.
 */
public class OutputHelper {

  IOutputGenerator outputGenerator;

  public void generateOutput() {
    outputGenerator.generateOutput();
  }

  public void setOutputGenerator(IOutputGenerator outputGenerator) {
    this.outputGenerator = outputGenerator;
  }
}
