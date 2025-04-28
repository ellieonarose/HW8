The Honor Pledge: I affirm that I will uphold the highest principles of honesty and integrity in all my endeavors at Gettysburg College and foster an atmosphere of mutual respect within and beyond the classroom.

Group Name: Heidi Ho, Ellie Mandelberg

Name: Huynh(Heidi) Ho
Studen IDs: 614 0064

Name: Ellie Mandelberg
Student IDs: 614 0617


Part 2:

No evidence: 
Variable, Average Conditional Probability, Fraction True
B, 9.924668003374055E-4, 9.928E-4
E, 0.002001561850164083, 0.001992
A, 0.0025154754640055446, 0.0025131
J, 0.05213613499184609, 0.0521554
M, 0.01173403899806224, 0.0117373

The alarm is rare as there is no prior evidence of burglary or earthquake
John and Mary rarely call which is consistant with the alarm being rare

M:
Variable, Average Conditional Probability, Fraction True
B, 0.05617237685720724, 0.0561629
E, 0.035861878102693485, 0.0357518
A, 0.1500488509389025, 0.1500836
J, 0.17757106002162387, 0.1775753

Mary calling increases the likelihood of there having being a burglary (.0001 to .05)
It also increases the likelihood of an earthquake (.002 to .03)
It also increases the likelihood of the alarm going off (.003 to 0.15)


M + E:
Variable, Average Conditional Probability, Fraction True
B, 0.0031605818469230278, 0.0031543
A, 0.966320023147466, 0.9662778
J, 0.8713361301527643, 0.8714056

With evidence of Mary calling and there being an earthquake, the chance of there being a burglary go down because there is already a reason
as to why Mary would have called (earthquake). The chances of the alarm having gone off increase significantly because if there is an 
earthquake, we know the alarm will go off, and if Mary called, it is because the alarm went off. This also increases the chances of John 
calling because if the alarm went off, John will call. 

Part 3:
If the trial concludes that b and c are conditionally independent, that means that adding evidence of either b or c does not change the
likelihood of the other happening. If the trial concludes that b and c are not conditionally independent, that means that the evidence of 
b or c would change the chances of the other happening. 

With evidence of only a, b and c are conditionally independent. 
With evidence of only d, b and c are not conditionally independent
With evidence of only e, b and c are not conditionally independent
With evidence of a and d, b and c are not conditionally independent
With evidence of a and e, b and c are not conditionally independent, though the chances in the chances of b and c are to the thousanth place,
so one may be able to argue that the changes are slight enough to consider them conditionally independent. 
With evidence of d and e, b and c are not conditionally independent. 
With evidence of a, d, and e, b and c are not conditionally independent. 

Overall, only when there is evidence of a are b and c truly conditionally independent. 


Part 4: 
With no evidence, the likelihood of a is about .1999. With the evidence of d, the chances increase to .425. This is because if d is to happen,
something in the tree above it must have happened. This means that there is a higher chance of a happening than if we didn't know any branches
occured. 

Part 5:
All decimals are rounded to the hundreth place
With no evidence, the chance of d is .32. With false evidence of a, the chances of d decrease to .23. This is because, if we know that a didn't 
happen, and d is a descendant of a, that means there is a smaller chance that d would even be possible. Since we know that d will happen if a does, taking away the chances for a make it so d is less likely. 

Part 6:
With evidence of a coma (d), the likelihood of the patient having a brain tumor (c) is about.2 and the probability of them having increased total 
serum calcium (b) is about .8. This is because if the patient is in a coma, it is because of at least one of the two things. When there is evidence of a coma and a brain tumor, the chances of there being increased total serum calcium decreases to .5. This is because we already have a cause for the coma, and the second diagnosis is less likely. The same effect occurs if we have evidence of b. The chances of a brain tumor decrease to .125.


Part 7:
* If (a) is false (no metastatic cancer), but (d) is true (in a coma), 
  then the probability of (c) (having tumor) is 0.173943116295019, 0.1739523   

Reasoning: 
    Knowing -a → makes brain tumor less likely.
    Knowing d (coma) → needs a cause → makes brain tumor more likely to explain it.
    So the two pieces of evidence pull in opposite directions:
	-a pulls the probability of c down. 
	d pulls the probability of c up.
    P(c | -a) = 0.05 but since d is true P(c | -a, d) ≈ 0.1739
	    
    Overall, ancestor usually has more direct and stronger effect than a descendant.

* Other case when (a) is true, and (d) is false. The probability of (b) is 0.49999389717799575, 0.5001206
    Since (b) has ancestor (a) and descendant (d), 
    	a pulls the probability of b up.
   	-d pulls the probability of b down.
    P(b | a) = 0.8 but since d is false P(b | a, -d) ≈ 0.5

Part 8: 
For iteration size: 10,000:
Variable, Average Conditional Probability, Fraction True
    a, 0.0993577981651586, 0.0964
    b, 0.00933577981651391, 0.0098
    c, 0.00963999999999988, 0.0092
    d, 8.091743119266065E-4, 6.0E-4
    e, 9.79999999999998E-4, 9.0E-4
    f, 4.954128440366973E-5, 0.0
    g, 5.9999999999999995E-5, 0.0
    h, 0.0, 0.0
    i, 0.0, 0.0
    j, 0.0, 0.0
    k, 0.0, 0.0
    
For iteration: 100,000:
Variable, Average Conditional Probability, Fraction True
    a, 0.09895412844038363, 0.09859
    b, 0.009846880733946906, 0.00914
    c, 0.009859000000001556, 0.00957
    d, 9.198165137614818E-4, 0.0011
    e, 9.139999999999908E-4, 8.4E-4
    f, 1.0917431192660532E-4, 5.0E-5
    g, 1.0999999999999977E-4, 1.4E-4
    h, 4.128440366972477E-6, 0.0
    i, 5.0E-6, 2.0E-5
    j, 0.0, 0.0
    k, 0.0, 0.0

For iteration 1,000,000:
Variable, Average Conditional Probability, Fraction True
    a, 0.09988623853116604, 0.099956
    b, 0.009989027522938017, 0.010065
    c, 0.009995600000018832, 0.009773
    d, 0.0010053669724772827, 0.001022
    e, 0.0010065000000001603, 9.74E-4
    f, 1.0089908256880936E-4, 9.4E-5
    g, 1.0219999999999847E-4, 1.06E-4
    h, 7.761467889908268E-6, 1.0E-5
    i, 9.399999999999983E-6, 1.0E-5
    j, 1.0E-6, 0.0
    k, 1.0E-6, 0.0

For iteration 10,000,000: 
Variable, Average Conditional Probability, Fraction True
    a, 0.09996999998407313, 0.0999874
    b, 0.010002170642107521, 0.0099684
    c, 0.009998740000133215, 0.0100021
    d, 9.875743119267322E-4, 9.925E-4
    e, 9.968400000018734E-4, 0.0010087
    f, 9.543577981653318E-5, 8.9E-5
    g, 9.925000000001571E-5, 9.76E-5
    h, 8.541284403669846E-6, 8.1E-6
    i, 8.899999999999922E-6, 7.2E-6
    j, 8.099999999999987E-7, 6.0E-7
    k, 8.099999999999987E-7, 8.0E-7

Observation: 
    As the number of iterations increases, the average conditional probabilities and 
    fraction true values for all variables converge closer to their expected theoretical values. 
    (   P(a)~0.1, 
        P(b)~0.01, P(c)~0.01,
        P(d)~0.001, P(e)~0.001,
        P(f)~0.0001, P(g)~0.0001,
        P(h)~0.00001, P(i)~0.00001,
        P(j)~0.000001, P(k)~0.000001    )

    Gibbs sampling struggles with rare events — variables deep in the chain (like h, i, j, k) have tiny probabilities (like 0.00001 or 0.000001), 
    but in early iterations (10,000 or even 100,000), they were almost never sampled (fractions were zero or close to zero).
    • For example, in 10,000 iterations, h, i, j, k were basically never observed.
    • Even with 100,000 iterations, the fractions for j and k were still zero!
    • Only at 1 million or 10 million iterations did they start appearing at approximately the expected 
      frequency.
    
Weakness that we observed:
    • Need for massive iteration counts to correctly estimate rare parts of the distribution.
    • Slow convergence for low-probability (rare) outcomes.
    • Early samples can completely miss important parts of the probability space.

Part 9:
• How evidence of an alarm creates or eliminates conditional independence 
    between a burglary and John calling
    
    Given the structure: B -> A -> J
    -   Without evidence of A: 
            B influences A, and A influences J → B and J are dependent.
            When B is true: 
                A, 0.9404944098932593, 0.940312
                J, 0.8492652000146976, 0.849425
            and when B is false
                A, 0.001610441371106216, 0.001641
                J, 0.051394850000727466, 0.051146
    
    -   With evidence of A : 
            A is observed → path from B to J is blocked at A.
	        B and J become conditionally independent given A
            When B is true: 
                J, 0.9000000000153046, 0.89998
            and when B is false: 
                J, 0.9000000000153046, 0.899283
    
    Evidence on A D-separates Burglary and John.

• How evidence of an alarm creates or eliminates conditional independence 
    between John calling and Mary calling 
    
    Given the structure: J <- A -> M
    -   Without evidence of A:
            J and M are dependent through common cause A..
            When J is true: 
                A, 0.04344334582367383, 0.043449
                M, 0.039979809999789145, 0.039893
            and when J is false:
                A, 2.91318439907636E-4, 2.8E-4
                M, 0.010193200000172544, 0.010345
    -   With evidence of A:
            A blocks the path between J and M, J and M become conditionally independent
            When J is true:
                M, 0.6999999999944658, 0.70015
            and when J is false:
                M, 0.6999999999944658, 0.700167

    Evidence on A D-separates John and Mary.

• How evidence of an alarm and/or call(s) creates or eliminates conditional independence 
    between a burglary and an earthquake

    Given the structure: B -> A <- E
    -   Without evidence of A:
            Path between B and E is blocked → B and E are independent.
            When B is true: 
                E, 0.0019996874081165588, 0.00199
            and when B is false:
                E, 0.001996338683756528, 0.002031
    -   With evidence of A:
            Path becomes unblocked → B and E become dependent.
            When B is true:
                E, 0.0020212335907679, 0.001981
            and when B is false:
                E, 0.3675538656534436, 0.367379    
    
    Evidence on A activates dependency between Burglary and Earthquake.
