class RnaTranscription {

    String transcribe(String dnaStrand) {
        for(int i=0;i<dnaStrand.length();i++)
        {
            if(dnaStrand.charAt(i) == 'G')
            {
                dnaStrand = dnaStrand.substring(0,i)+'C'+dnaStrand.substring(i+1);
            } else if (dnaStrand.charAt(i) == 'C') {
                dnaStrand = dnaStrand.substring(0,i)+'G'+dnaStrand.substring(i+1);
            } else if (dnaStrand.charAt(i) == 'T') {
                dnaStrand = dnaStrand.substring(0,i)+'A'+dnaStrand.substring(i+1);
            } else if (dnaStrand.charAt(i) == 'A') {
                dnaStrand = dnaStrand.substring(0,i)+'U'+dnaStrand.substring(i+1);
            }
        }
        return  dnaStrand;
    }

}
