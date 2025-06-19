<h1>Java Streams Study</h1>
<p>
  Study repository focused on exploring <strong>Java Streams</strong>, showcasing a wide range of <strong>intermediate</strong> and <strong>terminal operations</strong>
  using clear, commented examples for learning purposes.
</p>
<h2>📌 Features</h2>
<ul>
  <li>Creating streams from collections, arrays, sets, and maps;</li>
  <li>Filter, map, distinct, sorted, limit, and forEach operations with Lambdas;</li>
  <li>Counting and validating elements with <code>count()</code> and <code>allMatch()</code>;</li>
  <li>Collecting stream results into lists, sets, maps, and grouping with <code>Collectors</code>;</li>
  <li>Working with <code>Optional</code> to find max/min (e.g., oldest and youngest);</li>
  <li>Filtering by gender using console input and stream logic.</li>
</ul>
<h2>🗂️ Project Structure</h2>
<ul>
  <li><code>br.com.eaugusto</code>: Contains the shared <code>Person.java</code> class used by most examples, and the <code>CreatingStreams.java</code> class for stream creation;</li>
  <li><code>br.com.eaugusto.intermediateoperations</code>: Filter, Map, Limit, Distinct, Sorted, etc;</li>
  <li><code>br.com.eaugusto.terminaloperations</code>: forEach, count, allMatch and collectors;</li>
  <li><code>br.com.eaugusto.coursetask</code>: Exercise involving filtering by gender using input, has its own <code>Person.java</code> class;</li>
</ul>
<h2>🚀 How to Run</h2>
<ol>
  <li>Clone this repository and open it in your IDE (Spring Tool Suite, Eclipse, IntelliJ);</li>
  <li>Each class has a <code>main</code> method with examples that can be run directly;</li>
  <li>Review the inline comments and Javadocs for detailed explanations of each operation.</li>
</ol>
<h2>📅 Commit Highlights</h2>
<h3>June 19, 2025</h3>
<ul>
  <li>Created filtering by gender using <code>FilterByGender</code> and the new local <code>Person</code> class specific to the new <code>coursetask</code> package.</li>
</ul>
<h3>June 18, 2025</h3>
<ul>
  <li>Added optional examples for finding youngest and oldest entries;</li>
  <li>Renamed <code>CollectExample</code> to <code>CollectExamples</code> and added Javadocs.</li>
</ul>
<h3>June 17, 2025</h3>
<ul>
  <li>Implemented various <code>Collectors</code>: toList, toSet, toMap, groupingBy, etc.;</li>
  <li>Expanded <code>Person</code> and added grouping examples.</li>
</ul>
<h3>June 16–15, 2025</h3>
<ul>
  <li>Created classes for: <code>filter</code>, <code>map</code>, <code>limit</code>, <code>distinct</code>, <code>sorted</code>, and <code>forEach</code> examples;</li>
  <li>Built helper methods to populate people and reuse logic.</li>
</ul>
<h2>🎯 Learning Goals</h2>
<ul>
  <li>Understand how Java Stream API simplifies collection processing;</li>
  <li>Practice real-world stream operations with filtering, mapping and aggregation;</li>
  <li>Apply functional programming concepts like lambdas and method references;</li>
  <li>Explore <code>Optional</code> handling for safer data retrieval.</li>
</ul>
