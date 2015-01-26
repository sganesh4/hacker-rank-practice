'''
Created on Oct 24, 2014

@author: Sushil
'''
import itertools
N, M=map(int, input().split())
persons=[input() for i in range(N)]
teamdata=itertools.combinations(persons, 2)
teams=[]
for tuples in teamdata:
    teams.append(tuples)
topics_per_team=[bin(int(x[0],2)|int(x[1],2)) for x in teams]
max_topic_team=[topic.count('1') for topic in topics_per_team]
max_no_of_topics=max(max_topic_team)
no_of_teams_with_most_topics=max_topic_team.count(max_no_of_topics)
print(max_no_of_topics)
print(no_of_teams_with_most_topics)