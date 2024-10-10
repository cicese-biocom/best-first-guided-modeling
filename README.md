# best-first-guided-modeling

Using a best-first search algorithm to guide the modeling process.

![Java 8](https://img.shields.io/badge/Java-8-blue.svg)
![Maven](https://img.shields.io/badge/Maven-3.8.8-blue.svg)
[![Build And Release](https://github.com/cicese-biocom/best-first-guided-modeling/actions/workflows/maven_release.yml/badge.svg)](https://github.com/cicese-biocom/best-first-guided-modeling/actions/workflows/maven_release.yml)

Meantime the repo is private we will get this message:

![Latest Release](https://img.shields.io/github/v/release/cicese-biocom/best-first-guided-modeling?label=latest&style=flat-square)





## Description
<div style="text-align: justify;">
A java application to guide the modeling process using a best-first search algorithm. The application uses a set of machine learning algorithms to generate models and evaluate them using a 10-cross-validation strategy with external validations. The application uses the AUC metric to evaluate the models. The application uses the Weka library to generate and evaluate the generated models.
</div>

### Execution

```bash
java -jar best-first-guided-modeling.jar -h
```
```
usage: java -jar best-first-guided-modeling.jar  [-h] [-v]
                                                 [-t <arg>] [-e <arg>] 
                                                 [-p <arg>] [-x <arg>]
                                                 [-m <arg>] [-c] 
 -c,--classification   it is a classification problem, if it is a
                       regression problem not set this option
 -e,--endpoint <arg>   activity/property target
 -h,--help             Show this help and exit
 -v,--version          show the version and exit
 -m,--models <arg>     List with the desirable strategies,
                       [KNN(C,R),RandomForest(C,R),Adaboost(C),BayesNet(C)
                       ,Gradient(C),J48(C),Logistic(C),
                       LogitBoost(C),SimpleLogistic(C), MultiBost(C),
                       NaiveBayes(C),RacedIncrementalLogitBoost(C)
                       RandomCommittee(C,R), RandomTree(C), SMO(C,R),
                       SVM(C), MultilayerPerceptron(R),
                       LinerRegression(R)], all indicates all the
                       possibles strategies
 -p,--test <arg>       input, test dataset, csv format
 -t,--train <arg>      input, train dataset, csv format
 -x,--external <arg>   input, external folder with several external
                       datasets, csv format
```

# Contributors
<a href="https://github.com/lgarciaag89">
    <img src="https://github.com/lgarciaag89.png" width="50" style="border-radius: 50%;" alt="Luis" />
</a>
<a href="https://github.com/cicese-biocom">
    <img src="https://github.com/cicese-biocom.png" width="50" style="border-radius: 50%;" alt="Cesar" />
</a>
