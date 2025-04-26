import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * An implementation of the Gibbs Sampling Stochastic Simulation method for estimating Bayesian Network probabilities with/without evidence.
 * <b>You should only modify the simulate method.</b>
 * Algorithm from Section 4.4.3 of Pearl, Judea. "Probabilistic Reasoning in Intelligent Systems"
 */

public class BNGibbsSampler {
	/** iteration frequency of progress reports */
	public static int reportFrequency = 200000;
	/** total iterations; each non-evidence variable is updated in each iteration */
	public static int iterations = 1000000;

	/**
	 * Initialize parameters, parse input, display BN information, and perform Gibbs sampling. <b>You should not modify this method</b>
	 * @param args an array of command-line arguments
	 * @throws ParseException standard input does not match grammar for Bayesian network specification. (See assignment documentation for BNF grammar.)
	 */
	public static void main(java.lang.String[] args) throws ParseException {
		// Initialize iterations and update frequency
		if (args.length > 0) {
			iterations = Integer.parseInt(args[0]);
			reportFrequency = (args.length > 1) ? Integer.parseInt(args[1]) : iterations;
		}

		// Read in belief net specification from System.in
		new BNParse(System.in).parseInput();
		BNNode.printBN();

		// Do stochastic simulation.
		simulate();
	}

	/**
	 * Perform Stochastic Simulation as described in Section 4.4.3 of Pearl, Judea. "Probabilistic Reasoning in Intelligent Systems".
	 * The enclosed file pearl.out shows the output format given the input:
	 *   java BNGibbsSampler 1000000 200000 &lt; sample.in &gt; sample.out
	 * <b>This is the only method you should modify.</b>
	 */
	public static void simulate() {

		// ***INSERT YOUR CODE HERE***

		// Compute a list of all non-evidence nodes
		ArrayList<BNNode> nonEvidenceNodes = new ArrayList<BNNode>();
		for (int i = 0; i < BNNode.nodes.size(); i++) {
			BNNode node = (BNNode) BNNode.nodes.get(i);
			if (!BNNode.nodes.get(i).isEvidence) {
				nonEvidenceNodes.add(node);
			}
		}

		// initialize the non-evidence nodes according to the cptLookup Probabilities
		for (int i = 0; i < nonEvidenceNodes.size(); i++) {
			BNNode nen = (BNNode) nonEvidenceNodes.get(i);
			nen.value = (Math.random() < nen.cptLookup());
		}

		// Initialize the counts for each non-evidence node being assigned true
		int[] counts = new int[nonEvidenceNodes.size()];

		// Initialize the probability sums for each non-evidence node
		double[] probSums = new double[nonEvidenceNodes.size()];

		// For the number of iterations
		for (int i = 0; i < iterations; i++) {
			// For each non-evidence node
			for (int j = 0; j < nonEvidenceNodes.size(); j++) {
				BNNode nen = (BNNode) nonEvidenceNodes.get(j);
				//For each nonevidence node:
				// Set the node to true and get its CPT table entry using the BNNode cptLookup method.
				nen.value = true; // Set the node to true
				// Get the CPT table entry for the node being true
				double trueProb = nen.cptLookup();


				// For each child of the node, multiply the value by the child's CPT table entry (or one minus the table entry for false children)
				for (int k = 0; k < nen.children.length; k++) {
					BNNode child = (BNNode) nen.children[k];
					trueProb *= child.value ? child.cptLookup() : (1 - child.cptLookup());
					
				}
				// Store this value as the relative likelihood of the node being true.

				
				// Repeat the process with the node set to false in order to compute the relative likelihood of the node being false.
				nen.value = false; // Set the node to false
				double falseProb = 1 - nen.cptLookup();
				for (int k = 0; k < nen.children.length; k++) {
					BNNode child = (BNNode) nen.children[k];
					falseProb *= child.value ? child.cptLookup() : (1 - child.cptLookup());
				}


				// Normalize in order to compute the probability of the node being true.  Add this for a statistical average for this node.
				double normalizingConstant = trueProb + falseProb;
				trueProb /= normalizingConstant;
				falseProb /= normalizingConstant;


				// Select a new random value for this node according to this probability.  Tally this assignment if true for future node statistics. 
				boolean newValue = Math.random() < trueProb;
				nen.value = newValue; // Set the node to the new value
				if (newValue) {
					counts[j]++; // Increment the count for the node if it is true
				}
				probSums[j] += trueProb; // Add the probability to the sum
			


			}

			// Report progress
			
			if ((i + 1) % reportFrequency == 0) {
				/* Output a report in the format:
				 * After iteration 200000:
				 * Variable, Average Conditional Probability, Fraction True
				 * a, 0.09711441342343, 0.09711441342343
				 * b, 0.09711441342343, 0.09711441342343
				 * c, 0.09711441342343, 0.09711441342343
				 */
				System.out.println("After iteration " + i + 1 + ":");
				System.out.println("Variable, Average Conditional Probability, Fraction True");
				for (int j = 0; j < nonEvidenceNodes.size(); j++) {
					BNNode nen = (BNNode) nonEvidenceNodes.get(j);
					double avgProb = probSums[j] / (i + 1);
					double fractionTrue = (double) counts[j] / (i + 1);
					System.out.println(nen.name + ", " + avgProb + ", " + fractionTrue);
				}

			}
		}

	}
}


